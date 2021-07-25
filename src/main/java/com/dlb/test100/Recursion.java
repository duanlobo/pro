package com.dlb.test100;

/**
 * 用递归实现在1+2+3...+100的结果
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(new Recursion().function(100));
    }

    public int function(int i) {
        int sum;
        if (i == 1) {
            return 1;
        } else {
            sum = i + function(i - 1);
            return sum;
        }
    }
}
