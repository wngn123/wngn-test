package com.zzia.wngn.design.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/24 21:49
 * @email wanggang@vfou.com
 * @descripe <p>
 * 具体观察者。实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题状态相协
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private static Logger logger = LoggerFactory.getLogger(CurrentConditionsDisplay.class);

    private float temperature;
    private float humidity;

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        logger.info("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }
}
