package com.zfx.part2.ch7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamsExample {

    public static void main(String[] args) {
        System.out.println(sequentialSum(10000000));
        System.out.println(parallelSum(10000000));
    }

    static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                    .limit(n)
                    .reduce(0L, Long::sum);
    }

    static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    static long iterativeSum(long n) {
        long sum = 0L;
        for (long i = 1L; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
