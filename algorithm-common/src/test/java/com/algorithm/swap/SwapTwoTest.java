package com.algorithm.swap;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 12:41
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SwapTwoTest {

    /**
     * 测试点：测试不使用第三个变量交换2个数据
     * 测试结果
     *    测试成功 输出：2 1
     */
    @Test
    public void swapTwoData() {
        SwapTwo.swapTwoData();
    }

    /**
     * 测试点：测试不使用第三个变量交换2个数据  如果是数组呢
     * 测试结果
     *    测试成功 输出：2 1
     */
    @Test
    public void swapTwoData1() {
        Integer[] aa = new Integer[]{1,2,3};
        SwapTwo.swapTwoData1(aa,0,1);
    }

    /**
     * 测试点：测试不使用第三个变量交换2个数据  如果是数组呢
     * 测试结果
     *    测试成功 输出：1 1
     *
     * 这里要求数组的两个要交换的数据内存地址都是不一样的，如果一样，会都变成0
     */


}