package com.zzia.wngn.design.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 房主
 * @date 2016/5/26 11:22
 * @email wanggang@vfou.com
 * @descripe
 */
public class HouseOwner extends Person {

    private static Logger logger = LoggerFactory.getLogger(HouseOwner.class);

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介者联系
     *
     * @param message
     */
    public void constact(String message) {
        super.mediator.constact(message, this);
    }

    /**
     * 获取信息
     *
     * @param message
     */
    public void getMessage(String message) {
        logger.info("房主:{},获得信息:{}", name, message);
    }
}
