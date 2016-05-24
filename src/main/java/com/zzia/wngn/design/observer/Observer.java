package com.zzia.wngn.design.observer;

/**
 * @author wanggang
 * @title 观察者接口
 * @date 2016/5/24 21:48
 * @email wanggang@vfou.com
 * @descripe <p>
 * 观察者。为所有的具体观察者定义一个接口，在得到主题的通知时能够及时的更新自己。
 * <p/>
 * 观察者模式：<br>
 * 意图：<br>
 * 定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时, 所有依赖于它的对象都得到通知并被自动更新。
 * 适用性：<br>
 * 当一个抽象模型有两个方面, 其中一个方面依赖于另一方面。将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。<br>
 * 当对一个对象的改变需要同时改变其它对象, 而不知道具体有多少对象有待改变。<br>
 * 当一个对象必须通知其它对象，而它又不能假定其它对象是谁。换言之, 你不希望这些对象是紧密耦合的。<br>
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);

}
