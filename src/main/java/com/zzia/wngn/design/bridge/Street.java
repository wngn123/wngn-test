package com.zzia.wngn.design.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 市区街道
 * @date 2016/6/1 18:31
 * @email wanggang@vfou.com
 * @descripe
 */
public class Street extends AbstractRoad {

    private static Logger logger = LoggerFactory.getLogger(Street.class);

    @Override
    public String getDescripe() {
        return "开着" + super.car.getDescripe() + " 在市区街道行驶";
    }

    @Override
    public void run() {
        logger.info(super.car.getDescripe() + " 在市区街道行驶");
    }
}
