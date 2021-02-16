package com.zfx.part1.ch1;

import java.util.List;

import static com.zfx.part1.ch1.Apple.EXAMPLES;
import static com.zfx.part1.ch1.Apple.filterApples;

public class Lambda {

    public static void main(String[] args) {
        List<Apple> inventory = filterApples(EXAMPLES, (Apple a) -> "green".equals(a.getColor()));
        System.out.println(inventory);
        inventory = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println(inventory);
        inventory = filterApples(inventory, (Apple a) -> a.getWeight() > 50 || "brown".equals(a.getColor()));
        System.out.println(inventory);
    }

}
