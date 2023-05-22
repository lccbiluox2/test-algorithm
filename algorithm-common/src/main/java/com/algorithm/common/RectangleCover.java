package com.algorithm.common;

public class RectangleCover {

    /***
     * todo: 九师兄  2023/5/21 10:16
     * 测试点：测试矩形覆盖
     *
     * 矩形覆盖
     * [牛客网](https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)
     *
     * 【算法】矩形覆盖
     * https://blog.csdn.net/qq_21383435/article/details/130789388
     *
     * 这种事自己写的 不确定 有没有相关的bug
     */
    public int rectangleCover(int n) {
        if (n <= 1)
            return 1;
        int[] fib = new int[n + 1];
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= n; i++) {
            int preOne = i - 1;
            int preTwo = i - 2;
            fib[i] = fib[preOne] + fib[preTwo];
        }
        return fib[n];
    }

    public int rectCover(int n) {
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
