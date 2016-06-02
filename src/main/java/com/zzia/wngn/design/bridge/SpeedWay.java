package com.zzia.wngn.design.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 高速公路
 * @date 2016/6/1 18:32
 * @email wanggang@vfou.com
 * @descripe
 */
public class SpeedWay extends AbstractRoad {

    private static Logger logger = LoggerFactory.getLogger(SpeedWay.class);

    @Override
    public String getDescripe() {
        return "开着" + super.car.getDescripe() + " 在高速公路行驶";
    }

    public void run() {
        logger.info(super.car.getDescripe() + " 在高速公路行驶");
    }
}
