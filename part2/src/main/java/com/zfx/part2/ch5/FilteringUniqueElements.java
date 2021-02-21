package com.zfx.part2.ch5;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilteringUniqueElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 6, 7);
        List<Integer> result = numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .collect(toList());
        System.out.println(result);
    }

}
