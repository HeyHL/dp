package io.hel.builder.improved;

/**
 * author: hel
 * date: 2021/1/1 11:25
 * description:建造者模式角色之抽象建造者
 * 划分建造产品的各个流程
 */
public abstract class HouseBuilder {
    private House house = new House();

    public House getHouse() {
        return house;
    }

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();
}
