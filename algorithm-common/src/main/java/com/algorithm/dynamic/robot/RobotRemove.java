package com.algorithm.dynamic.robot;

public class RobotRemove {
    /***
     * todo: 九师兄  2023/3/12 11:54
     *  https://www.bilibili.com/video/BV16L4y1q7rD/?spm_id_from=333.788&vd_source=44c491a7c7c735ef8081cb60288bb47e
     *  【算法】动态规划、机器人移动的不同的路径、动态规划题目的三部曲
     *  https://blog.csdn.net/qq_21383435/article/details/129473765
     */
    public int uniquePaths(int m,int n){
        if(m == 0 || n == 0) return 0;
        int[][] dp  = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
