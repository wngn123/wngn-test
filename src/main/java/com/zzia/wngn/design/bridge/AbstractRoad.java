package com.zzia.wngn.design.bridge;

/**
 * @author wanggang
 * @title
 * @date 2016/6/1 18:30
 * @email wanggang@vfou.com
 * @descripe
 */
public abstract class AbstractRoad {

    protected AbstractCar car;

    public AbstractCar getCar() {
        return car;
    }

    public void setCar(AbstractCar car) {
        this.car = car;
    }

    public abstract String getDescripe();

    public abstract void run();
}
