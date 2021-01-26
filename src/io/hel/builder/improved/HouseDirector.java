package io.hel.builder.improved;

/**
 * author: hel
 * date: 2021/1/1 11:29
 * description:建造者模式角色之指挥者
 * 根据产品来调用具体建造者实现的各个流程
 */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBUilder) {
        this.houseBuilder = houseBUilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct() {
        if (houseBuilder instanceof HighBuildingBuilder) {
            System.out.println("Looking for investment for building tall buildings");
        }
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.getHouse();
    }
}
