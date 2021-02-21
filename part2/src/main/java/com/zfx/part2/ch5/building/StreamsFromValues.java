package com.zfx.part2.ch5.building;

import java.util.stream.Stream;

public class StreamsFromValues {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Modern ", "Java ", "In ", "Action");
        stream.map(String::toUpperCase).forEach(System.out::print);

        Stream<String> emptyStream = Stream.empty();
    }

}
