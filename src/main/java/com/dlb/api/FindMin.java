package com.dlb.api;

/**
 * 找出最小数字
 */
public class FindMin {
	public static void main(String[] args){
		int[] arrs = {6,8,3,5,9};
		int min = findMin(arrs);
		System.out.println(min);
	}
	private static int findMin(int[] arrs){
		int min = arrs[0];
		for(int i = 0;i<arrs.length;i++){
			if(arrs[i] < min){
				min = arrs[i];
			}
		}
		return min;
	}
}
