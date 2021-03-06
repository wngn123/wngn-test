package com.zzia.wngn.design.facade;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 9:54
 * @email wanggang@vfou.com
 * @descripe
 */
public class TeleFacade {

    private Light light;
    private AirCondition ac;
    private Television tv;
    private Screen screen;

    public TeleFacade(Light light, AirCondition ac, Television tv, Screen screen) {
        this.light = light;
        this.ac = ac;
        this.tv = tv;
        this.screen = screen;
    }

    public void on() {
        light.on();       //首先开灯
        ac.on();          //然后是打开空调
        screen.down();    //把银幕降下来
        tv.on();          //最后是打开电视
    }

    public void off() {
        tv.off();         //首先关闭电视机
        screen.up();      //银幕升上去
        ac.off();         //空调关闭
        light.off();      //最后关灯
    }
}
