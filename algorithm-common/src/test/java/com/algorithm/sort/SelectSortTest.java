package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-17 20:35
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SelectSortTest {

    @Test
    public void selectSortDemo1() {
        int[] arr = {1,5,2,4,2,7,9};
        SelectSort.selectSortDemo1(arr);
    }


    /**
     * 测试点： 选择排序测试性能
     */
    @Test
    public void selectSortDemo2() {
        int count = 80000;
        int[] arr =new  int[count];
        for (int i = 0; i < count; i++) {
            arr[i]= (int) (Math.random()*80000);
        }
        SelectSort.selectSortDemo2(arr);
    }
}