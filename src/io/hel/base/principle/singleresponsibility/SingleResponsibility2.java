package io.hel.base.principle.singleresponsibility;

/**
 * author: hel
 * date: 2020/12/27 15:39
 * description: 单一职责原则
 * 一个类只负责一项职责
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("motor");
        roadVehicle.run("bus");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("airplane");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("boat");
    }
}

/**
 * 改动成本较大
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行");
    }
}
class AirVehicle {
    public void run(String airVehicle) {
        System.out.println(airVehicle + " 在天空中运行");
    }
}
class WaterVehicle {
    public void run (String waterVehicle) {
        System.out.println(waterVehicle + " 在水中运行");
    }
}