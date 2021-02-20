package com.zfx.part1.ch3;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Quiz3_6 {

    public static void main(String[] args) {
       new Quiz3_6().test();
    }

    public void test() {
        // 1.
        ToIntFunction<String> stringToInt = (String s) -> Integer.parseInt(s);
        stringToInt = Integer::parseInt;

        // 2.
        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
        contains = List::contains;

        // 3.
        Predicate<String> startsWithNumber =
                (String string) -> this.startsWithNumber(string);
        startsWithNumber = this::startsWithNumber;
    }

    private boolean startsWithNumber(String str) {
        return Character.isDigit(str.charAt(0));
    }

}
