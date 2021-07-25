package com.dlb.test100;

public class TestMath {

	public static void main(String[] args) throws Exception {
		int count = 2697;
		int maxnum = 2000;
		int divisor = (int)Math.ceil((double)count/maxnum);
		// System.out.println(divisor);
		for (int i = 0; i < 130; i++) {
			if (i % divisor == 0) {
				System.out.println(i);
				Thread.sleep(300);
			} 
		}
	}

}
