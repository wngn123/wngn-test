package com.zzia.wngn.design.mediator;

/**
 * @author wanggang
 * @title 中介
 * @date 2016/5/26 11:20
 * @email wanggang@vfou.com
 * @descripe <p>
 * 所谓中介者模式就是用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * 通过定义我们可以看出中介者主要是通过中介对象来封装对象之间的关系，使之各个对象在不需要知道其他对象的具体信息情况下通过中介者对象来与之通信。
 * 同时通过引用中介者对象来减少系统对象之间关系，提高了对象的可复用和系统的可扩展性。
 * <p>
 * Mediator: 抽象中介者。定义了同事对象到中介者对象之间的接口。<br>
 * ConcreteMediator: 具体中介者。实现抽象中介者的方法，它需要知道所有的具体同事类，
 * 同时需要从具体的同事类那里接收信息，并且向具体的同事类发送信息。<br>
 * Colleague: 抽象同事类。<br>
 * ConcreteColleague: 具体同事类。每个具体同事类都只需要知道自己的行为即可，但是他们都需要认识中介者。
 * 在中介者模式中中介者对象处于核心地位，因为它定义了整个系统中所有具体同事类之间的关系。在整个系统中它主要承担两个方面的责任。<br>
 * <p>
 * 优点<br>
 * 1、 简化了对象之间的关系，将系统的各个对象之间的相互关系进行封装，将各个同事类解耦，使系统成为松耦合系统。<br>
 * 2、 减少了子类的生成。<br>
 * 3、 可以减少各同事类的设计与实现。<br>
 * <p>
 * 缺点<br>
 * 由于中介者对象封装了系统中对象之间的相互关系，导致其变得非常复杂，使得系统维护比较困难。<br>
 * <p>
 * 模式适用场景<br>
 * 1、 系统中对象之间存在比较复杂的引用关系，导致他们之间的依赖关系结构混乱而且难以复用该对象。<br>
 * 2、 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。<br>
 * <p>
 * 模式总结<br>
 * 1、 在中介者模式中通过引用中介者对象，将系统中有关的对象所引用的其他对象数目减少到最少。
 * 它简化了系统的结构，将系统由负责的网状结构转变成简单的星形结构，中介者对象在这里起到中转和协调作用。<br>
 * 2、 中介者类是中介者模式的核心，它对整个系统进行控制和协调，简化了对象之间的交互，还可以对对象间的交互进行进一步的控制。<br>
 * 3、 通过使用中介者模式，具体的同事类可以独立变化，通过引用中介者可以简化同事类的设计和实现。<br>
 * 4、 就是由于中介者对象需要知道所有的具体同事类，封装具体同事类之间相互关系，导致中介者对象变得非常复杂，系统维护起来较为困难。<br>
 */
public abstract class Mediator {

    /**
     * 申明一个联络方法
     */
    public abstract void constact(String message, Person person);

    public abstract void setHouseOwner(HouseOwner houseOwner);

    public abstract void setTenant(Tenant tenant);

}
