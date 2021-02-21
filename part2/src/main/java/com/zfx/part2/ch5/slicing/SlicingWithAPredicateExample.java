package com.zfx.part2.ch5.slicing;

import com.zfx.part2.ch4.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SlicingWithAPredicateExample {

    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));

        // filter
        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(filteredMenu);

        // takeWhile
        List<Dish> slicedMenu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(slicedMenu1);

        // dropWhile
        List<Dish> slicedMenu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(slicedMenu2);
    }

}
