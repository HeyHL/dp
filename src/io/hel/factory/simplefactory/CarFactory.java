package io.hel.factory.simplefactory;

/**
 * author: hel
 * date: 2021/1/17 21:13
 * description:简单工厂模式（也称静态工厂模式）
 * 角色：工厂类
 * 作用：根据调用者的输入，创建不同的产品实现
 */
public class CarFactory {
    public static Car getCar (String carName) {
        if ("Benz".equalsIgnoreCase(carName)) {
            System.out.println("do something for manufacture Benz cars");
            return new Benz();
        } else if ("Bmw".equalsIgnoreCase(carName)) {
            System.out.println("do something for manufacture BMW cars");
            return new Bmw();
        } else
            throw new RuntimeException();
    }
}
