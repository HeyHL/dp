package io.hel.facade.h;

/**
 * author: hel
 * date: 2021/1/2 16:39
 * description:
 */
public class Light {
    private static Light instance = new Light();

    private Light() {

    }

    public static Light getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("light turns on");
    }

    public void off() {
        System.out.println("light turns off");
    }

    public void dim() {
        System.out.println("light dims");
    }

    public void bright() {
        System.out.println("light bright");
    }
}
