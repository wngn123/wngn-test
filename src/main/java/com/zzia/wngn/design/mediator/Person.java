package com.zzia.wngn.design.mediator;

/**
 * @author wanggang
 * @title
 * @date 2016/5/26 11:21
 * @email wanggang@vfou.com
 * @descripe
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
