package io.hel.decorator.h;

/**
 * author: hel
 * date: 2021/1/2 13:22
 * description:
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDescription("soy $0.3");
        setPrice(0.3F);
    }

    @Override
    protected float cost() {
        return super.cost();
    }
}
