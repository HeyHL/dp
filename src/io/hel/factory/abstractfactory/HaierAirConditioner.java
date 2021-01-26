package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:12
 * description: 抽象工厂模式
 * 角色：具体产品
 */
public class HaierAirConditioner extends AirConditioner {
    public HaierAirConditioner(int length, int width, int height) {
        super(length, width, height);
    }

    @Override
    public void makeCold() {
        System.out.println("Haier air-conditioner make cold");
    }

    @Override
    public void makeWarm() {
        System.out.println("Haier air-conditioner make warm");
    }
}
