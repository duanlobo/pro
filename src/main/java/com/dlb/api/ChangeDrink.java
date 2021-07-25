package com.dlb.api;

/**
 * 某饮料2块钱1瓶，喝完以后，3个空瓶子可以换一瓶饮料，5个瓶盖可以换一瓶饮料。
 * 问30块钱能喝多少瓶饮料？
 */
public class ChangeDrink {
    public static int drinksNum;
    public static int bottle;
    public static int cap;

    public static int price = 2;

    /**
     * 获取初始数目即赋初值
     *
     * @param money
     */
    public static void init(int money) {
        drinksNum = money / price;
        bottle = money / price;
        cap = money / price;
    }

    /**
     * 根据瓶子即瓶盖数判断是否满足兑换条件
     *
     * @return 返回值为最终所得数目
     */
    public static int getNum() {
        if (bottle / 3 >= 1 || cap / 5 >= 1) {
            int temp = (bottle / 3 + cap / 5);    //兑换的饮料数目
            drinksNum += (bottle / 3 + cap / 5);  //增加后的饮料数目
            bottle = bottle - (bottle / 3) * 3 + temp; //兑换后的空瓶数目
            cap = cap - (cap / 5) * 5 + temp;   //兑换后的盖子数目
            getNum();
        }
        return drinksNum;
    }

    public static void main(String[] args) {
        init(30);
        int count = getNum();
        System.out.println(count);
    }

}