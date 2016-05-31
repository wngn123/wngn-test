package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 脱因咖啡
 * @date 2016/5/31 22:15
 * @email wanggang@vfou.com
 * @descripe
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
