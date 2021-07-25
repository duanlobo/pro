package com.dlb.test100;

/**
 * 数字转换
 */
public class NumberConversion {
    public static void main(String[] args) {
        Float f = 0f;
        Float f2 = 0.0f;
        Float f3 = 0.00f;
        if (f != 0f && f != null) { //去掉空值
            f3 = 122f;
        }
        System.out.println(f.floatValue() == f2.floatValue());
        System.out.println(f2.floatValue() == f3.floatValue());
        System.out.println(f3.floatValue());
    }

}
