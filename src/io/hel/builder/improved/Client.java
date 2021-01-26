package io.hel.builder.improved;

/**
 * author: hel
 * date: 2021/1/1 11:32
 * description:
 */
public class Client {
    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        System.out.println("starting build common house");
        House commonHouse = houseDirector.construct();
        System.out.printf("common house's basic deep is: %d m\n", commonHouse.getBasicDeep());
        System.out.printf("common house's wall width is: %d cm\n", commonHouse.getWallWidth());
        System.out.printf("common house's roof color is: %s\n\n", commonHouse.getRoofColor());

        HighBuildingBuilder highBuildingBuilder = new HighBuildingBuilder();
        houseDirector.setHouseBuilder(highBuildingBuilder);
        System.out.println("starting build high building");
        House highBuilding = houseDirector.construct();
        System.out.printf("high building's basic deep is: %d m\n", highBuilding.getBasicDeep());
        System.out.printf("high building's wall width is: %d cm\n", highBuilding.getWallWidth());
        System.out.printf("high building's roof color is: %s\n", highBuilding.getRoofColor());
    }
}
