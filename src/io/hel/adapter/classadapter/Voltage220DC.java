package io.hel.adapter.classadapter;

/**
 * author: hel
 * date: 2021/1/1 14:17
 * description: 适配器模式-类适配器
 * 角色：被适配角色
 * 描述：该接口不能适用于Client，需要适配。
 */
public class Voltage220DC {
    public int output220() {
        System.out.println("Output 220 volts DC voltage");
        return 220;
    }
}
