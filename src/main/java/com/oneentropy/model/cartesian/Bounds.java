package com.oneentropy.model.cartesian;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Bounds {

    private float top;
    private float height;

    public float getTo(){
        return top-height;
    }

}
