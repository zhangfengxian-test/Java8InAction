package com.zfx.ch12;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(22, 21, 10);
        int hour = time.getHour();
        System.out.println(hour);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        time = LocalTime.parse("03:02:01");
        System.out.println(time);
    }

}
