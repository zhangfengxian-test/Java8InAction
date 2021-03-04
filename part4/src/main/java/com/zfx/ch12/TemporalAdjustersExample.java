package com.zfx.ch12;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.*;

public class TemporalAdjustersExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2 = date.with(nextOrSame(DayOfWeek.SUNDAY));
        System.out.println(date2);
        LocalDate date3 = date.with(lastDayOfMonth());
        System.out.println(date3);

        System.out.println(date.with(new NextWorkingDay()));
    }

}
