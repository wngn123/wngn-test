package com.zzia.wngn.design.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 9:55
 * @email wanggang@vfou.com
 * @descripe
 */
public class FacadeMain {

    private static Logger logger = LoggerFactory.getLogger(FacadeMain.class);

    public static void main(String[] args) {
        //实例化组件
        Light light = new Light();
        Television tv = new Television();
        AirCondition ac = new AirCondition();
        Screen screen = new Screen();

        TeleFacade watchTv = new TeleFacade(light, ac, tv, screen);

        watchTv.on();
        logger.info("--------------可以看电视了.........");
        watchTv.off();
        logger.info("--------------可以睡觉了...........");
    }
}
