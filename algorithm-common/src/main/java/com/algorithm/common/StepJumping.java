package com.algorithm.common;

/***
 * todo: 九师兄  2023/5/21 12:45
 *
 * 【算法】青蛙跳台阶
 * https://blog.csdn.net/qq_21383435/article/details/130790738
 */
public class StepJumping {

    /***
     * todo: 九师兄  2023/5/21 12:12
     * 测试点：青蛙跳台阶 动态规划方式解答
     * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     *
     * 这个算法第一眼看到的时候，我想的就是 测试矩形覆盖
     * {@link RectangleCover }
     * 和这个很相似了
     *
     * 假设只有一级台阶 那么青蛙只有一种跳法
     * 假设只有2级台阶 那么青蛙有2种跳法 一级一级的跳  一次跳2级
     * 假设只有3级台阶 那么青蛙有3种跳法 一级一级的跳  一次跳2级 + 1级
     *
     */
    public int stepJumping(int n) {
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

    public int jumpFloor(int n) {
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }

}
