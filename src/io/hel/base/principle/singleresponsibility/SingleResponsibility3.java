package io.hel.base.principle.singleresponsibility;

/**
 * author: hel
 * date: 2020/12/27 15:43
 * description:
 * 只有类中方法数量足够少，可以在方法级别上保持单一职责原则
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("motor");
        vehicle2.runAir("airplane");
        vehicle2.runWater("boat");
    }
}

/**
 * 在类级别上并没有完全遵守单一职责原则
 */
class Vehicle2 {
    public void runRoad(String roadVehicle) {
        System.out.println(roadVehicle + " 在公路上运行");
    }
    public void runAir(String airVehicle) {
        System.out.println(airVehicle + " 在空中运行");
    }
    public void runWater(String waterVehicle) {
        System.out.println(waterVehicle + " 在水中运行");
    }
}
