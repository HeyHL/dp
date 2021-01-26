package io.hel.factory.factorymethod;

/**
 * author: hel
 * date: 2021/1/17 20:51
 * description:
 */
public class Benz extends Car {
    @Override
    public void drive() {
        System.out.println("Benz driving on the highway");
    }

    @Override
    public void brake() {
        System.out.println("Benz braking on the highway");
    }
}
