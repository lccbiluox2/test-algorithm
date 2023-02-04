package com.algorithm.leetcode.swordoffer.offer29;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 10:28
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 29. 顺时针打印矩阵
 *
 * 【算法】剑指 Offer 29. 顺时针打印矩阵
 *  https://blog.csdn.net/qq_21383435/article/details/121727401
 */
public class ClockwisePrintArray {

    /**
     * [
     * [1,2,3]
     * [4,5,6]
     * [7,8,9]
     * ]
     * <p>
     * [1,2,3,6,9,8,7,4,5]
     * <p>
     * [
     * [1,2,3,4]
     * [5,6,7,8]
     * [9,10,11,12]
     * ]
     * <p>
     * [1,2,3,4,8,12,11,10,9,5,6,7]
     * <p>
     * [
     * [1,2,3,4,5]
     * [6,7,8,9,10]
     * [11,12,13,14,15]
     * [16,17,18,19]
     * ]
     * <p>
     * matrix[0][0]
     * matrix[0][1]
     * matrix[0][2]
     * matrix[0][3]
     * matrix[0][4]
     * <p>
     * matrix[1][matrix[1].length-1]
     * matrix[2][matrix[1].length-1]
     * matrix[3][matrix[1].length-1]
     * <p>
     * matrix[3][matrix[1].length-1 - 1]
     * matrix[3][matrix[1].length-1 - 2]
     * matrix[3][matrix[1].length-1 - 3]
     * <p>
     * matrix[3][0]
     * matrix[2][0]
     * matrix[1][0]
     * <p>
     * matrix[1][1]
     * matrix[1][2]
     * matrix[1][3]
     *
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        int column = matrix[0].length;
        int row = matrix.length;
        //
        int[] res = new int[column * row];
        // 写入到res数组的指针
        int position = 0;
        // 代表的是第几遍循环
        int count = 0;

        while (count * 2 < column && count * 2 < row) {
            int endColumn = column - 1 - count;
            int endRow = row - 1 - count;

            // 打印上方
            // 只有这个不用判断，因为是最先打印的这个
            // 如果最内圈只有一行，那么其他三个方向就都不要打印了，所以其他三个方向要判断
            for (int i = count; i <= endColumn; i++) {
                res[position++] = matrix[count][i];
            }

            // 打印右侧
            if (count < endRow) {
                for (int i = count + 1; i <= endRow; i++) {
                    res[position++] = matrix[i][endColumn];
                }
            }

            // 打印下方
            if (count < endColumn && count < endRow) {
                for (int i = endColumn - 1; i >= count; i--) {
                    res[position++] = matrix[endRow][i];
                }
            }

            // 打印左侧
            if (count < endColumn && count < endRow) {
                for (int i = endRow - 1; i > count; i--) {
                    res[position++] = matrix[i][count];
                }
            }

            count++;
        }

        return res;
    }

    public int[] spiralOrder2(int[][] matrix) {
        //特判
        if(matrix == null ||matrix.length == 0){
            return new int[0];
        }

        //初始化
        int left = 0, top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length - 1;
        /**
         * （0，0） （0,4）
         * （0，3） （3,4）
         */

        int[] res = new int[(right+1)*(bottom+1)];
        int k = 0;

        //循环打印
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){ //从左到右
                res[k++] = matrix[top][i];
            }
            top ++;
            for(int i = top; i <= bottom; i++){ //从上到下
                res[k++] = matrix[i][right];
            }
            right --;
            for(int i = right; i >= left && top <= bottom; i--){    //从右到左
                res[k++] = matrix[bottom][i];
            }
            bottom --;
            for(int i = bottom; i >= top && left <= right; i--){    //从下到上
                res[k++] = matrix[i][left];
            }
            left ++;
        }
        return res;
    }



}
