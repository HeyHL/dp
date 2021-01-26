package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:18
 * description: 抽象工厂模式
 * 角色：具体工厂
 * 作用：负责创建同一产品族的不同产品
 */
public class HaierAppliancesFactory implements AppliancesFactory {
    @Override
    public AirConditioner createAirConditioner() {
        System.out.println("Haier appliances factory create air-condition");
        return new HaierAirConditioner(0, 1, 2);
    }

    @Override
    public Refrigerator createRefrigerator() {
        System.out.println("Haier appliances factory create refrigerators");
        return new HaierRefrigerator(0, 1, 2);
    }
}
