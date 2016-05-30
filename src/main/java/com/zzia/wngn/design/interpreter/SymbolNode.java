package com.zzia.wngn.design.interpreter;

/**
 * @author wanggang
 * @title 符号
 * @date 2016/5/30 21:13
 * @email wanggang@vfou.com
 * @descripe
 */
public abstract class SymbolNode implements Node {

    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
