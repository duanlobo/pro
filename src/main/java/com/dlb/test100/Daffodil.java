package com.dlb.test100;

/**
 * 打印水仙花数
 * 水仙花数：是指一个三位数，其各位数字立方和等于该数字本身
 * 例如：153就是一个水仙花数，因为153 = 1³ + 5³ + 3³
 */

public class Daffodil {
    public static void main(String[] args) {
        //1.遍历所有的三位数
        for (int i = 100; i < 1000; i++) {
            //2.调用自定义方法判断是不是水仙花数
            if (isAim(i)) {
                //3.如果是水仙花数，就打印
                System.out.println(i);
            }
        }
    }

    //4.自定义判断水仙花数的方法
    public static boolean isAim(int a) {
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;
        if (a == x * x * x + y * y * y + z * z * z) {
            return true;
        }
        return false;
    }
}

