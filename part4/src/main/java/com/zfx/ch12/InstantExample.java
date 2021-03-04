package com.zfx.ch12;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantExample {

    public static void main(String[] args) {
        Instant.ofEpochSecond(3);
        Instant.ofEpochSecond(3, 0);
        Instant.ofEpochSecond(2, 1_000_000_000);
        Instant.ofEpochSecond(4, -1_000_000_000);

        int day = Instant.now().get(ChronoField.DAY_OF_MONTH);
    }

}
