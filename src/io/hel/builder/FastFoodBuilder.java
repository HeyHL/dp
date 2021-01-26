package io.hel.builder;

/**
 * author: hel
 * date: 2021/1/20 11:20
 * description: 建造者模式
 * 角色：抽象建造者
 * 作用：定义构建产品所需要的各个组成部分
 */
public interface FastFoodBuilder {
    void makeBurger();

    void makeFries();

    void makeChickenWings();

    void makeChickenLeg();

    void coke();

    void iceCream();

    /**
     * 如果构建的产品属于统一产品类型，则可以将获取产品的方法定义在抽象建造者中
     * 例如：普通房屋CommonHouse和高楼大厦HighBuilding都属于房屋House
     */
    // House getResult();
}
