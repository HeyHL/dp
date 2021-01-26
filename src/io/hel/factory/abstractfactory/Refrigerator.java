package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:00
 * description:
 */
public abstract class Refrigerator {
    private int length;
    private int width;
    private int height;

    public Refrigerator(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public abstract void freeze();

    public abstract void keepFresh();
}
