package com.dlb.test100;

import java.util.HashMap;

/** 统计在字符串"abcdabftfalhhkk"中每个字符出现的次数 */
public class Abcdabftfalhhkk {
	public static void main(String[] args) {
		String str = "我叫我叫你呢叫";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if (map.get(key) == null) {
				map.put(key, 1);
			} else {
				map.put(key, map.get(key) + 1);
			}
		}
		System.out.println(map);
	}
}
