package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 21:00
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MergeSortTest {

    /**
     * 测试点：归并排序使用
     * 测试结果
     * [1, 2, 3, 5, 8, 3, 6, 2]
     * [1, 2, 3, 5, 8, 3, 6, 2]
     * [1, 2, 3, 5, 8, 3, 6, 2]
     * [1, 2, 3, 5, 3, 8, 6, 2]
     * [1, 2, 3, 5, 3, 8, 2, 6]
     * [1, 2, 3, 5, 2, 3, 6, 8]
     * [1, 2, 2, 3, 3, 5, 6, 8]
     */
    @Test
    public void mergeSort() {
        Integer[] aa = new Integer[]{1, 2, 3, 5, 8, 3, 6, 2};
        MergeSort.mergeSort(aa);

    }
}