package com.zzia.wngn.design.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 9:18
 * @email wanggang@vfou.com
 * @descripe
 */
public class DeepPrototypeMain {

    private static Logger logger = LoggerFactory.getLogger(DeepPrototypeMain.class);

    public static void main(String[] args) {
        try {
            DeepPrototype prototype = DeepPrototypeManager.getPrototype(DeepPrototypeManager.DEEP);
            logger.info(prototype.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
