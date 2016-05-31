package com.zzia.wngn.design.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 目标对象角色
 * @date 2016/5/31 9:17
 * @email wanggang@vfou.com
 * @descripe
 */
public class RealObject extends AbstractObject {

    private static Logger logger = LoggerFactory.getLogger(RealObject.class);

    @Override
    public void operation() {
        logger.info("-----------具体业务");
    }
}
