package io.hel.observer;

/**
 * author: hel
 * date: 2021/1/9 16:27
 * description:观察者模式
 * 角色：抽象观察者
 * 描述：声明了通知接口。 在绝大多数情况下， 该接口仅包含一个 update更新方法。 该方法可以拥有多个参数， 使发布者能在更新时传递事件的详细信息。
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
