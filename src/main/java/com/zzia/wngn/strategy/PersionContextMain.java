package com.zzia.wngn.strategy;

/**
 * @author wanggang
 * @title 测试
 * @date 2016/5/21 16:41
 * @email wanggang@vfou.com
 * @descripe <p>
 * 策略模式，又叫算法簇模式，就是定义了不同的算法族，并且之间可以互相替换，此模式让算法的变化独立于使用算法的客户。<br>
 * 策略模式的好处在于你可以动态的改变对象的行为。<br>
 * 策略模式中有三个对象：<br>
 * （1）环境对象：该类中实现了对抽象策略中定义的接口或者抽象类的引用。<br>
 * （2）抽象策略对象：它可由接口或抽象类来实现。<br>
 * （3）具体策略对象：它封装了实现同不功能的不同算法。<br>
 */
public class PersionContextMain {

    public static void main(String[] args) {
        PersonContext persionOne = new PersonContext();
        PersonContext persionTwo = new PersonContext();
        PersonContext persionThree = new PersonContext();
        TravelStrategy airStrategy = new AirStrategy();
        TravelStrategy trainStrategy = new TrainStrategy();
        TravelStrategy bicycleStrategy = new BicycleStrategy();
        persionOne.setStrategy(airStrategy);
        persionTwo.setStrategy(trainStrategy);
        persionThree.setStrategy(bicycleStrategy);
        persionOne.travel();
        persionTwo.travel();
        persionThree.travel();
    }
}
