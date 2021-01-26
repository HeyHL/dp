package io.hel.factory.factorymethod;

/**
 * author: hel
 * date: 2021/1/17 20:53
 * description: 工厂方法模式
 * 角色：具体产品
 */
public class Bmw extends Car {
    @Override
    public void drive() {
        System.out.println("Bmw driving on the highway");
    }

    @Override
    public void brake() {
        System.out.println("Bmw braking on the highway");
    }
}
