package com.zzia.wngn.design.adapter;

/**
 * @author wanggang
 * @title
 * @date 2016/6/1 21:08
 * @email wanggang@vfou.com
 * @descripe <p/>
 * 模式定义<br>
 * 何谓适配器模式？适配器模式就是将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。<br>
 * 在适配器模式中，我们可以定义一个包装类，包装不兼容接口的对象，这个包装类就是适配器，它所包装的对象就是适配者。<br>
 * 适配器提供给客户需要的接口，适配器的实现就是将客户的请求转换成对适配者的相应的接口的引用。也就是说，当客户调用适配器的方法时，
 * 适配器方法内部将调用适配者的方法，客户并不是直接访问适配者的，而是通过调用适配器方法访问适配者。因为适配器可以使互不兼容的类能够“合作愉快”。
 * <p/>
 * 适配器模式有如下四个角色：<br>
 * Target：目标抽象类<br>
 * Adapter：适配器类<br>
 * Adaptee：适配者类<br>
 * Client：客户类<br>
 * <p/>
 * 优点<br>
 * 1. 将目标类和适配者类解耦，通过使用适配器让不兼容的接口变成了兼容，让客户从实现的接口解耦。<br>
 * 2. 增加了类的透明性和复用性，将具体的实现封装在适配者类中，对于客户端类来说是透明的，而且提高了适配者的复用性。<br>
 * 3. 灵活性和扩展性都非常好在不修改原有代码的基础上增加新的适配器类，符合“开闭原则”<br>
 * <p/>
 * 使用场景<br>
 * 1. 系统需要使用现有的类，而这些类的接口不符合系统的需要。<br>
 * 2.想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类<br>
 * <p/>
 * 模式总结<br>
 * 1、当我们需要使用的一个现有的类，但是他的接口并不符合我们的需求时，我们可以使用适配器模式。<br>
 * 2、适配器模式分为类适配器和对象适配器，其中类适配器需要用到多重继承。<br>
 */
public class AdapterMain {

    public static void main(String[] args) {

        BioRobot robot = new BioRobot();
        robot.cry();
        robot.move();

        Dog dog = new Dog();
        //将这只狗包装到机器人中，使其有点儿像机器人
        Robot dogRobot = new DogAdapter(dog);
        //然后是机器人叫和跑
        dogRobot.cry();
        dogRobot.move();

        Bird bird = new Bird();
        Robot birdRobot = new BirdAdapter(bird);
        birdRobot.cry();
        birdRobot.move();
    }
}
