package com.zfx.part2.ch5.primitive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {
        Stream<double[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100)
                    .boxed()
                    /*.flatMap(a -> IntStream.rangeClosed(a, 100)
                            .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                            .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}))*/
                    .flatMap(a -> IntStream.rangeClosed(a, 100)
                                    .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                                    .filter(trip -> trip[2] % 1 == 0)
                    );
        pythagoreanTriples.forEach(trip -> {
            System.out.println("(" + trip[0] + "," + trip[1] + "," + trip[2] + ")");
        });
    }

}
