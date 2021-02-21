package com.zfx.part2.ch5.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz5_2 {

    public static void main(String[] args) {
        // 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(result);

        // 2
        List<Integer> left = Arrays.asList(1, 2, 3);
        List<Integer> right = Arrays.asList(3, 4);
        List<int[]> pairedNumbers = left.stream()
                .flatMap(n1 -> right.stream()
                            .map(n2 -> new int[]{n1, n2})
                )
                .collect(Collectors.toList());
        System.out.println(pairedNumbers);

        // 3
        List<int[]> pairedNumbers2 = left.stream()
                .flatMap(n1 -> right.stream()
                                    .filter(n2 -> (n1 + n2) % 3 == 0)
                                    .map(n2 -> new int[]{n1, n2})
                )
                .collect(Collectors.toList());
        System.out.println(pairedNumbers2);
    }

}
