package io.hel.bridge.deleted;

/**
 * author: hel
 * date: 2021/1/2 10:30
 * description:
 */
public class HW implements Brand{
    @Override
    public void on() {
        System.out.println("HUAWEI phone turns on");
    }

    @Override
    public void off() {
        System.out.println("HUAWEI phone shuts down");
    }

    @Override
    public void call() {
        System.out.print("Call with HUAWEI mobile phone ");
    }
}
