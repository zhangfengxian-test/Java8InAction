package com.zfx.part2.ch5.performance;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class PrimeExample {

    public static void main(String[] args) {
        System.out.println(partitionPrimesWithCustomCollector(100));
    }

    public static Map<Boolean, List<Integer>> partitionPrimesWithCustomCollector(int n) {
        return IntStream.range(2, n).boxed()
                .collect(new PrimeNumbersCollector());
    }

}
