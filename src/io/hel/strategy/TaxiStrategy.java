package io.hel.strategy;

/**
 * author: hel
 * date: 2021/1/24 18:14
 * description:
 */
public class TaxiStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.printf("build taxi route from %s to %s\n", start, end);
    }
}
