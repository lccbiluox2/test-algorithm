package com.algorithm.datastructure;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 10:30
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 稀疏数组
 */
public class SparseArray {

    /**
     * 测试点：测试五指棋
     * 二维数组 转 稀疏数组
     */
    public static void fiveFingersMove() {
        int[][] chessArra = new int[11][11];
        chessArra[1][2] = 1;
        chessArra[2][3] = 2;

        System.out.println("原始数组");
        ArraysUtils.printIntTowArray(chessArra);

        int sum = getDataSize(chessArra);
        System.out.println("数组实际数字" + sum);

        // 创建稀疏数组
        int seperatorArr[][] = new int[sum + 1][3];
        seperatorArr[0][0] = chessArra.length;
        seperatorArr[0][1] = chessArra[0].length;
        seperatorArr[0][2] = sum;


        int shuLength = chessArra[0].length;
        int count = 0;
        for (int i = 0; i < chessArra.length; i++) {
            for (int j = 0; j < shuLength; j++) {
                if (chessArra[i][j] != 0) {
                    count++;
                    seperatorArr[count][0] = i;
                    seperatorArr[count][1] = j;
                    seperatorArr[count][2] = chessArra[i][j];
                }
            }
        }
        ArraysUtils.printIntTowArray(seperatorArr);

        System.out.println("恢复数据");
        // 将稀疏数组恢复成原始数据
        int original[][] = new int[seperatorArr[0][0]][seperatorArr[0][1]];
        for (int i = 1; i < seperatorArr.length; i++) {
            int hengIndex = seperatorArr[i][0];
            int shuIndex = seperatorArr[i][1];
            int value = seperatorArr[i][2];
            original[hengIndex][shuIndex] = value;
        }
        ArraysUtils.printIntTowArray(original);

    }

    /**
     * 获取数组的实际数据多少个
     *
     * @param chessArra
     * @return
     */
    private static int getDataSize(int[][] chessArra) {
        int sum = 0;
        for (int i = 0; i < chessArra.length; i++) {
            int length = chessArra[i].length;
            for (int j = 0; j < length; j++) {
                if (chessArra[i][j] != 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
