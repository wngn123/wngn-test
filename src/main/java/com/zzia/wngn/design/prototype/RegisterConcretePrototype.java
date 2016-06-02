package com.zzia.wngn.design.prototype;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 9:17
 * @email wanggang@vfou.com
 * @descripe
 */
public class RegisterConcretePrototype implements RegisterPrototype {
    private String name;

    public RegisterPrototype clone() {
        RegisterConcretePrototype prototype = new RegisterConcretePrototype();
        prototype.setName(this.name);
        return prototype;
    }

    public String toString() {
        return "Now in Prototype1 , name = " + this.name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
