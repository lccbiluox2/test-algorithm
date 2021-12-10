package com.algorithm.leetcode.swordoffer.offer04;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-09 21:05
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 04. 二维数组中的查找
 *
 */
public class DoubleArraySearch {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length-1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length){
            int indexData = matrix[i][j];
            if(target > indexData){
                j++;
            }else if(target < indexData){
                i--;
            }else {
                return true;
            }
        }
        return false;
    }


    /**
     * 二分查找算法
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        int shortDim = Math.min(m, n);
        for (int i = 0; i < shortDim; i++) {
            boolean rowFound = binarySearchRow(matrix, i, target);
            boolean colFount = binarySearchCol(matrix, i, target);
            if (rowFound || colFount) {
                return true;
            }
        }
        return false;
    }
    
    private boolean binarySearchRow(int[][] matrix,
                                    int row, int target) {
        int lo = row;
        int hi = matrix[0].length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
    
    private boolean binarySearchCol(int[][] matrix,
                                    int col, int target) {
        int le = col;
        int hi = matrix.length - 1;
        while (le <= hi) {
            int mid = le + (hi - le) / 2;
            if (matrix[mid][col] == target) {
                return true;
            } else if (matrix[mid][col] < target) {
                le = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }


    /**
     * 测试点 线性查找
     */
    public boolean findNumberIn2DArray3(int[][] matrix,
                                       int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;

        int i = m - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] < target) j++;
            else if (matrix[i][j] > target) i--;
            else return true;
        }

        return false;
    }



}
