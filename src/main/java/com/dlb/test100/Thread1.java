package com.dlb.test100;

/**
 * 创建线程的第一种方式
 * 线程继承Thread类
 */
public class Thread1 extends Thread {

	int i = 0;

	public static void main(String[] args) {
		new Thread1().start();

	}

	@Override
	public void run() {
		System.out.println(i++);
		try {
			this.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		run();
	}

}
