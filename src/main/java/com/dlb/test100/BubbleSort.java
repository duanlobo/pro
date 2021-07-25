package com.dlb.test100;

import java.util.Arrays;
import java.util.Random;

/**
 * 冒泡排序算法
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = create(10, 100);
        System.out.println("排序前的数组：" + Arrays.toString(arr));
        bubbleSort(arr);//调用方法应该对数组发生了变化
        System.out.println("排序后的数组：" + Arrays.toString(arr));
        // 遍历出第六个最大数
        System.out.println("第六个最大数是：" + arr[5]);
    }

    //生成一个指定数量的数组
    private static int[] create(int length, int range) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(range);
        }
        return arr;
    }

    //冒泡排序的算法
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
