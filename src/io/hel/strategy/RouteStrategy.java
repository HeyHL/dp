package io.hel.strategy;

/**
 * author: hel
 * date: 2021/1/24 18:11
 * description:策略模式
 * 角色：策略接口
 * 描述：定义业务处理接口
 */
public interface RouteStrategy {
    void buildRoute(String start, String end);
}
