package com.zfx.part2.ch5.building;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsFromFunctions {

    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }

}
