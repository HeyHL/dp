package io.hel.adapter.objectadapter;


/**
 * author: hel
 * date: 2021/1/1 14:19
 * description: 适配器模式-对象适配器
 * 角色：适配器
 * 作用：组合（聚合）“被适配类”实现“适配目标”接口中的方法，完成接口转换。
 */
public class Adapter implements Voltage5AC {
    private Voltage220DC voltage220DC;

    public Adapter(Voltage220DC voltage220DC) {
        this.voltage220DC = voltage220DC;
    }

    @Override
    public int output5() {
        if (voltage220DC == null)
            throw new RuntimeException("Lack of input voltage");
        int src = voltage220DC.output220();
        // 做适配处理
        System.out.printf("Use a voltage adapter to convert %d volt AC voltage to 5 volt DC voltage\n", src);
        return 5;
    }
}
