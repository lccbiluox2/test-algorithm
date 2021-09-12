package com.algorithm.sort;

import com.algorithm.swap.SwapTwo;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 16:00
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class InsertSortDemoTest {

    /**
     * 测试点：测试插入排序  [1, 2, 2, 3, 3, 5, 6, 8]
     */
    @Test
    public void insertSort() {
        Integer[] aa = new Integer[]{1,2,3,5,8,3,6,2};
        InsertSortDemo.insertSort(aa);
    }
}