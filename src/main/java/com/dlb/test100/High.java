package com.dlb.test100;

/**
 * 当一个球从100的高度掉下来时，每次弹跳到它之前高度的一半，问第十次下落球运行了多少米，最后一次蹦了有多高
 */
public class High {
    public static void main(String[] args) {
        double high = 100;
        double sum = 0;
        double m = 0;
        for (int i = 10; i > 0; i--) {
            m = high / 2;
            // System.out.println(m);
            high = m;
            sum = sum + m;
        }

        System.out.println(sum + 100);
        System.out.println(m);
    }
}
