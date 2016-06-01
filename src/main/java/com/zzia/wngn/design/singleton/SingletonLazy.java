package com.zzia.wngn.design.singleton;

/**
 * @author wanggang
 * @title 懒汉式单例
 * @date 2016/6/1 21:31
 * @email wanggang@vfou.com
 * @descripe 第一次调用才初始化，延迟
 */
public class SingletonLazy {

    private static SingletonLazy singleton = null;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
