package com.zfx.part1.ch3;

import java.util.function.Function;

public class ComposingFunctionsExample {

    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;

        Function<Integer, Integer> m = f.andThen(g);
        System.out.println(m.apply(1));
        Function<Integer, Integer> n = f.compose(g);
        System.out.println(n.apply(1));
    }

}
