package com.dlb.test100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 类描述：迭代器
 *
 *
 */
public class Iteration {
	public static void main(String[] args) {
		// 得到一个已经填充好了的ArrayList，并用迭代器遍历
		ArrayList<String> list = createArrayList();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			//it.next()每迭代一次，这个方法只能执行一次，因为it.next()方法不仅会获得当前的遍历的对象，而且还会移动光标，影响整个结构，这就是为什么要用s去存这个值了。
			String s = it.next();
			System.out.print(s + " ");
			if ("a".equals(s)) {
				it.remove();
			}
		}
		changeLine(1);
		// 用普通的方法去遍历
		for (String s : list) {
			System.out.print(s + ",");

		}
		changeLine(2);
		// 得到一个已经填充好了的LinkedList，并用迭代器遍历
		LinkedList<String> Llist = createLinkedList();
		Iterator<String> lit = Llist.iterator();
		while (lit.hasNext())
			System.out.print(lit.next() + " ");
		changeLine(1);
		// 用普通的方法去遍历
		for (String s : Llist)
			System.out.print(s + ",");
	}

	private static ArrayList<String> createArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(0, "0");
		return list;
	}

	private static LinkedList<String> createLinkedList() {
		LinkedList<String> Llist = new LinkedList<String>();
		Llist.add("A");
		Llist.add("B");
		Llist.add("C");
		Llist.add(0, "00");
		return Llist;
	}

	private static void changeLine(int rows) {
		for (int i = 0; i < rows; i++) {
			System.out.println();
		}
	}
}
