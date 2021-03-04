package com.zfx.ch13;

public class Quiz13_3 {

    public interface A {
        default Number getNumber(){
            return 10;
        }
    }

    public interface B{
        default Integer getNumber(){
            return 42;
        }
    }

    public static class C implements B, A {
        public static void main(String... args) {
            System.out.println(new C().getNumber());
        }

        @Override
        public Integer getNumber() {
            return B.super.getNumber();
        }
    }
}
