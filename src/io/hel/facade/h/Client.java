package io.hel.facade.h;

/**
 * author: hel
 * date: 2021/1/2 16:47
 * description:
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.ready();
        homeTheater.play();
    }
}
