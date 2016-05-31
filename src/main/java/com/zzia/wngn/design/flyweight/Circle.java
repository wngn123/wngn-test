package com.zzia.wngn.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 9:34
 * @email wanggang@vfou.com
 * @descripe
 */
public class Circle extends Shape {

    private static Logger logger = LoggerFactory.getLogger(Circle.class);

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        logger.info("画了一个" + color + "的圆形");
    }
}
