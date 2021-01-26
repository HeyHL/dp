package io.hel.factory.abstractfactory;

/**
 * author: hel
 * date: 2021/1/19 13:13
 * description:
 */
public class HaierRefrigerator extends Refrigerator {
    public HaierRefrigerator(int length, int width, int height) {
        super(length, width, height);
    }

    @Override
    public void freeze() {
        System.out.println("Haier refrigerator freeze");
    }

    @Override
    public void keepFresh() {
        System.out.println("Haier refrigerator keep fresh");
    }
}
