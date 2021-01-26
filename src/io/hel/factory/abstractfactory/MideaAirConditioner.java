package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:10
 * description:
 */
public class MideaAirConditioner extends AirConditioner {
    public MideaAirConditioner(int length, int width, int height) {
        super(length, width, height);
    }

    @Override
    public void makeCold() {
        System.out.println("Midea air-conditioner make cold");
    }

    @Override
    public void makeWarm() {
        System.out.println("Midea air-conditioner make warm");
    }
}
