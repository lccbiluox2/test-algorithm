package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-24 19:11
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 桶排序 https://blog.csdn.net/qq_21383435/article/details/120948706
 */
public class RadixSortTest {

    /**
     * 测试点： 推导代码如下
     *
     * 第一轮：[542, 53, 3, 14, 214, 748]
     * 第2轮：[3, 14, 214, 542, 748, 53]
     * 第3轮：[3, 14, 53, 214, 542, 748]
     *
     */
    @Test
    public void radixSort() {
        int[] arr = {53,3,542,748,14,214};
        RadixSort.radixSort(arr);
    }

    /**
     * 测试点：测试上面的推导过程
     *
     * 第0轮：[542, 53, 3, 14, 214, 748]
     * 第1轮：[3, 14, 214, 542, 748, 53]
     * 第2轮：[3, 14, 53, 214, 542, 748]
     */
    @Test
    public void radixSortEvolution() {
        int[] arr = {53,3,542,748,14,214};
        RadixSort.radixSortEvolution(arr);
    }
}