package com.dlb.api;

import com.dlb.util.Console;

import java.util.*;
import java.util.stream.Collectors;

/**
 * JDK8 stream操作list
 */
public class Stream {
    public static void main(String[] args) {
        // new一个list
        List<Book> list = new ArrayList<>();
        list = fill();

        // filter过滤list
        Console.println(filter(list));
        separationLine(1, '-');

        // findFirst查找第一个
        Console.println(findFirst(list));
        separationLine(1, '*');

        // distinct去除重复
        Console.println(distinct(list));
        separationLine(1, '+');

        // sorted排序
        Console.println(sorted(list));
        separationLine(1, '@');

        // groupingBy分组
        Console.println(groupBy(list));
        separationLine(1, '#');
        //
    }


    private static Object filter(List<Book> list) {
        List<Book> books = list.stream().filter(book -> book.getPrice() >= 20).collect(Collectors.toList());
        return books;
    }

    private static Object findFirst(List<Book> list) {
        Book book = list.stream().filter(b -> "A".equals(b.getName())).findFirst().orElse(null);
        return book;
    }

    private static Object distinct(List<Book> list) {
        List list1 = list.stream().map(Book::getPrice).distinct().collect(Collectors.toList());
        return list1;
    }

    private static Object sorted(List<Book> list) {
        List list1 = list.stream().sorted(Comparator.comparing(Book::getPrice).reversed()).collect(Collectors.toList());
        return list1;
    }

    private static Object groupBy(List<Book> list) {
        Map<String, List<Book>> groupListMap = list.stream().collect(Collectors.groupingBy(Book::getName));
        return groupListMap;
    }


    /**
     * @param i  分割线行数
     * @param ch 分割线字符
     */
    private static void separationLine(int i, char ch) {
        StringBuffer sb = new StringBuffer();
        for (int k = 0; k < 30; k++) {
            sb.append(ch);
        }
        for (int j = 0; j < i; j++) {
            System.out.println(sb);
        }
    }


    private static List<Book> fill() {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1, "A", "A", "A", "A", 5.00d, new Date(), "A"));
        list.add(new Book(2, "B", "B", "B", "B", 15.00d, new Date(), "B"));
        list.add(new Book(3, "C", "C", "C", "C", 20.00d, new Date(), "C"));
        list.add(new Book(4, "D", "D", "D", "D", 20.00d, new Date(), "D"));
        list.add(new Book(5, "E", "E", "E", "E", 22.00d, new Date(), "E"));
        return list;
    }
}
