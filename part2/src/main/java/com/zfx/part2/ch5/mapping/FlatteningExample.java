package com.zfx.part2.ch5.mapping;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatteningExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World");
        List<String> uniqueCharacters = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
        System.out.println(uniqueCharacters);
    }

    static void test() {
        List<String> words = Arrays.asList("Hello", "World");
        List<String[]> result = words.stream()
                .map(word -> word.split(""))
                .distinct()
                .collect(toList());
    }

}
