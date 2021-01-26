package io.hel.decorator.h;

/**
 * author: hel
 * date: 2021/1/2 13:20
 * description:
 */
public class LongBlack extends Coffee{
    public LongBlack() {
        setDescription("long black: $3.0");
        setPrice(3.0F);
    }

    @Override
    protected float cost() {
        return super.cost();
    }
}
