package com.zfx.ch13;

public class Conflicts {

    public static void main(String[] args) {

    }

    interface A {
        default void hello() {
            System.out.println("Hello from A");
        }
    }

    interface B {
        default void hello() {
            System.out.println("Hello from B");
        }
    }

    static class C implements B, A {

        @Override
        public void hello() {
            A.super.hello();
        }
    }
}
