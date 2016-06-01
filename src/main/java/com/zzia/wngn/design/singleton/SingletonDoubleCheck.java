package com.zzia.wngn.design.singleton;

/**
 * @author wanggang
 * @title
 * @date 2016/6/1 21:35
 * @email wanggang@vfou.com
 * @descripe <p/>
 * 私有的构造方法<br>
 * 指向自己实例的私有静态引用<br>
 * 以自己实例为返回值的静态的公有的方法<br>
 * <p/>
 * 单例模式的优点：<br>
 * 在内存中只有一个对象，节省内存空间。<br>
 * 避免频繁的创建销毁对象，可以提高性能。<br>
 * 避免对共享资源的多重占用。<br>
 * 可以全局访问。<br>
 * <p/>
 * 适用场景<br>
 * 由于单例模式的以上优点，所以是编程中用的比较多的一种设计模式。我总结了一下我所知道的适合使用单例模式的场景：<br>
 * 需要频繁实例化然后销毁的对象。<br>
 * 创建对象时耗时过多或者耗资源过多，但又经常用到的对象。<br>
 * 有状态的工具类对象。<br>
 * 频繁访问数据库或文件的对象。<br>
 * 以及其他我没用过的所有要求只有一个对象的场景。<br>
 * <p/>
 * 单例模式注意事项：<br>
 * 只能使用单例类提供的方法得到单例对象，不要使用反射，否则将会实例化一个新对象。<br>
 * 不要做断开单例类对象与类中静态引用的危险操作。<br>
 */
public class SingletonDoubleCheck {

    private volatile static SingletonDoubleCheck singleton = null;

    // 私有的默认构造方法，此类不能被继承
    private SingletonDoubleCheck() {
    }

    // 静态工厂方法，返回此类的唯一实例
    public static SingletonDoubleCheck getInstance() {
        if (singleton == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
