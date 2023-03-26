package com.algorithm.swordoffer.offer12;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-24 22:11
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Leetcode1 {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //  搜索开始的位置可以是网格 board 中的任一个位置
                // z只要有一条路走通了，则可以直接返回结果
                if (backtrack(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    // board：网格, i：当前行, j：当前列, word：待匹配字符串, k：当前匹配到字符串word的位置
    public boolean backtrack(char[][] board, int i, int j, String word, int k) {

        printArray("A当前状态", board, i, j, k, word);

        // 1. 下标越界，2. 当前位置与word中字符不匹配，则可以直接返回（剪枝）
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] != word.charAt(k)) return false;

        if (k == word.length() - 1) return true; // 说明word中的字符全部被匹配

        board[i][j] = '\0'; // 使用board数组充当了访问标记数组，节省了空间（非常妙！）

        printArray("B当前状态", board, i, j, k, word);
        // 做出选择：可以向 上，下，左，右移动，只要有一条路可以走通即可, 所以使用 ||
        boolean res =
                backtrack(board, i, j + 1, word, k + 1)
                        || backtrack(board, i + 1, j, word, k + 1)
                        || backtrack(board, i - 1, j, word, k + 1)
                        || backtrack(board, i, j - 1, word, k + 1);

        board[i][j] = word.charAt(k); // 撤销选择, 还原board数组

        printArray("C当前状态", board, i, j, k, word);

        return res; // 返回结果
    }

    private void printArray(String message, char[][] board, int row, int columns,
                            int k, String word) {
        System.out.println(message);
        System.out.println("访问地址（x=" + row + " y=" + columns+")");
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println("当前要访问的字符串 k=" + k +" 对应的字符："+word.charAt(k));
        System.out.println();
    }

}
