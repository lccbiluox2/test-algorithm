package com.algorithm.leetcode.swordoffer.offer29;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 10:28
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 29. 顺时针打印矩阵
 * <p>
 * 【算法】剑指 Offer 29. 顺时针打印矩阵
 * https://blog.csdn.net/qq_21383435/article/details/121727401
 */
public class ClockwisePrintArrayV2 {

    public static void spiralorderPrint(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC) {
            System.out.println("节点A:("+tR+","+tC+") 节点B:("+dR+","+dC+")");
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }

    public static void printEdge(int[][] m, int a, int b, int c, int d) {
        // 横着
        if (a == c) {
            System.out.println("[横着]节点A:("+a+","+b+") 节点B:("+c+","+d+")");
            for (int i = b; i <= d; i++) {
                System.out.print(m[a][i] + " ");
            }
        } else if (b == d) {
            System.out.println("[竖着]节点A:("+a+","+b+") 节点B:("+c+","+d+")");
            // 竖着
            for (int i = a; i <= c; i++) {
                System.out.print(m[i][b] + " ");
            }
        } else {
            //
            int curC = b;
            int curR = a;
            while (curC != d) {
                System.out.print(m[a][curC] + " ");
                curC++;
            }

            while (curR != c) {
                System.out.print(m[curR][d] + " ");
                curR++;
            }

            while (curC != b) {
                System.out.print(m[c][curC] + " ");
                curC--;
            }

            while (curR != a) {
                System.out.print(m[curR][b] + " ");
                curR--;
            }
        }
    }
}
