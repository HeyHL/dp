package io.hel.templatemethod;

/**
 * author: hel
 * date: 2021/1/3 12:07
 * description:
 */
public class Client {
    public static void main(String[] args) {
        GrindDrinks coffee = new Coffee();
//        coffee.make();
        coffee = new PeanutSoyMilk();
        coffee.make();
    }
}
