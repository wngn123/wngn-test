package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 浓咖啡
 * @date 2016/5/31 22:19
 * @email wanggang@vfou.com
 * @descripe
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
