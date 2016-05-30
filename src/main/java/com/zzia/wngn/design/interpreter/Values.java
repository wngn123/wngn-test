package com.zzia.wngn.design.interpreter;

/**
 * @author wanggang
 * @title
 * @date 2016/5/30 21:23
 * @email wanggang@vfou.com
 * @descripe
 */
public enum Values {

    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), ENGHT(8), NINE(9);

    private int value;

    public int getValue() {
        return value;
    }

    Values(int value) {
        this.value = value;
    }

    public static boolean isValue(String value) {
        for (Values value_ : Values.values()) {
            if ((value_.value + "").equals(value)) {
                return true;
            }
        }
        return false;
    }
}
