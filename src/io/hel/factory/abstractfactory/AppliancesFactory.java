package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:15
 * description: 抽象工厂模式
 * 角色：抽象工厂
 * 作用：定义创建多类产品
 */
public interface AppliancesFactory {
    AirConditioner createAirConditioner();
    Refrigerator createRefrigerator();
}
