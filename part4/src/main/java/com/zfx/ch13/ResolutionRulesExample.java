package com.zfx.ch13;

public class ResolutionRulesExample {

    public static void main(String[] args) {
        // Hello from B
        new C().hello();
        // Hello from B
        new E().hello();
    }

}

interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B extends A {
    default void hello() {
        System.out.println("Hello from B");
    }
}

class C implements B, A {

}

class D implements A {}
class E extends D implements B, A {}

abstract class F implements A {
    public abstract void hello();
}
class G extends F implements B, A {

    @Override
    public void hello() {

    }
}