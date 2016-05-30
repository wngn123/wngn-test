package com.zzia.wngn.design.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/30 21:16
 * @email wanggang@vfou.com
 * @descripe
 */
public class InterpreterMain {

    private static Logger logger = LoggerFactory.getLogger(InterpreterMain.class);

    public static void main(String args[]) {
        String statement = "3 * 2 * 4 / 6 % 5";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        logger.info(statement + " = " + calculator.compute());
    }
}
