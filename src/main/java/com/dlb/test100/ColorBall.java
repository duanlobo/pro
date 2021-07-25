package com.dlb.test100;

import java.util.Arrays;
import java.util.Random;

/**
 * 模拟双色球生成案例
 * 需求：体彩中有一项是双色球，要求在1-33号共33个红色球里选出6个，1-16号共16个蓝色球中选出一个作为中奖号码，请实现这个需求
 */
public class ColorBall {

    public static void main(String[] args) {
        //准备两个号码数组
        int[] r = zbsz(33);//[1,2,3,4,5....33]
        int[] b = zbsz(16);//[1,2,3...16]
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(b));
        //选择红球
        int[] red = selectRed(r);
        //选择蓝球
        int blue = selectBlue(b);
        System.out.println("红球：" + Arrays.toString(red));
        System.out.println("蓝球：" + blue);
    }

    private static int[] zbsz(int n) {//准备数组的方法
        //新建n个长度的int[]数组，存到a
        int[] a = new int[n];
        //遍历a数组，填入1到n
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        //返回数组
        return a;
    }

    private static int[] selectRed(int[] r) {//选择红球
        /*
         *                                           j
         * r [10, 5, 1, 4, 2, 6, 7, 8, 9, 3, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33]
         *                       i
         *
         *         [i, r.length)
         *      i+ [0, r.length-i)
         */
        //i循环从0到<6
        for (int i = 0; i < 6; i++) {
            //j随机定位
            int j =
                    i + new Random().nextInt(r.length - i);
            int t = r[i];
            r[i] = r[j];
            r[j] = t;
        }
        //截取前6个位置，生成一个新数组返回
        return Arrays.copyOf(r, 6);
    }

    private static int selectBlue(int[] b) {//选择蓝球
        return b[new Random().nextInt(16)];
    }
}