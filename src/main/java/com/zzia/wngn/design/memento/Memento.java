package com.zzia.wngn.design.memento;

/**
 * @author wanggang
 * @title 备忘录
 * @date 2016/5/25 13:54
 * @email wanggang@vfou.com
 * @descripe <p>
 * Memento: 备忘录。用于存储Originator的内部状态，并且可以防止Originator以外的对象访问Memento。
 * 在备忘录Memento中有两个接口，其中Caretaker只能看到备忘录中的窄接口，它只能将备忘录传递给其他对象。
 * Originator可以看到宽接口，允许它访问返回到先前状态的所有数据
 * <p>
 * 模式定义<br>
 * 所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 * 这样可以在以后将对象恢复到原先保存的状态。
 * <p>
 * 优点<br>
 * 1、 给用户提供了一种可以恢复状态的机制。可以是用户能够比较方便地回到某个历史的状态。<br>
 * 2、 实现了信息的封装。使得用户不需要关心状态的保存细节。<br>
 * <p>
 * 缺点<br>
 * 消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。<br>
 * <p>
 * 模式适用场景<br>
 * 1、 需要保存一个对象在某一个时刻的状态或部分状态。<br>
 * 2、 如果用一个接口来让其他对象得到这些状态，将会暴露对象的实现细节并破坏对象的封装性，一个对象不希望外界直接访问其内部状态，通过负责人可以间接访问其内部状态。
 * <p>
 * 模式总结<br>
 * 1、 备忘录模式可以实现在不破坏封装的前提下，捕获一个类的内部状态，并且在该对象之外保存该对象的状态，
 * 保证该对象能够恢复到历史的某个状态。<br>
 * 2、 备忘录模式实现了内部状态的封装，除了创建它的原发器之外其他对象都不能够访问它。<br>
 * 3、 备忘录模式会占用较多的内存，消耗资源。<br>
 */
public class Memento {

    /**
     * 血量
     */
    private int bloodFlow;
    /**
     * 蓝量
     */
    private int magicPoint;

    public int getBloodFlow() {
        return bloodFlow;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public Memento(int bloodFlow, int magicPoint) {
        this.bloodFlow = bloodFlow;
        this.magicPoint = magicPoint;
    }
}
