package io.hel.strategy.deleted;

/**
 * author: hel
 * date: 2021/1/10 13:32
 * description:
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" can't fly");
    }
}
