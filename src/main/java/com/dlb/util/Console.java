package com.dlb.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 控制台打印工具类
 */
public class Console {
    public static void print(Object o) {
        println(o);
    }

    public static void println(Object o) {
        if (o instanceof String) {
            System.out.println(o);
            return;
        }
        if (o instanceof List) {
            ((List<?>) o).forEach(o1 -> System.out.println(o1));
            return;
        }
        if (o instanceof Map) {
            ((Map<?, ?>) o).forEach((o1, o2) -> System.out.println(o1 + " : " + o2));
            return;
        }
        if (o instanceof Arrays) {
            System.out.println(Arrays.toString((boolean[]) o));
            return;
        }
        System.out.println(o);
    }

    public static void err(Object str) {
        System.err.println(String.valueOf(str));
    }
}
