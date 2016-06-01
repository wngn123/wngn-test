package com.zzia.wngn.design.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 仿狗机器人
 * @date 2016/6/1 21:08
 * @email wanggang@vfou.com
 * @descripe
 */
public class DogAdapter implements Robot {

    private static Logger logger = LoggerFactory.getLogger(DogAdapter.class);

    private Dog dog;

    public DogAdapter(Dog dog) {     //取得要适配的对象的引用
        this.dog = dog;
    }

    /**
     * 实现接口中的方法，只需要在相应的方法间进行转换即可完成。
     */
    public void cry() {
        logger.info("机器人模拟狗叫...");
        dog.wang();
    }

    public void move() {
        logger.info("机器人模拟狗跑...");
        dog.run();
    }
}
