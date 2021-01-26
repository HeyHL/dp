package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:08
 * description:
 */
public class MideaRefrigerator extends Refrigerator {
    public MideaRefrigerator(int length, int width, int height) {
        super(length, width, height);
    }

    @Override
    public void freeze() {
        System.out.println("MideaRefrigerator.freeze");
    }

    @Override
    public void keepFresh() {
        System.out.println("MideaRefrigerator.keepFresh");
    }
}
