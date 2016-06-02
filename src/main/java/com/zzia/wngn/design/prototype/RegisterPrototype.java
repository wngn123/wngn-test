package com.zzia.wngn.design.prototype;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 9:16
 * @email wanggang@vfou.com
 * @descripe
 */
public interface RegisterPrototype {

    public RegisterPrototype clone();

    public String getName();

    public void setName(String name);
}
