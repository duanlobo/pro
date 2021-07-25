package com.dlb.api;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 测试
 */
public class Map1 {
    public static void main(String[] args) {
        Map<Object,Object> map = new HashMap<Object,Object>();
        map.put(1,2);
        map.put("a","A");
        map.put(null,"B");
        map.put("c",null);
        map.put(null,"bB");
        System.out.println(map);
        System.out.println(map.get(null));
        Map<Object,Object> tableMap = new Hashtable<Object, Object>();
        tableMap.put("d","D");
        System.out.println(tableMap);
    }
}