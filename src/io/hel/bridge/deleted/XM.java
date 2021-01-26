package io.hel.bridge.deleted;

/**
 * author: hel
 * date: 2021/1/2 10:28
 * description:
 */
public class XM implements Brand{
    @Override
    public void on() {
        System.out.println("Xiaomi phone turns on");
    }

    @Override
    public void off() {
        System.out.println("Xiaomi phone shuts down");
    }

    @Override
    public void call() {
        System.out.print("Call with Xiaomi mobile phone ");
    }
}
