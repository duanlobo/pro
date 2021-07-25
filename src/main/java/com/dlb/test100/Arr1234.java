package com.dlb.test100;

import java.util.Arrays;

/**
 * 将1，2，3，4四个数字每三个组成一个数，每个数字仅出现一次，求能组成多少个
 *
 */
public class Arr1234 {
	public static void main(String[] args) {
		int a[] = new int[3];
		int count = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int k = 1; k < 5; k++) {
					a[0] = i;
					a[1] = j;
					a[2] = k;
					if (a[0] != a[1] && a[1] != a[2] && a[2] != a[0]) {
						System.out.println(Arrays.toString(a));
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
