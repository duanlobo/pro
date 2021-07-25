package com.dlb.test100;

import java.util.Arrays;

/**
 * 选择排序算法
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 0, 1, 3, 6, 7, 9};
        new SelectSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int min = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    min = j;
                }
            }
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
