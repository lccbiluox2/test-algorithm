package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-19 18:10
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class QuickSortTest {

    @Test
    public void quicKSort() {
        int[] aa = new int[]{1, 2, 3, 5, 8, 3, 6,10};
        QuickSort.quicKSort(aa);
    }

}