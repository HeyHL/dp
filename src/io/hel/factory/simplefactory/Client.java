package io.hel.factory.simplefactory;

/**
 * author: hel
 * date: 2021/1/17 21:16
 * description:
 */
public class Client {
    public static void main(String[] args) {
        Car benz = CarFactory.getCar("benz");
        benz.drive();

    }
}
