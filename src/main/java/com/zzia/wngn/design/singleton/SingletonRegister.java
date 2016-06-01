package com.zzia.wngn.design.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanggang
 * @title 登记式单例
 * @date 2016/6/1 21:36
 * @email wanggang@vfou.com
 * @descripe
 */
public class SingletonRegister {

    protected static Map<String, SingletonRegister> registry = new HashMap<String, SingletonRegister>();

    /**静态代码块
     *静态代码块优先于主方法执行，而在类中定义的静态代码会优先于构造块执行，而且不管产生多少对象，静态代码块只执行一次。
     */
    static {
        SingletonRegister singleton = new SingletonRegister();
        registry.put(singleton.getClass().getName(), singleton);
    }

    protected SingletonRegister() {
    }

    public static SingletonRegister getInstance(String name) {
        if (name == null) {
            name = "com.zzs.singleton.SingletonRegister";
        }
        if (registry.get(name) == null) {
            try {
                registry.put(name, (SingletonRegister) Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return registry.get(name);
    }
}
