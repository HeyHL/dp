package io.hel.adapter.objectadapter;

/**
 * author: hel
 * date: 2021/1/1 14:17
 * description: 适配器模式-对象适配器
 * 角色：被适配角色
 * 描述：这些方法不能直接供Client使用，就如一些第三方库或者一些老系统。
 */
public class Voltage220DC {
    public int output220() {
        System.out.println("Output 220 volts DC voltage");
        return 220;
    }
}
