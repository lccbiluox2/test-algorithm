package com.algorithm.dynamic;

import com.algorithm.common.RectangleCover;
import com.algorithm.common.StepJumpingV2;

import java.util.Arrays;

/***
 * todo: 九师兄  2023/5/22 20:11
 *
 */
public class CutRope {

    /***
     * todo: 九师兄  2023/5/21 12:12
     * 测试点: 剪绳子问题
     * 把一根绳子剪成多段，并且使得每段的长度乘积最大。
     *
     * 这个算法第一眼看到的时候，我想的就是 这个和青蛙跳台阶有点相似
     * {@link StepJumpingV2 }
     *
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

}
