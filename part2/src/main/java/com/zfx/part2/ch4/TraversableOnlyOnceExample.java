package com.zfx.part2.ch4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TraversableOnlyOnceExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);
    }

}
