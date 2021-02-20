package com.zfx.part1.ch3;

public class UsingLocalVariablesExample {

    public static void main(String[] args) {
        int portNumber = 8080;
        Runnable r = () -> System.out.println(portNumber);
        //portNumber = 45678;
        r.run();

    }

}
