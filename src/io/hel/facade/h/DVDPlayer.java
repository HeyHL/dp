package io.hel.facade.h;

/**
 * author: hel
 * date: 2021/1/2 16:29
 * description:
 */
public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd player turns on");
    }

    public void off() {
        System.out.println("dvd player turns off");
    }

    public void pause() {
        System.out.println("dvd player is paused");
    }

    public void play() {
        System.out.println("dvd player is playing");
    }
}
