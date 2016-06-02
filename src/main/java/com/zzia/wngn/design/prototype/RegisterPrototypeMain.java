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
public class RegisterPrototypeMain {

    private static Logger logger = LoggerFactory.getLogger(RegisterPrototypeMain.class);

    public static void main(String[] args) {
        try {
            RegisterPrototype p1 = new RegisterConcretePrototype();
            RegisterPrototypeManager.setPrototype("p1", p1);
            RegisterPrototype p3 = RegisterPrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            logger.info("第1个实例：" + p3);
            //再次获取原型来创建对象
            RegisterPrototype p5 = RegisterPrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            logger.info("第2个实例：" + p5);
            RegisterPrototypeManager.removePrototype("p1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
