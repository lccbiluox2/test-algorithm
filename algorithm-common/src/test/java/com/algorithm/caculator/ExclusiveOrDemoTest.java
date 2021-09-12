package com.algorithm.caculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 13:56
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ExclusiveOrDemoTest {

    /**
     * 测试点： 已知一个数组中，只有一个数字出现奇数次，其他数字出现偶数次，如何找到这个奇数的数字，而且要求尽量简单
     *      而且时间复杂度为O(n)
     *
     * 一路异或下去，就得到了这个值。
     */
    @Test
    public void anOddNumber() {
        Integer[] aa = new Integer[]{3,2,2,3,5,10,10};
        ExclusiveOrDemo.anOddNumber(aa);
    }

    /**
     * 测试点： 题目：如果一个数组中，有2种数字出现了奇数次，其他的出现了偶数次，怎么找到这两种数？
     * 而且要求尽量简单，而且时间复杂度为O(n)
     *
     * 测试结果：
     *
     * 10 5
     */
    @Test
    public void twoOddNumberTest() {
        Integer[] aa = new Integer[]{3,2,2,3,5,10,12,12};
        ExclusiveOrDemo.twoOddNumber(aa);
    }
}