package com.zzia.wngn.design.builder;

/**
 * @author wanggang
 * @title 豪华版套餐
 * @date 2016/6/2 22:14
 * @email wanggang@vfou.com
 * @descripe
 */
public class MealLuxurious extends MealBuilder {

    public void buildDrink() {
        meal.setDrink("一杯柠檬果汁");
    }

    public void buildFood() {
        meal.setFood("三个鸡翅");
    }
}
