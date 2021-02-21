package com.zfx.part2.ch5.building;

import java.util.Arrays;

public class StreamsFromArrays {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 2, 5, 8};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }

}
