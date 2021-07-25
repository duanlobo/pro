package com.dlb.test100;

import java.util.ArrayList;
import java.util.List;

/**
 * System.out::print ：是方法引用
 * 方法引用是当你想把一个方法当作一个“函数指针”传给别的方法用时有用的。
 * <p>
 * Java 8之前会这样写：
 * for (ElementType e : list) {
 * System.out.println(e);
 * }
 * 从Java 8开始，使用ArrayList的新API加上lambda表达式，我们可以这样写：
 * list.forEach(e -> System.out.println(e));
 * 而这里的lambda表达式的内容其实只不过就是把参数传给了println()方法，而没有做任何别的事情，所以可以进一步简写为：
 * list.forEach(System.out::println);
 * System.out是一个PrintStream实例的引用；System.out::println 是对一个实例方法的引用
 * 该引用同时指定了对实例（System.out）的引用以及对方法（PrintStream::println）的引用
 * System.out::println 不是 System.out.println 的等价物；前者是一个方法引用表达式，而后者不能单独作为一个表达式，而必须在后面跟上由圆括号包围的参数列表来构成方法调用表达式。
 * System.out::println 可以看作 lambda表达式 e -> System.out.println(e) 的缩写形式。
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1A");
        list.add("3C");
        list.forEach(System.out::println);
    }
}
