package com.dlb.api;

import java.util.Arrays;

/**
 * 数字排序
 */
public class SortB {
    public static void main(String[] args) {
        int[] arrs = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] newArrs = sort(arrs);
        System.out.println(Arrays.toString(newArrs));
    }

    private static int[] sort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length - i - 1; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }
        }
        return arrs;
    }
}