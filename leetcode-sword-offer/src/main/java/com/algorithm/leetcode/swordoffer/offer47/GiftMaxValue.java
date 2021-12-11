package com.algorithm.leetcode.swordoffer.offer47;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-10 12:24
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * <p>
 * <p>
 * 剑指 Offer 47. 礼物的最大价值
 */
public class GiftMaxValue {

    private int row;// 棋盘的列数
    private int column;// 棋盘的列数

    /**
     * [1,3,1,10],
     * [1,5,1,2],
     * [4,2,1,6]
     * <p>
     * 1 3 1 10 2 6 = 23
     * <p>
     * [1,3,1,5],
     * [1,5,1,2],
     * [4,2,1,6]
     * <p>
     * 1 2 1 5 2 6 = 17
     * 1 1 4 2 1 6 = 15
     * 1 3 5 2 1 6 = 18
     * <p>
     * [1,1,5,5],
     * [2,1,1,2],
     * [4,2,1,6]
     * <p>
     * 1 1 5 5 2 6 = 18
     * 1 2 4 2 1 6 = 16
     */
    public int maxValue(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        row = grid.length - 1;
        column = grid[0].length - 1;

        int sum = grid[0][0];


        int currnetRow = 0;
        int currnetColumn = 0;

        // 只要没有走到右下角
        while (currnetRow < row || currnetColumn < column) {
            int rowMax = getRowMax(grid, currnetRow, currnetColumn);
            int columnMax = getColumnMax(grid, currnetRow, currnetColumn);

            if (rowMax > columnMax) {
                // 如果走竖线更大，那么走竖线
                if (currnetRow <= row) {
                    currnetRow++;
                }
            } else {
                // 如果走横线线更大，那么走横线
                if (currnetColumn <= column) {
                    currnetColumn++;
                }
            }
            sum = sum + grid[currnetRow][currnetColumn];
            System.out.println("选择的点：" + grid[currnetRow][currnetColumn]);
        }

        return sum;
    }

    private int getColumnMax(int[][] grid, int currnetRow, int currnetColumn) {
        int sum = 0;
        while (currnetColumn < column) {
            sum = sum + grid[currnetRow][++currnetColumn];
        }
        return sum;
    }

    private int getRowMax(int[][] grid, int currnetRow, int currnetColumn) {
        int sum = 0;
        while (currnetRow < row) {
            sum = sum + grid[++currnetRow][currnetColumn];
        }
        return sum;
    }


    /**
     * 视频
     *
     * @param grid
     * @return
     */
    public int maxValue1(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        //dp[i][j]表示从grid[0][0]到grid[i - 1][j - 1]时的最大价值
        int[][] dp = new int[row + 1][column + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.println("i ="+i);
                System.out.println("j ="+j);
                System.out.println("i - 1="+(i - 1));
                System.out.println("j - 1="+(j - 1));
                int preTop = dp[i - 1][j];
                int preLeft = dp[i][j - 1];
                int xie = grid[i - 1][j - 1];
                dp[i][j] = Math.max(preTop, preLeft) + xie;

                printArray("累计值",dp);
            }
        }
        return dp[row][column];
    }

    private void printArray(String message, int[][] dp) {
        System.out.println(message);
        int lenght = dp.length;
        for (int i = 0; i < lenght; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}



