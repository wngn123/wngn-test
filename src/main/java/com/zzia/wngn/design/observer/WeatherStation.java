package com.zzia.wngn.design.observer;

/**
 * @author wanggang
 * @title
 * @date 2016/5/24 21:50
 * @email wanggang@vfou.com
 * @descripe
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //注册观察者
        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.registerObserver(new CurrentConditionsDisplay());

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 78, 40.4f);
    }
}
