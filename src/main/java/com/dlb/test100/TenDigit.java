package com.dlb.test100;

import com.dlb.util.Console;

import java.util.Scanner;

/**
 * 前台接受一个数
 * 输出这个数的个位数 或者十位数
 */
public class TenDigit {
    public static void main(String[] args) {
        Console.print("请输入数字，按回车结束:");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        try {
            if (Integer.valueOf(s1) instanceof Integer) {
                Integer i1 = Integer.parseInt(s1);
                // outputUnit(i1);
                outputTens(i1);
            } else {
                Console.println("您输入的数字格式有误。");
            }
        } catch (NumberFormatException e) {
            Console.println("您输入的数字格式有误。");
        }

    }

    // 个位
    private static void outputUnit(Integer i1) {
        Console.println("数字的个位数是");
        Console.println(i1 % 10);
    }

    // 十位
    public static void outputTens(Integer i1) {
        Console.println("数字的十位数是");
        int i2 = i1 / 10;
        Console.println(i2 > 9 ? i2 % 10 : i2);
    }
}
