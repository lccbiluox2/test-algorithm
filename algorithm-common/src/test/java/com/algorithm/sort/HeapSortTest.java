package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-31 11:45
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 *
 */
public class HeapSortTest {

    @Test
    public void adjustHeap() {
        int[] aa = new int[]{4,6,8,5,9};
        HeapSort.adjustHeap(aa,1,aa.length);
        // 第一次调整  [4, 9, 8, 5, 6]
        System.out.println(Arrays.toString(aa));

        // 在上面的基础上第二次调整
        HeapSort.adjustHeap(aa,0,aa.length);
        // 第一次调整 [9, 6, 8, 5, 4]
        System.out.println(Arrays.toString(aa));
    }

    @Test
    public void heapSort() {
        int[] aa = new int[]{4,6,8,5,9};
        HeapSort.heapSort(aa);
    }
}