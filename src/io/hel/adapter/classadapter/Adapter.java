package io.hel.adapter.classadapter;

/**
 * author: hel
 * date: 2021/1/1 14:19
 * description: 适配器模式-类适配器
 * 角色：适配器角色
 * 作用：将“被适配角色”中不兼容的接口转成“适配目标角色”中的接口
 */
public class Adapter extends Voltage220DC implements Voltage5AC {
    @Override
    public int output5() {
        int src = output220();
        // 处理适配逻辑
        System.out.printf("Use a voltage adapter to convert %d volt AC voltage to 5 volt DC voltage\n", src);
        return 5;
    }
}
