package com.zzia.wngn.design.interpreter;

/**
 * @author wanggang
 * @title
 * @date 2016/5/30 21:16
 * @email wanggang@vfou.com
 * @descripe
 */
public class InterpreterMain {

    public static void main(String args[]) {

        String statement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}
