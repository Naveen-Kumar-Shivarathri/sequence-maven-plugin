package com.oneentropy.model;

import lombok.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Component {

    private static final String COLOR_HEX_REGX = "#(\\[a-f0-9]{6})";

    private static final Pattern PATTERN = Pattern.compile(COLOR_HEX_REGX);

    private String type;
    private String colorHex;
    private String className;
    private String methodName;
    private String request;
    private String response;
    private Direction direction;
    private String description;
    private Shape shape;
    private List<Component> componentList;

    public int getColorValue() {

        if (this.colorHex == null)
            return -1;
        Matcher matcher = PATTERN.matcher(this.colorHex);
        if (matcher.matches()) {
            return Integer.decode(matcher.group(1));
        }

        return -1;
    }


}
