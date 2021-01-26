package io.hel.facade.h;

/**
 * author: hel
 * date: 2021/1/2 16:35
 * description:
 */
public class Screen {
    private static Screen instance = new Screen();

    private Screen() {

    }

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("screen up");
    }

    public void down() {
        System.out.println("screen down");
    }
}
