package com.dlb.test100;

/**
 * 类描述：用八个人，第一个人10岁，第二个人比第一个人大10岁，第三个人比第二个人大10岁，以此类推，用递归的方式写出第8个人的岁数
 */
public class CalcAge {
    private int getAge(int value) {
        if (value == 1) return 10;
        return getAge(value - 1) + 10;
    }

    public static void main(String[] args) {
        int ten = new CalcAge().getAge(8);
        System.out.println(ten);
    }
}