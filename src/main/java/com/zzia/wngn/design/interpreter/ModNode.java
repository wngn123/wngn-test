package com.zzia.wngn.design.interpreter;

/**
 * @author wanggang
 * @title 求余
 * @date 2016/5/30 21:14
 * @email wanggang@vfou.com
 * @descripe
 */
public class ModNode extends SymbolNode {
    public ModNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return super.left.interpret() % super.right.interpret();
    }
}
