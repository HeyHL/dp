package io.hel.strategy.deleted;

/**
 * author: hel
 * date: 2021/1/10 13:34
 * description:
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" have poor flying ability");
    }
}
