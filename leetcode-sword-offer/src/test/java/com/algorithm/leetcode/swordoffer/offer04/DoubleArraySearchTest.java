package com.algorithm.leetcode.swordoffer.offer04;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-09 21:19
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class DoubleArraySearchTest {

    private DoubleArraySearch client = new DoubleArraySearch();

    @Test
    public void findNumberIn2DArray() {
        int[][] data = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean numberIn2DArray = client.findNumberIn2DArray(data, 9);
        System.out.println(numberIn2DArray);
    }

    @Test
    public void findNumberIn2DArray2() {
        int[][] data = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean numberIn2DArray = client.findNumberIn2DArray2(data, 17);
        System.out.println(numberIn2DArray);
    }

    @Test
    public void findNumberIn2DArray3() {
        int[][] data = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean numberIn2DArray = client.findNumberIn2DArray3(data, 17);
        System.out.println(numberIn2DArray);
    }
}