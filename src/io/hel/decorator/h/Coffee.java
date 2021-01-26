package io.hel.decorator.h;

/**
 * author: hel
 * date: 2021/1/2 12:55
 * description:
 */
public class Coffee extends Drink {

    @Override
    protected float cost() {
        return super.getPrice();
    }
}
