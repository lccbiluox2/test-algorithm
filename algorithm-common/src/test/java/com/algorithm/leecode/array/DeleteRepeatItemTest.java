package com.algorithm.leecode.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-13 15:48
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class DeleteRepeatItemTest {

    /**
     * 耗时：
     * 12151875
     */
    @Test
    public void removeDuplicates() {
        long start  = System.nanoTime();
        int[] aa = new int[]{1, 1, 2, 3, 3};
        DeleteRepeatItem.removeDuplicates(aa);
        long end  = System.nanoTime();
        System.out.println(end - start);
    }

    /**
     * 耗时：1022542 与上面相比差了一个数量级的性能 10倍的性能提升
     */
    @Test
    public void removeDuplicates1() {
        long start  = System.nanoTime();
        int[] aa = new int[]{1, 1, 2, 3, 3};
        DeleteRepeatItem.removeDuplicates1(aa);
        long end  = System.nanoTime();
        System.out.println(end - start);
    }
}