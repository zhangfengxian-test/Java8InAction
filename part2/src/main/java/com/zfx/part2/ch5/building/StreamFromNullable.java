package com.zfx.part2.ch5.building;

import java.util.stream.Stream;

public class StreamFromNullable {

    public static void main(String[] args) {
        Stream<String> homeValueStream = Stream.ofNullable(System.getProperty("home"));
        Stream<String> values = Stream.of("home", "config", "user")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
    }

}
