package com.algorithm.num;

import java.util.stream.LongStream;

public class SumNotKeyWord {

    /***
     * todo: 九师兄  2023/7/2 14:03
     *
     * 【算法】求1+2+3+...+n
     * https://blog.csdn.net/qq_21383435/article/details/131500392
     */
    public int Sum_Solution(int n) {
        long sum = LongStream.rangeClosed(0L, n).parallel().reduce(0, Long::sum);
        return Integer.valueOf(String.valueOf(sum)) ;
    }

    public int Sum_SolutionV1(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
}
