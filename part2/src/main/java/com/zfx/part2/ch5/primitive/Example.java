package com.zfx.part2.ch5.primitive;

import com.zfx.part2.ch4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Example {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));

        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println(calories);

        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        System.out.println(maxCalories.orElse(0));
    }

}
