package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:20
 * description:
 */
public class Client {
    public static void main(String[] args) {
        AppliancesFactory factory = new MideaAppliancesFactory();
        AirConditioner airConditioner = factory.createAirConditioner();
        airConditioner.makeCold();
        factory = new HaierAppliancesFactory();
        Refrigerator refrigerator = factory.createRefrigerator();
        refrigerator.keepFresh();
    }
}
