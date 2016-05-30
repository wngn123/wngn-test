package com.zzia.wngn.design.interpreter;

/**
 * @author wanggang
 * @title 求模
 * @date 2016/5/30 21:15
 * @email wanggang@vfou.com
 * @descripe
 */
public class DivNode extends SymbolNode {

    public DivNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return super.left.interpret() / super.right.interpret();
    }
}
