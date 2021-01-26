package io.hel.decorator.h;

/**
 * author: hel
 * date: 2021/1/2 12:56
 * description:
 */
public class ShortBlack extends Coffee {
    public ShortBlack() {
        setDescription("short black: $2.0");
        setPrice(2.0F);
    }

    @Override
    protected float cost() {
        return super.cost();
    }
}
