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
     * 假设长度为1 那么最长有 1
     * 假设长度为2 那么最长有 1*1=1
     * 假设长度为3 那么最长有 1*2=2
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
