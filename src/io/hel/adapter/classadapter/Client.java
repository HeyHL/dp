package io.hel.adapter.classadapter;

/**
 * author: hel
 * date: 2021/1/1 14:24
 * description:
 */
public class Client {
    public static void main(String[] args) {
        // Client调用适配器中重写了“适配目标”角色的方法。
        int voltage = new Adapter().output5();
        if (voltage != 5)
            System.out.println("Voltage does not match and cannot be charged");
        else
            System.out.println("Charging");
    }
}
