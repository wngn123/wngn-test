package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 焦炒咖啡
 * @date 2016/5/31 22:15
 * @email wanggang@vfou.com
 * @descripe
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
