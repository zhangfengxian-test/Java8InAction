package com.zfx.part1.ch1;

import java.util.ArrayList;
import java.util.List;

import static com.zfx.part1.ch1.Apple.EXAMPLES;
import static com.zfx.part1.ch1.Apple.filterApples;

public class PassingCode {

    public static void main(String[] args) {

        // by static method
        /*List<Apple> inventory = filterGreenApples(EXAMPLES);
        System.out.println(inventory);
        inventory = filterHeavyApples(inventory);
        System.out.println(inventory);*/

        // by passing method
        List<Apple> inventory = filterApples(EXAMPLES, Apple::isGreenApple);
        System.out.println(inventory);
        inventory = filterApples(inventory, Apple::isHeavyApple);
        System.out.println(inventory);

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }
}
