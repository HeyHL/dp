package io.hel.observer;

/**
 * author: hel
 * date: 2021/1/9 16:34
 * description:观察者模式
 * 角色：具体观察者
 * 描述：接收发布者的变化并更新自身的状态
 */
public class Baidu implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        show();
    }

    private void show() {
        System.out.printf("Baidu shows that the current temperature is %f °\n", temperature);
        System.out.printf("Baidu shows that the current pressure is %f kPa\n", pressure);
        System.out.printf("Baidu shows that the current humidity is %f °\n", humidity);
    }
}
