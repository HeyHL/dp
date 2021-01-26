package io.hel.facade.h;

/**
 * author: hel
 * date: 2021/1/2 16:32
 * description:
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    private Popcorn() {

    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("popcorn turns on");
    }

    public void off() {
        System.out.println("popcorn turns off");
    }

    public void pop() {
        System.out.println("popping");
    }
}
