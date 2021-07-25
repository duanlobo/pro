package com.dlb.test100;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 有一个Map，以三种方式遍历map集合
 * 1.遍历所有的key
 * 2.遍历所有的键值对（key-value）
 * 3.遍历所有的value，不常用
 */
public class Map3 {
    public static void main(String[] args) {
        Map<?, ?> map = initMap();
        //1.遍历所有key
        for (Object k : map.keySet()) {
            System.out.println(k);
        }
        for (Object v : map.values()) {
            System.out.println(v);
        }
        //2.遍历所有的键值对
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //3.迭代器遍历 Iterator,需要在遍历过程中删除元素, 推荐使用 Iterator
        Iterator<? extends Map.Entry<?, ?>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<?, ?> e = iterator.next();
            System.out.println(e.getKey() + "> " + e.getValue());
        }
        // 4.Lambda
        map.forEach((key, value) -> {
            System.out.println(key + "- " + value);
        });

    }

    // 定义一个map
    public static Map initMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("gender", 1);
        map.put("job", "coder");
        map.put("nationality", "CN");
        return map;
    }
}
