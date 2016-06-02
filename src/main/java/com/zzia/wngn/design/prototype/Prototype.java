package com.zzia.wngn.design.prototype;

/**
 * @author wanggang
 * @title 抽象原型角色
 * @date 2016/6/2 9:10
 * @email wanggang@vfou.com
 * @descripe <p>
 * 意图：
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * <p>
 * 适用性：
 * 当要实例化的类是在运行时刻指定时，例如，通过动态装载；
 * 或者为了避免创建一个与产品类层次平行的工厂类层次时；
 * 或者当一个类的实例只能有几个不同状态组合中的一种时。
 * 建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 */
public interface Prototype {
    /**
     * 克隆自身的方法
     *
     * @return 一个从自身克隆出来的对象
     */
    public Prototype clone();
}
