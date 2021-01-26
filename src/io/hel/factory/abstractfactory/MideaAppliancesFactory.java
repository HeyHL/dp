package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:16
 * description:
 */
public class MideaAppliancesFactory implements AppliancesFactory {
    @Override
    public AirConditioner createAirConditioner() {
        System.out.println("Midea appliances factory create air-conditioner");
        return new MideaAirConditioner(0, 1, 2);
    }

    @Override
    public Refrigerator createRefrigerator() {
        System.out.println("Midea appliances factory create refrigerators");
        return new MideaRefrigerator(0, 1, 2);
    }
}
