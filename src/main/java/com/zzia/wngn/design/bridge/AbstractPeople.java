package com.zzia.wngn.design.bridge;

/**
 * @author wanggang
 * @title 抽象人类
 * @date 2016/6/1 18:49
 * @email wanggang@vfou.com
 * @descripe
 */
public abstract class AbstractPeople {

    protected AbstractRoad road;

    public AbstractRoad getRoad() {
        return road;
    }

    public void setRoad(AbstractRoad road) {
        this.road = road;
    }

    public abstract String getDescripe();

    public abstract void run();

}
