package com.dlb.api;

/**
 * 某饮料2块钱1瓶，喝完以后，3个空瓶子可以换一瓶饮料，5个瓶盖可以换一瓶饮料。
 * 问30块钱能喝多少瓶饮料？
 */
public class Drink {
    // 余数
    static int remBody = 0;
    static int remTop = 0;
    // 总数
    static int total = 0;

    public static void main(String[] args) {
        double money = 30; //金额
        double price = 2; //单价
        int bottle = (int) (money / price);
        int total = bottle + exchange(bottle);
        System.out.println(total);
    }

    public static int exchange(int bottle) {
        int sum = 0;
        int t1 = bottle / 3;
        int t2 = bottle / 5;

        sum += t1;
        sum += t2;

        if(sum > 3){
            exchange(sum);
        }
        if(sum > 5){
            exchange(sum);
        }

        return total;
    }

}
