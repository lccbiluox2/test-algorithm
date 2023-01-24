package com.algorithm.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class IslandProblemTest {

    /**
     * todo:  10_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_10  2023/1/24 上午10:55 九师兄
     *     测试点: 测试岛屿问题，感染问题
     *     【算法】矩阵0和1、岛屿连接问题
     *     https://blog.csdn.net/qq_21383435/article/details/128755367
     *
     *
     * 当前数组
     * 1 0 1 1 0 1
     * 1 0 1 0 1 1
     * 0 0 1 1 0 0
     * 1 0 0 0 0 1
     * 当前数组
     * 2 0 1 1 0 1
     * 2 0 1 0 1 1
     * 0 0 1 1 0 0
     * 1 0 0 0 0 1
     * 当前数组
     * 2 0 2 2 0 1
     * 2 0 2 0 1 1
     * 0 0 2 2 0 0
     * 1 0 0 0 0 1
     * 当前数组
     * 2 0 2 2 0 2
     * 2 0 2 0 2 2
     * 0 0 2 2 0 0
     * 1 0 0 0 0 1
     * 当前数组
     * 2 0 2 2 0 2
     * 2 0 2 0 2 2
     * 0 0 2 2 0 0
     * 2 0 0 0 0 1
     */
    @Test
    public void countIslands() {
        int[][] arr = new int[][]{
                {1,0,1,1,0,1},
                {1,0,1,0,1,1},
                {0,0,1,1,0,0},
                {1,0,0,0,0,1}
        };
        int i = IslandProblem.countIslands(arr);
        System.out.println(i);
    }
}