package io.hel.factory.factorymethod;

/**
 * author: hel
 * date: 2021/1/17 20:42
 * description: 工厂方法模式
 * 角色：抽象产品
 */
public abstract class Car {

    private String brand;
    private String color;

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void drive();

    public abstract void brake();
}
