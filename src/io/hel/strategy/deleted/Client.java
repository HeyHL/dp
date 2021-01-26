package io.hel.strategy.deleted;

/**
 * author: hel
 * date: 2021/1/10 13:41
 * description:
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
    }
}
