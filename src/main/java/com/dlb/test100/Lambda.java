package com.dlb.test100;

import java.util.Arrays;
import java.util.List;

/**
 * 类描述：Lambda表达式
 *
 */
public class Lambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lambdas","Default","Stream","ZKL");
		// 普通方法遍历
		for(String s : list)
			System.out.print(s + ", ");
		// Lambda方法遍历
		System.out.println();
		list.forEach(l -> System.out.print(l + " | "));
		System.out.println();
		list.forEach(System.out::print);
	}
}
