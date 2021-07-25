package com.dlb.test100;

import com.dlb.util.Console;

import java.util.Scanner;

/**
 * 计算两个整数的差值
 * 计算两个整数的和
 */
public class DiffValue {
    public static void main(String[] args) {
        Console.print("请输入第一个数字，按回车结束:");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        Console.print("请输入第二个数字，按回车结束:");
        String s2 = scanner.next();
        try {
            if (Integer.valueOf(s1) instanceof Integer && Integer.valueOf(s2) instanceof Integer) {
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                System.out.println("两个整数的差值是: ");
                System.out.println(Math.abs(i1 - i2)); //输出差值
//                System.out.println("两个整数的和是: ");
//                Console.println(sum(i1, i2)); //输出和
            } else {
                Console.println("您输入的数字格式有误。");
            }
        } catch (NumberFormatException e) {
            Console.println("您输入的数字格式有误。");
        }

    }

    // 求和
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
