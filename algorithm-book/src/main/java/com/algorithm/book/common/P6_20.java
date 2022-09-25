package com.algorithm.book.common;

public class P6_20 {

    public void cyclotomic(int n) {
        int i, s;
        double k, length;
        i = 0;
        k = 3.0;
        length = 1.0;
        s = 6;
        while (i <= n) {
            System.out.printf("第%2d次切割，为正%5d边形，PI=%.24f \n", i, s, k * Math.sqrt(length));
            s *= 2;
            length = 2 - Math.sqrt(4 - length);
            i++;
            k *= 2.0;
        }
    }
}








