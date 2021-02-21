package com.zfx.part2.ch5.building;

import java.util.stream.Stream;

public class Quiz5_4 {

    public static void main(String[] args) {
        Stream.iterate(new int[] {0, 1},
                tuple -> new int[] {tuple[1], tuple[0] + tuple[1]})
                .limit(10)
                .forEach(tuple -> System.out.println("(" + tuple[0] + "," + tuple[1] + ")"));
        System.out.println("-----------------");
        Stream.iterate(new int[] {0, 1},
                tuple -> new int[] {tuple[1], tuple[0] + tuple[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);
    }

}
