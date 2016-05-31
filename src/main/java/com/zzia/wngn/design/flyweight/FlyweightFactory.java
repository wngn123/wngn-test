package com.zzia.wngn.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 9:35
 * @email wanggang@vfou.com
 * @descripe
 */
public class FlyweightFactory {

    static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String key) {
        Shape shape = shapes.get(key);
        //如果shape==null,表示不存在,则新建,并且保持到共享池中
        if (shape == null) {
            shape = new Circle(key);
            shapes.put(key, shape);
        }
        return shape;
    }

    public static int getSum() {
        return shapes.size();
    }
}
