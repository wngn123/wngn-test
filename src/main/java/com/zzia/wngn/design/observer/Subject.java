package com.zzia.wngn.design.observer;

/**
 * @author wanggang
 * @title 主题接口
 * @date 2016/5/24 21:47
 * @email wanggang@vfou.com
 * @descripe <p>
 * 目标。他把所有对观察者对戏的引用保存在一个聚集里，每一个主题都可以有多个观察者。
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void removeOberver(Observer observer);

    /**
     * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者
     */
    public void notifyObserver();

}
