package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:05
 * description: 抽象工厂模式
 * 角色：抽象产品
 */
public abstract class AirConditioner {
    private int length;
    private int width;
    private int height;

    public AirConditioner(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public abstract void makeCold();

    public abstract void makeWarm();
}
