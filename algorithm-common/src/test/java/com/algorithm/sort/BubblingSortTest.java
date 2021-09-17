package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-17 21:02
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BubblingSortTest {

    /**
     * 测试点：冒泡排序
     *
     * [9, 5, 1, 7, 10]
     * [5, 9, 1, 7, 10]
     * [5, 1, 9, 7, 10]
     * [5, 1, 7, 9, 10]
     * [5, 1, 7, 9, 10] 多余排序
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]  多余排序
     * [1, 5, 7, 9, 10]  多余排序
     * [1, 5, 7, 9, 10]  多余排序
     * [1, 5, 7, 9, 10]  多余排序
     * [1, 5, 7, 9, 10]  多余排序
     * [1, 5, 7, 9, 10]  多余排序
     * [1, 5, 7, 9, 10]  多余排序
     * [1, 5, 7, 9, 10] 多余排序
     * [1, 5, 7, 9, 10] 多余排序
     * [1, 5, 7, 9, 10] 多余排序
     * [1, 5, 7, 9, 10] 多余排序
     * [1, 5, 7, 9, 10] 多余排序
     * [1, 5, 7, 9, 10] 多余排序
     * [1, 5, 7, 9, 10] 多余排序
     * [1, 5, 7, 9, 10] 多余排序
     *
     * 可以看到
     */
    @Test
    public void bubblingSort() {
        int[] arr = {9,5,1,7,10};
        BubblingSort.bubblingSort(arr);
    }

    /**
     * [9, 5, 1, 7, 10]
     * [5, 9, 1, 7, 10]
     * [5, 1, 9, 7, 10]
     * [5, 1, 7, 9, 10]
     * [5, 1, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     */
    @Test
    public void bubblingSort1() {
        int[] arr = {9,5,1,7,10};
        BubblingSort.bubblingSort1(arr);
    }

    /**
     * 测试点：网上教程 别人只用了 10次循环 还特别简单 我的却要20次 人比人气死人
     * [5, 9, 1, 7, 10]
     * [5, 1, 9, 7, 10]
     * [5, 1, 7, 9, 10]
     * [5, 1, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     * [1, 5, 7, 9, 10]
     *
     */
    @Test
    public void bubblingSort2() {
        int[] arr = {9,5,1,7,10};
        BubblingSort.bubblingSort2(arr);
    }

    /**
     * 测试点： 冒泡排序的最优算法
     */
    @Test
    public void bubbleSort() {
        int[] arr = {9,5,1,7,10};
        BubblingSort.bubbleSort(arr);
    }

}