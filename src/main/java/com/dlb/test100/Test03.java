package com.dlb.test100;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1A");
        list.add("3C");
        list.forEach(System.out::println);
    }
}
