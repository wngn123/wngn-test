package com.zzia.wngn.design.interpreter;

/**
 * @author wanggang
 * @title 数值
 * @date 2016/5/30 21:12
 * @email wanggang@vfou.com
 * @descripe
 */
public class ValueNode implements Node {

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
