package com.zzia.wngn.design.interpreter;

/**
 * @author wanggang
 * @title 乘法
 * @date 2016/5/30 21:14
 * @email wanggang@vfou.com
 * @descripe
 */
public class MulNode extends SymbolNode {

    public MulNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
