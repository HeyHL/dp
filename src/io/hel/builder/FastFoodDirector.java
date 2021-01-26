package io.hel.builder;

/**
 * author: hel
 * date: 2021/1/20 11:39
 * description: 建造者模式
 * 角色：指挥者
 * 作用：调用具体建造者中的方法，实现对产品的装配
 */
public class FastFoodDirector {
    // 聚合具体建造者
    private FastFoodBuilder fastFoodBuilder;

    public FastFoodDirector(FastFoodBuilder fastFoodBuilder) {
        this.fastFoodBuilder = fastFoodBuilder;
    }

    public void setFastFoodBuilder(FastFoodBuilder fastFoodBuilder) {
        this.fastFoodBuilder = fastFoodBuilder;
    }

    /**
     * 自由地调用建造者实现的方法，完成对产品的组装
     */
    public void make() {
        fastFoodBuilder.makeChickenLeg();
        fastFoodBuilder.makeChickenWings();
        fastFoodBuilder.makeBurger();
        fastFoodBuilder.coke();
    }
}
