package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-19 14:23
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ShellSortTest {

    @Test
    public void sort2() {
        int[] arr = {9,5,1,7,10};
        ShellSort.sort2(arr);
    }

    @Test
    public void sort() {
        int[] arr = {9,5,1,7,10};
        ShellSort.sort(arr);
    }

    /**
     * 测地点：测试希尔排序的简单大小最优值
     *  h = 3*h+1
     */
    @Test
    public void kunthSort() {
        int[] arr = {9,5,1,7,10};
        ShellSort.kunthSort(arr);
    }
}