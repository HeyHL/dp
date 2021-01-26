package io.hel.builder;

/**
 * author: hel
 * date: 2021/1/20 11:31
 * description: 建造者模式
 * 角色：产品
 * 作用：被具体建造者依赖
 */
public class KFCMealSeries {
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "KFCMealSeries{" +
                "price=" + price +
                '}';
    }
}
