package com.zfx.part1.ch1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple {

    static final List<Apple> EXAMPLES = Arrays.asList(new Apple("green", 100), new Apple("red", 200),
            new Apple("red", 100), new Apple("green", 300));

    private String color;
    private int weight;

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public interface Predicate<T> {
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    static <T> Collection<T> filter(Collection<T> c, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : c) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

}
