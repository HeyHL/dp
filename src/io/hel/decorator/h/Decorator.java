package io.hel.decorator.h;

/**
 * author: hel
 * date: 2021/1/2 12:59
 * description: 装饰者
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "; " + obj.getDescription();
    }

    @Override
    protected float cost() {
        return super.getPrice() + obj.cost();
    }
}
