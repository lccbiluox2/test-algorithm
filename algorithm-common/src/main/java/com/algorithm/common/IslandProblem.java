package com.algorithm.common;

import java.util.Arrays;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/24 上午9:56 4 九师兄
 *      岛屿问题
 */
public class IslandProblem {

    public static int countIslands(int[][] m) {
        if (m == null | m[0] == null) {
            return 0;
        }
        int N = m.length;
        int M = m[0].length;
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (m[i][j] == 1) {
                    res++;
                    printArray(m);
                    infect(m, i, j, N, M);
                }
            }
        }
        return res;
    }

    private static void printArray(int[][] m) {
        System.out.println("当前数组");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void infect(int[][] m, int i, int j, int N, int M) {
        if (i < 0 || i >= N || j < 0 || j >= M || m[i][j] != 1) {
            return;
        }
        // i，j没越界，并且当前位置值是1
        m[i][j] = 2;
        infect(m, i + 1, j, N, M);
        infect(m, i - 1, j, N, M);
        infect(m, i, j + 1, N, M);
        infect(m, i, j - i, N, M);
    }
}
