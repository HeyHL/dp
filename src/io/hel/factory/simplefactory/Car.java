package io.hel.factory.simplefactory;

/**
 * author: hel
 * date: 2021/1/17 19:54
 * description: 简单工厂模式
 * 角色：抽象产品
 * 作用：定义产品的基本属性与行为
 */
public abstract class Car {
    private String price;

    public Car() {
    }

    public Car(String price) {
        this.price = price;
    }

    public abstract void drive();
}
