package com.algorithm.common;

import java.util.Arrays;

/***
 * todo: 九师兄  2023/5/21 12:45
 *
 * 【算法】青蛙跳台阶
 * https://blog.csdn.net/qq_21383435/article/details/130790738
 */
public class StepJumpingV2 {

    /***
     * todo: 九师兄  2023/5/21 12:12
     * 测试点：青蛙跳台阶 动态规划方式解答
     * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级...
     * 它也可以跳上 n 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     *
     * 这个算法第一眼看到的时候，我想的就是 测试矩形覆盖
     * {@link RectangleCover }
     * 和这个很相似了
     *
     * 假设只有一级台阶 那么青蛙只有一种跳法
     * 假设只有2级台阶 那么青蛙有2种跳法 一级一级的跳  一次跳2级
     * 假设只有3级台阶 那么青蛙有3种跳法 一级一级的跳  一次跳2级 + 1级 一次3级
     * 假设只有4级台阶 那么青蛙有5种跳法 一级一级的跳  （2级1级1级）（2级2级） （3级，1级）（4级）
     * 假设只有5级台阶 那么青蛙有6种跳法 一级一级的跳  （2级1级1级1级）（2级2级1级） （3级2级1级）（3级1级1级1级）（4级1级）
     *
     *
     */
    public int jumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j];
        return dp[target - 1];
    }

    public int humpFloorIIV2(int target) {
        return (int) Math.pow(2, target - 1);
    }
}
