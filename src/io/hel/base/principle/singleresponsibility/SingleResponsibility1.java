package io.hel.base.principle.singleresponsibility;

/**
 * author: hel
 * date: 2020/12/27 15:35
 * description: 违背单一职责原则
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("motor");
        vehicle.run("car");
        vehicle.run("airplane");
    }
}
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行...");
    }
}