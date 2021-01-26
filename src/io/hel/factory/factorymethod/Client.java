package io.hel.factory.factorymethod;

/**
 * author: hel
 * date: 2021/1/17 21:00
 * description:
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new BenzFactory();
        Car benz = factory.getCar();
        benz.drive();
        benz.brake();
    }
}
