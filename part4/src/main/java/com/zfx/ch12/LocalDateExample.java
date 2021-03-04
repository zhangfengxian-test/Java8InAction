package com.zfx.ch12;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1949, 10, 1);
        System.out.println(date.getMonth());
        LocalDate now = LocalDate.now();
        System.out.println(now);

        date = LocalDate.parse("2021-03-02");
        System.out.println(date);
    }

}
