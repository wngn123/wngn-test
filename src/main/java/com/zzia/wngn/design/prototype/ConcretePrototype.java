package com.zzia.wngn.design.prototype;

/**
 * @author wanggang
 * @title 具体原型角色
 * @date 2016/6/2 9:11
 * @email wanggang@vfou.com
 * @descripe
 */
public class ConcretePrototype implements Prototype {

    public Prototype clone() {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype();
        return prototype;
    }
}
