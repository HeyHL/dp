package io.hel.factory.simplefactory;

/**
 * author: hel
 * date: 2021/1/17 19:54
 * description: 简单工厂模式
 * 角色：具体产品
 * 作用：实现抽象产品中定义的基本行为
 */
public class Benz extends Car {
    @Override
    public void drive() {
        System.out.println("Driving Benz");
    }
}
