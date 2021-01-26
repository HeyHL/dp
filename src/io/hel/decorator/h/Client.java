package io.hel.decorator.h;

/**
 * author: hel
 * date: 2021/1/2 13:04
 * description:
 */
public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Milk(order);
        System.out.println(order.getDescription());
        System.out.println(order.cost());
        order = new Soy(order);
        System.out.println(order.getDescription());
        System.out.println(order.cost());
        order = new Soy(order);
        System.out.println(order.getDescription());
        System.out.println(order.cost());
    }
}
