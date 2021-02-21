package com.zfx.part2.ch5.reducing;

import com.zfx.part2.ch4.Dish;

import java.util.Arrays;
import java.util.List;

public class Quiz5_3 {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));
        menu.stream()
                .map(d -> 1)
                .reduce(0, Integer::sum);

        menu.stream().count();
    }

}
