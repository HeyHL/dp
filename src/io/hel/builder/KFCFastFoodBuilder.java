package io.hel.builder;

/**
 * author: hel
 * date: 2021/1/20 11:27
 * description: 建造者模式
 * 角色：具体建造者
 * 作用：实现抽象建造者中定义的方法，完成对特定产品各个组成部分的实现，大部分情况下，还会提供一个获取产品对象的方法。
 */
public class KFCFastFoodBuilder implements FastFoodBuilder {
    // 依赖特定的产品对象
    private KFCMealSeries kfcMealSeries = new KFCMealSeries();
    @Override
    public void makeBurger() {
        System.out.println("kfc builder make burger");
    }

    @Override
    public void makeFries() {
        // 完成产品组成部分的创建
        System.out.println("kfc builder make fries");
    }

    @Override
    public void makeChickenWings() {
        System.out.println("kfc builder make chicken wings");
    }

    @Override
    public void makeChickenLeg() {
        System.out.println("kfc builder make chicken leg");
    }

    @Override
    public void coke() {
        System.out.println("kfc builder make coke");
    }

    @Override
    public void iceCream() {
        System.out.println("kfc builder make ice cream");
    }

    /**
     * 返回产品对象
     */
    public KFCMealSeries getResult() {
        kfcMealSeries.setPrice(10.2F);
        return kfcMealSeries;
    }
}
