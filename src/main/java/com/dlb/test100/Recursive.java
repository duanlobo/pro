package com.dlb.test100;
/**
 * 类描述：递归
 *
 */
public class Recursive {

	public static void main(String[] args) {
		int x = 3;
		System.out.println(f(x)); //0
	}
	
	//
	public static int f(int x) {
		if(x == 0) {
			return 0;
		}else {
			int k = 2 * f(x - 1) + x * x;
			return k;
		}
	}

}
