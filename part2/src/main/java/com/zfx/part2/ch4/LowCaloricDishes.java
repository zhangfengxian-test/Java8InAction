package com.zfx.part2.ch4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class LowCaloricDishes {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
        //printLowCaloricDishes(menu);
        printLowCaloricDishesWithStreams(menu);
    }

    static void printLowCaloricDishesWithStreams(List<Dish> menu) {
        List<String> lowCaloricDishesName =
            //menu.stream()
            menu.parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
        System.out.println(lowCaloricDishesName);
    }

    static void printLowCaloricDishes(List<Dish> menu) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for(Dish dish: menu) {
            if(dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish dish1, Dish dish2) {
                return Integer.compare(dish1.getCalories(), dish2.getCalories());
            }
        });
        List<String> lowCaloricDishesName = new ArrayList<>();
        for(Dish dish: lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
        }
        System.out.println(lowCaloricDishesName);
    }

}

