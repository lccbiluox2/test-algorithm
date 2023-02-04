package com.algorithm.array;

/**
 *todo: 2023/2/4 21:49 九师兄
 * 【算法】顺时钟90度转动方形矩阵
 *  https://blog.csdn.net/qq_21383435/article/details/128885917
 **/
public class RotateTheMatrix90Degrees {

    public static void  rotate(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC) {
            rotateEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }

    public static void rotateEdge(int[][] m, int a, int b, int c, int d) {
        int times = d - b;
        int tmp = 0;
        for (int i = 0; i != times; i++) {
            tmp = m[a][b + i];
            m[a][b + i] = m[c - i][b];
            m[c - i][b] = m[c][d - i];
            m[c][d - i] = m[a + i][d];
            m[a + i][d] = tmp;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i != matrix.length; i++) {
            for (int j = 0; j != matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
