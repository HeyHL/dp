package io.hel.strategy;

/**
 * author: hel
 * date: 2021/1/24 18:13
 * description:策略模式
 * 角色：具体策略
 * 描述：实现策略接口中的业务处理
 */
public class BikeStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.printf("build bike route from %s to %s\n", start, end);
    }
}
