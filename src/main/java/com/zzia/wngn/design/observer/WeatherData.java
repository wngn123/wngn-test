package com.zzia.wngn.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanggang
 * @title 天气数据
 * @date 2016/5/24 21:49
 * @email wanggang@vfou.com
 * @descripe <p>
 * 具体主题。将有关状态存入具体观察者对象。在具体主题发生改变时，给所有的观察者发出通知。
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    /**
     * 温度
     */
    private float tempterature;
    /**
     * 气压
     */
    private float pressure;
    /**
     * 湿度
     */
    private float humidity;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < this.observers.size(); i++) {
            Observer observer = this.observers.get(i);
            observer.update(this.tempterature, this.humidity, this.pressure);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeOberver(Observer observer) {
        int i = this.observers.indexOf(observer);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    /**
     * 气象站得到更新的观测数据时，通知观察者
     */
    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.tempterature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
