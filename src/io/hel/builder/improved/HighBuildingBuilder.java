package io.hel.builder.improved;

/**
 * author: hel
 * date: 2021/1/1 11:28
 * description:
 */
public class HighBuildingBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        getHouse().setBasicDeep(100);
        System.out.println("build basic for high building");
    }

    @Override
    public void buildWalls() {
        getHouse().setWallWidth(50);
        System.out.println("build walls for high building");
    }

    @Override
    public void roofed() {
        getHouse().setRoofColor("orange");
        System.out.println("roofed for high building");
    }
}
