package io.hel.builder.improved;

/**
 * author: hel
 * date: 2021/1/1 11:27
 * description: 建造者模式角色之具体建造者
 * 根据实际情况来实现具体的建造细节
 */
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        getHouse().setBasicDeep(5);
        System.out.println("build basic for common house");
    }

    @Override
    public void buildWalls() {
        getHouse().setWallWidth(10);
        System.out.println("build walls for common house");
    }

    @Override
    public void roofed() {
        getHouse().setRoofColor("white");
        System.out.println("roofed for common house");
    }

}
