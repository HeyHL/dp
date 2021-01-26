package io.hel.strategy;

/**
 * author: hel
 * date: 2021/1/24 18:10
 * description:策略模式
 * 角色：使用环境
 */
public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate(String start, String end) {
        routeStrategy.buildRoute(start, end);
    }
}
