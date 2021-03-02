package com.zfx.part2.ch5.collector;

import java.util.List;
import java.util.stream.IntStream;

public class Example {

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 10).boxed()
                .collect(new ToListCollector<>());
        System.out.println(numbers);
    }

}
