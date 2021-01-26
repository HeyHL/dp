package io.hel.observer;

/**
 * author: hel
 * date: 2021/1/9 16:27
 * description:观察者模式
 * 角色：抽象目标
 * 描述：定义维护以及通知各个观察者的方法
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
