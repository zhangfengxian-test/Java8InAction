package com.zfx.part1.ch3;

public class TypeAmbiguous {

    public static void main(String[] args) {
        TypeAmbiguous ta = new TypeAmbiguous();
        //Ambiguous method call.
        //ta.execute(() -> System.out.println("Hello"));
        ta.execute((Action) () -> System.out.println("Hello"));
    }

    public void execute(Runnable r) {
        r.run();
    }

    public void execute(Action a) {
        a.act();
    }

}

@FunctionalInterface
interface Action {
    void act();
}
