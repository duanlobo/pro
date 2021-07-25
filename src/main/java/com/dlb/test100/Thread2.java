package com.dlb.test100;

/**
 * 创建线程的第二种方式
 * 线程实现Runnable接口
 */
public class Thread2 implements Runnable {
	int j = 0;

	public void run() {
		System.out.println(j++);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		run();
	}

	public static void main(String[] args) {
		Thread2 t = new Thread2();
		Thread tt = new Thread(t);
		tt.start();
	}

}
