package com.zzia.wngn.design.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 游戏角色类
 * @date 2016/5/25 13:53
 * @email wanggang@vfou.com
 * @descripe <p>
 * Originator: 原发器。
 * 负责创建一个备忘录，用以记录当前对象的内部状态，通过也可以使用它来利用备忘录恢复内部状态。
 * 同时原发器还可以根据需要决定Memento存储Originator的那些内部状态
 */
public class Role {

    private static Logger logger = LoggerFactory.getLogger(Role.class);

    /**
     * 血量
     */
    private int bloodFlow;
    /**
     * 蓝量
     */
    private int magicPoint;

    public Role(int bloodFlow, int magicPoint) {
        this.bloodFlow = bloodFlow;
        this.magicPoint = magicPoint;
    }

    public int getBloodFlow() {
        return bloodFlow;
    }

    public void setBloodFlow(int bloodFlow) {
        this.bloodFlow = bloodFlow;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    /**
     * 展示角色当前状态
     */
    public void display() {
        logger.info("用户当前状态:[血量:{};蓝量:{}]", getBloodFlow(), getMagicPoint());
    }

    /**
     * 保持存档、当前状态
     *
     * @return Memento 备忘录
     */
    public Memento saveMemento() {
        return new Memento(getBloodFlow(), getMagicPoint());
    }

    /**
     * 恢复存档
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.bloodFlow = memento.getBloodFlow();
        this.magicPoint = memento.getMagicPoint();
    }
}
