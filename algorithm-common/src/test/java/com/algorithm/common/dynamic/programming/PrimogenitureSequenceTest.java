package com.algorithm.common.dynamic.programming;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-05-26 21:18
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class PrimogenitureSequenceTest {

    /**
     * 测试结果：测试结果为4
     * 结果应该为3
     *
     * 最慢的算法之一
     */
    @org.junit.Test
    public void cal() {
        int[] numbers = new int[] {1,5,2,4,3};
        PrimogenitureSequence primogenitureSequence = new PrimogenitureSequence();
        System.out.println(primogenitureSequence.lengthOfList(numbers));
    }
}