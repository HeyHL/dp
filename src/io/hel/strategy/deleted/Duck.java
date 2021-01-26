package io.hel.strategy.deleted;

/**
 * author: hel
 * date: 2021/1/10 13:35
 * description:
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    public void quack() {
        System.out.println("Duck quack");
    }

    public void swim() {
        System.out.println("Duck swimming");
    }

    public void fly() {
        if (flyBehavior != null)
            flyBehavior.fly();
    }
}
