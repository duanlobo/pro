package com.dlb.test100;

import java.util.Arrays;

/**
 * 用插入法对一个数组进行排序
 * 
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 5, 8, 0, 1, 3, 6, 7, 9 };
		new InsertSort().insert(arr);
	}

	public void insert(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			for (j = i; j > 0; j--) {
				if (arr[j - 1] > temp) {
					arr[j] = arr[j - 1];
				} else {
					break;
				}
			}
			arr[j] = temp;

		}
		System.out.println(Arrays.toString(arr));
	}
}
