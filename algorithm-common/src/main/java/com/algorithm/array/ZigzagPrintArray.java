package com.algorithm.array;

/**
 *todo: 2023/2/5 09:52 九师兄
 * 【算法】使用zigzag方式打印矩阵、螺旋打印
 *  https://blog.csdn.net/qq_21383435/article/details/128888127
 **/
public class ZigzagPrintArray {

    public static void printMatrixZigZag(int[][] matrix) {
        int ar = 0;
        int ac = 0;
        int br = 0;
        int bc = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = false;
        while (ar != endR + 1) {
            printLevel(matrix, ar, ac, br, bc, fromUp);
            // a的行 只要不到行的结尾 那么a久不变
            ar = ac == endC ? ar + 1 : ar;
            // a的列 只要不到最后一列 a的列就一直增加
            ac = ac == endC ? ac : ac + 1;
            // b 与上面的类似
            bc = br == endR ? bc + 1 : bc;
            br = br == endR ? br : br + 1;
            // 打印方式每次取反
            fromUp = !fromUp;
        }
        System.out.println();
    }

    public static void printLevel(int[][] m,
                                  int tR, int tC,
                                  int dR, int dC,
                                  boolean f) {
        // f 控制 从右往左下方打印
        if (f) {
            while (tR != dR + 1) {
                System.out.print(m[tR++][tC--] + " ");
            }
        } else {
            // 否则 从左往右上方打印
            while (dR != tR - 1) {
                System.out.print(m[dR--][dC++] + " ");
            }
        }
    }


}
