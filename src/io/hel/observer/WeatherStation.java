package io.hel.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hel
 * date: 2021/1/9 16:29
 * description:观察者模式
 * 角色：具体目标（发布者）
 * 描述：维护需要获得更新的一些观察者，在数据发生变化时通知它们。
 */
public class WeatherStation implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers = new ArrayList<>();


    public void refresh(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(temperature, pressure, humidity);
        }
    }
}
