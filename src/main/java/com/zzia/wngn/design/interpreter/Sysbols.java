package com.zzia.wngn.design.interpreter;

/**
 * @author wanggang
 * @title
 * @date 2016/5/30 21:31
 * @email wanggang@vfou.com
 * @descripe
 */
public enum Sysbols {

    ADD("+"), CUT("-"), MUL("*"), DIV("/"), MOD("%"), LEFT("("), RIGHT(")");

    private String sysbol;

    public String getSysbol() {
        return sysbol;
    }

    Sysbols(String sysbol) {
        this.sysbol = sysbol;
    }

    public static boolean isSysbol(String sysbol) {
        for (Sysbols sysbol_ : Sysbols.values()) {
            if (sysbol_.sysbol.equals(sysbol)) {
                return true;
            }
        }
        return false;
    }
}
