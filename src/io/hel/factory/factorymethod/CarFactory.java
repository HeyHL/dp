package io.hel.factory.factorymethod;

/**
 * author: hel
 * date: 2021/1/17 20:46
 * description: 工厂方法模式
 * 角色：抽象工厂
 * 作用：定义生产产品的方法，交由具体工厂实现
 */
public interface CarFactory {
    void buildEngine();
    void assemble();
    Car getCar();
}
