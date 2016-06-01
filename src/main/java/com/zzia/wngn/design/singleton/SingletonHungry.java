package com.zzia.wngn.design.singleton;

/**
 * @author wanggang
 * @title 饿汉式单例
 * @date 2016/6/1 21:31
 * @email wanggang@vfou.com
 * @descripe 类加载时就初始化
 */
public class SingletonHungry {

    private static SingletonHungry singleton = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return singleton;
    }
}
