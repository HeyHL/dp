package io.hel.decorator.h;

/**
 * author: hel
 * date: 2021/1/2 13:01
 * description:
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDescription("milk: $0.2");
        setPrice(0.2F);
    }

    @Override
    protected float cost() {
        return super.cost();
    }
}
