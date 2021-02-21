package com.zfx.part1.ch3;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

public class IntegrationExample {

    public static void main(String[] args) {
        double result = integrate((double x) -> x + 10, 3, 7);
        System.out.println(result);
        result = integrate(C::f, 3, 7);
        System.out.println(result);
        result = integrate((double x) -> f(x), 3, 7);
        System.out.println(result);
    }

    static double f(double x) {
        return x + 10;
    }

    public static double integrate(DoubleFunction<Double> f, double a, double b) {
        return (f.apply(a) + f.apply(b)) * (b - a) / 2.0;
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        return (f.applyAsDouble(a) + f.applyAsDouble(b)) * (b - a) / 2.0;
    }

}

class C {

    static double f(double x) {
        return x + 10;
    }

}