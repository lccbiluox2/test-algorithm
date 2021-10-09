package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-19 19:55
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class CountSortTest {

    @Test
    public void ranking() {
        int[] aa = new int[]{1, 2, 3, 5,5,6,8,9,9,5, 8, 3, 6,9};
        int count = CountSort.ranking(aa, 8);
        System.out.println(count);
    }

    @Test
    public void cumulative() {
        int[] aa = new int[]{1, 2, 3, 5,5,6,8,9,9,5, 8, 3, 6,9};
        int[] count = CountSort.cumulative(aa);
        System.out.println(count);
    }


    @Test
    public void countSortTest() {
        int[] aa = new int[]{1, 2, 3, 5,5,6,8,9,9,5, 8, 3, 6,9};
        int[] count = CountSort.countSort(aa);
        System.out.println(count);
    }
}