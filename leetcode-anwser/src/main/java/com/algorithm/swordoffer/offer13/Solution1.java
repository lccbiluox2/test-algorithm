package com.algorithm.swordoffer.offer13;

import javafx.util.Pair;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 14:59
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution1 {


    // 将m、n、k定义为全局变量
    int m, n, k;
    // 标记访问过的位置
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        // 初始化数组，元素全部为false，访问过的记为true
        visited = new boolean[m][n];
        // 开始搜索
        int res = dfs(0, 0);

        return res;
    }

    public int dfs(int i, int j) {
        // 1. 判断边界
        // 2. 判断是否被访问过了
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
            return 0;
        }

        // 判断是否超过k
        if (help(i, j)) {
            return 0;
        }

        // 符合条件的做个标记，只能统计一次，再次访问就无效了
        visited[i][j] = true;
        printArray("当前访问", visited);

        // 能访问到这里说明已经确认访问到了一次了，因此在递归结束回溯的时候要加上当前的1作为返回值得以累加
        // 然后递归四个方向
        int res = 1 + dfs(i + 1, j) +
                dfs(i - 1, j) +
                dfs(i, j + 1) +
                dfs(i, j - 1);

        return res;
    }

    // 判断坐标各位之和是否超过k
    public boolean help(int i, int j) {
        int count = 0;
        while (i != 0) {
            count += i % 10;
            i /= 10;
        }
        while (j != 0) {
            count += j % 10;
            j /= 10;
        }
        return count > k;
    }


    private void printArray(String message, boolean[][] board) {
        System.out.println(message);
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println();
    }


}
