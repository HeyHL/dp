package io.hel.adapter.objectadapter;

/**
 * author: hel
 * date: 2021/1/1 14:53
 * description:
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Voltage220DC());
        int result = adapter.output5();
        System.out.println(result);
    }
}
