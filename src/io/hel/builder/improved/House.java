package io.hel.builder.improved;

/**
 * author: hel
 * date: 2021/1/1 11:24
 * description: 建造者模式角色之产品
 * 定义产品的基本属性
 */
public class House {
    private int basicDeep;
    private int wallWidth;
    private String roofColor;

    public House() {
    }

    public int getBasicDeep() {
        return basicDeep;
    }

    public void setBasicDeep(int basicDeep) {
        this.basicDeep = basicDeep;
    }

    public int getWallWidth() {
        return wallWidth;
    }

    public void setWallWidth(int wallWidth) {
        this.wallWidth = wallWidth;
    }

    public String getRoofColor() {
        return roofColor;
    }

    public void setRoofColor(String roofColor) {
        this.roofColor = roofColor;
    }
}
