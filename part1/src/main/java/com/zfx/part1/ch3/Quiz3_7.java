package com.zfx.part1.ch3;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Quiz3_7 {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, RGB> colorFactory = RGB::new;
        System.out.println(colorFactory.apply(125, 125, 125));
    }

}

@Data
@AllArgsConstructor
class RGB {
    int red;
    int green;
    int blue;
}

@FunctionalInterface
interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);

}
