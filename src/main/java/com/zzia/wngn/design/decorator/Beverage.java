package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 饮料
 * @date 2016/5/31 22:14
 * @email wanggang@vfou.com
 * @descripe
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
