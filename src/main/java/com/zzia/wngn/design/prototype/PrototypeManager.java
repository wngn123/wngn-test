package com.zzia.wngn.design.prototype;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 9:27
 * @email wanggang@vfou.com
 * @descripe
 */
public class PrototypeManager {

    public static Prototype prototype = new ConcretePrototype();

    public static Prototype getPrototype() {
        return prototype.clone();
    }
}
