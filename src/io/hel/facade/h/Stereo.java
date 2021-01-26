package io.hel.facade.h;

/**
 * author: hel
 * date: 2021/1/2 16:37
 * description:
 */
public class Stereo {
    private static Stereo instance = new Stereo();

    private Stereo() {

    }

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("stereo turns on");
    }

    public void off() {
        System.out.println("stereo turns off");
    }

    public void up() {
        System.out.println("stereo up");
    }

    public void down() {
        System.out.println("stereo down");
    }
}
