package io.hel.facade.h;

/**
 * author: hel
 * date: 2021/1/2 16:33
 * description:
 */
public class Projector {
    private static Projector instance = new Projector();

    private Projector() {

    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("projector turns on");
    }

    public void off() {
        System.out.println("projector turns off");
    }
}
