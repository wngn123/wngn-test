package com.zzia.wngn.design.memento;

/**
 * @author wanggang
 * @title 负责人
 * @date 2016/5/25 13:54
 * @email wanggang@vfou.com
 * @descripe <p>
 * 负责人。负责保存好备忘录，不能对备忘录的内容进行操作和访问，只能够将备忘录传递给其他对象。
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
