package com.dlb.test100;

import com.dlb.util.Console;

import java.util.Scanner;

/**
 * 1.判断整数是不是质数(也叫素数)
 * 2.输出打印200以内的素数
 */
public class PrimeNum {
    public static void main(String[] args) {
        Console.println("请输入第一个数字，按回车结束:");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        try {
            if (Integer.valueOf(s1) instanceof Integer) {
                Integer i1 = Integer.parseInt(s1);
                Console.println("你输入的这个数" + (isPrimeNum(i1) ? "是质数" : "不是质数"));
            } else {
                Console.println("您输入的数字格式有误。");
            }
        } catch (NumberFormatException e) {
            Console.println("您输入的数字格式有误。");
        }

    }

    public static boolean isPrimeNum(Integer num) {
        if (num <= 3) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
