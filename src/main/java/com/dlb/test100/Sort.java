package com.dlb.test100;

import com.dlb.util.Console;

import java.util.Arrays;

/**
 * 排序算法
 * 1.冒泡排序
 * 2.选择排序
 * 3.插入排序
 *
 */
public class Sort {
    public static void main(String[] args) {
        int[] arrs = {8, 6, 3, 9, 1, 4, 7, 2, 5, 0};
        arrs = bubbleSort(arrs);
        Console.println(Arrays.toString(arrs));
    }

    // 冒泡排序
    public static int[] bubbleSort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arrs[i] < arrs[j]) {
                    int temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        return arrs;
    }
}
