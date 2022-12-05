package com.oneentropy.model.cartesian;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OffsetProvider {

    private float xOffset;
    private float yOffset;


    public void incrementXBy(float value){
        this.xOffset+=value;
    }

    public void incrementYBy(float value) {
        this.yOffset += value;
    }
}
