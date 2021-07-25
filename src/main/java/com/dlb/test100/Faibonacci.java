package com.dlb.test100;

import java.util.Scanner;

/**
 * 斐波那契问题
 * 已知:斐波那契数列的前几个数分别为0,1,1,2,3,5…从第三项开始,每一项都等于前两项的和.请接收用户输入的整数n,求出此数列的前n项.
 */
public class Faibonacci {
    public static void main(String[] args) {
        System.out.println("请输入您要测试的数:");
        int n = new Scanner(System.in).nextInt();
        //判断n是否是不正常的范围
        if (n < 1) {
            System.out.println("输入数据有误！！！");
        }
        //n==1
        if (n == 1) {
            System.out.println(0);
        }
        //n==2
        if (n == 2) {
            System.out.println(0 + "\t" + 1);
        }
        //n==3
        if (n == 3) {
            System.out.println(0 + "\t" + 1 + "\t" + 1);
        }
        //拼接前n项
        if (n > 3) {
            System.out.print(0 + "\t" + 1 + "\t" + 1 + "\t");
        }
        //循环输出后面的数据
        int f1 = 1;
        int f2 = 1;
        int next = 0;
        for (int i = 4; i <= n; i++) {
            next = f1 + f2;
            f1 = f2;
            f2 = next;
            System.out.print(next + "\t");
        }
    }
}


