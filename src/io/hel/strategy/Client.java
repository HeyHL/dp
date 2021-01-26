package io.hel.strategy;

/**
 * author: hel
 * date: 2021/1/24 18:16
 * description:
 */
public class Client {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new BikeStrategy());
        navigator.navigate("A", "B");
        navigator.setRouteStrategy(new TaxiStrategy());
        navigator.navigate("A", "B");
    }
}
