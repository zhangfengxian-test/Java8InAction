package com.zfx.part2.ch5.slicing;

import com.zfx.part2.ch4.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SkippingElementsExample {

    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));

        List<Dish> dishes = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .collect(toList());
        System.out.println(dishes);
    }

}
