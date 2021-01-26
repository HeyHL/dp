package io.hel.factory.factorymethod;

/**
 * author: hel
 * date: 2021/1/17 20:55
 * description: 工厂方法模式
 * 角色：具体工厂
 * 作用：根据抽象工厂的定义，实现生产某一个具体产品的方法。
 */
public class BenzFactory implements CarFactory {
    @Override
    public void buildEngine() {
        System.out.println("Manufacture the engine of a Mercedes-Benz car");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble Mercedes-Benz cars");
    }

    @Override
    public Car getCar() {
        buildEngine();
        assemble();
        return new Benz();
    }
}
