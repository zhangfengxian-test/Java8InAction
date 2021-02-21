package com.zfx.part2.ch5.primitive;

import java.util.stream.IntStream;

public class NumericRanges {

    public static void main(String[] args) {
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(num -> num % 2 == 0);
        System.out.println(evenNumbers.count());
    }

}
