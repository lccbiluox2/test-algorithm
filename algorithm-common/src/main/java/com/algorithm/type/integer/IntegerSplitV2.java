package com.algorithm.type.integer;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/2/25 17:44 4 九师兄
 *       【算法】斜率优化、正数分裂、动态规划优化
 *       https://blog.csdn.net/qq_21383435/article/details/129215621
 */
public class IntegerSplitV2 {

    public static int ways2(int n) {
        if (n < 1) {
            return 0;
        }
        // 画一个表
        int[][] dp = new int[n + 1][n + 1];
        for (int pre = 1; pre < dp.length; pre++) {
            dp[pre][0] = 1; // 0列的位置都是1
        }

        for (int pre = n; pre > 0; pre--) {
            for (int rest = pre; rest <= n; rest++)
                for (int i = pre; i <= rest; i++) {
                    dp[pre][rest] += dp[i][rest - i];
                }
        }
        return dp[1][n];
    }

}
