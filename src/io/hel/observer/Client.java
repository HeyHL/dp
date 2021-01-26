package io.hel.observer;

/**
 * author: hel
 * date: 2021/1/9 16:38
 * description:
 */
public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Baidu baidu = new Baidu();
        weatherStation.registerObserver(baidu);
        weatherStation.registerObserver(new Sina());
        weatherStation.refresh(9, 10, 40);
//        weatherStation.notifyObservers();
        System.out.println();
        weatherStation.removeObserver(baidu);
        weatherStation.refresh(23, 11, 50);
    }
}
