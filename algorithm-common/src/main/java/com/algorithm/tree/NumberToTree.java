package com.algorithm.tree;

/**
 *todo: 2023/2/4 15:38 九师兄
 * 【算法】给定节点数求能组合的二叉树个数
 *  https://blog.csdn.net/qq_21383435/article/details/128882270
 **/
public class NumberToTree {

    public static int process(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int res = 0;
        for (int leftNum = 0; leftNum <= n - 1; leftNum++) {
            int leftWays = process(leftNum);
            int rightways = process(n - 1 - leftNum);
            res += leftWays * rightways;
        }
        return res;
    }


    public static int numTrees(int n) {
        if (n < 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < n + 1; i++) { //节点个数为i的时候
            for (int j = 0; j <= i-1; j++) {//左侧节点个数为j-1，右侧节点个数为i-j
                dp[i] += dp[j] * dp[i - j-1];
            }
        }
        return dp[n];
    }

}
