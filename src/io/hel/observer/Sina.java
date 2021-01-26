package io.hel.observer;

/**
 * author: hel
 * date: 2021/1/9 16:40
 * description:
 */
public class Sina implements Observer {
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
        System.out.printf("Sina shows that the current temperature is %f °\n", temperature);
        System.out.printf("Sina shows that the current pressure is %f kPa\n", pressure);
        System.out.printf("Sina shows that the current humidity is %f °\n", humidity);
    }
}
