package com.zfx.part1.ch3;

import com.zfx.part1.ch1.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesExample {

    public static void main(String[] args) {
        Supplier<Apple> c1 = Apple::new;
        Apple a1 = c1.get();
        System.out.println(a1);

        // equivalent
        /*Supplier<Apple> c1 = () -> new Apple();
        System.out.println(c1.get());*/

        Function<Integer, Apple> c2 = Apple::new;
        Apple a2 = c2.apply(10);
        System.out.println(a2);

        // equivalent
        /*Function<Integer, Apple> c2 = weight -> new Apple(weight);
        Apple a2 = c2.apply(10);
        System.out.println(a2);*/

        List<Integer> weights = Arrays.asList(10, 20, 30, 40);
        List<Apple> apples = map(weights, Apple::new);
        System.out.println(apples);
    }

    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for(Integer i: list) {
            result.add(f.apply(i));
        }
        return result;
    }

}
