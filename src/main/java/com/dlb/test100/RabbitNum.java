package com.dlb.test100;

import java.util.Scanner;

/**
 * 生兔兔问题
 * 有一对兔子，从出生后第3个月起都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月兔子的对数为多少？
 * 程序分析：前两个月兔子的对数为1
 * 从第三个月开始，兔子的对数变成了 2 3 5 8 13 21 …
 */
public class RabbitNum {
    public static void main(String[] args) {
        System.out.println("请输入要判断的月数：");
        int month = new Scanner(System.in).nextInt();
        System.out.println("第" + month + "月兔子的对数为：" + getSum(month));
    }

    public static int getSum(int month) {
        //如果是前两个月，还是1对兔子
        if (month == 1 || month == 2) {
            return 1;
        } else {
            //从第三个开始，兔子按照2 3 5 8 13 21变化
            return getSum(month - 1) + getSum(month - 2);
        }
    }
}
