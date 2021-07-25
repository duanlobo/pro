package com.dlb.test;

public class B {
	public static void main(String[] args){
		int[] arrs = {1,3,5,9};
		int min = finMin(arrs);
		System.out.println(min);
	}
	private static int finMin(int[] arrs){
		int min = arrs[0];
		for(int i = 0;i<arrs.length;i++){
			if(arrs[i] < min){
				min = arrs[i];
			}
		}
		return min;
	}
}
