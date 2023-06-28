package com.algorithm.leetcode.swordoffer.offer29;

import com.algorithm.swordoffer.offer29.ClockwisePrintArray;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 10:51
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ClockwisePrintArrayTest {

    ClockwisePrintArray clockwisePrintArray = new ClockwisePrintArray();

    /***
     * todo: 九师兄  2023/6/28 20:26
     *  测试点：测试顺时针打印矩阵 矩阵缺少元素
     *[
     *  [1,2,3,4,5]
     *  [6,7,8,9,10]
     *  [11,12,13,14,15]
     *  [16,17,18,19]
     * ]
     * 结果如下
     * [1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
     * 但是这里打印了 20 这个值不存在 不应该打印
     */
    @Test
    public void spiralOrder() {
        int[][] data = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20,21},
        };
        int[] ints = clockwisePrintArray.spiralOrder(data);
        System.out.println(Arrays.toString(ints));
    }

    /***
     * todo: 九师兄  2023/6/28 20:27
     * 测试点：测试顺时针打印矩阵，矩阵完整
     * 打印结果如下
     * [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
     */
    @Test
    public void spiralOrder1() {
        int[][] data = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[] ints = clockwisePrintArray.spiralOrder(data);
        System.out.println(Arrays.toString(ints));
    }

    /***
     * todo: 九师兄  2023/6/28 20:28
     *  测试点：测试顺时针打印矩阵 矩阵多元素
     *
     *  [1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
     *
     *  可以看到矩阵中的21 没有打印出来
     */
    @Test
    public void spiralOrder2_1() {
        int[][] data = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20,21},
        };
        int[] ints = clockwisePrintArray.spiralOrder2(data);
        System.out.println(Arrays.toString(ints));
    }

}