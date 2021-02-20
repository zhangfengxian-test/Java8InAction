package com.zfx.part1.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void main(String[] args) {
        MethodReferenceExample example = new MethodReferenceExample();
        List<String> words = Arrays.asList("zhangsan", "Lisi", "zfx");
        List<String> validWords = example.filter(words, example::isValidName);
        System.out.println(validWords);

        List<String> str = Arrays.asList("a", "b", "A", "B");
        //str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        str.sort(String::compareToIgnoreCase);
        System.out.println(str);
    }

    public List<String> filter(List<String> words, Predicate<String> p) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (p.test(word)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean isValidName(String name) {
        return Character.isUpperCase(name.charAt(0));
    }

}
