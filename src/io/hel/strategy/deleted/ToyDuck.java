package io.hel.strategy.deleted;

/**
 * author: hel
 * date: 2021/1/10 13:40
 * description:
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void quack() {
        System.out.print("toy duck ");
        super.quack();
    }

    @Override
    public void swim() {
        System.out.print("toy duck ");
        super.swim();
    }

    @Override
    public void fly() {
        System.out.print("toy duck ");
        super.fly();
    }
}
