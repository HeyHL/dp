package io.hel.strategy.deleted;

/**
 * author: hel
 * date: 2021/1/10 13:38
 * description:
 */
public class WildDuck extends Duck {
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void quack() {
        System.out.print("wild duck ");
        super.quack();
    }

    @Override
    public void swim() {
        System.out.print("wild duck ");
        super.swim();
    }

    @Override
    public void fly() {
        System.out.print("wild duck ");
        super.fly();
    }
}
