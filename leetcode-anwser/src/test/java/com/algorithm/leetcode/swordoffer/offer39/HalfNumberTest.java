package com.algorithm.leetcode.swordoffer.offer39;

import com.algorithm.swordoffer.offer39.HalfNumber;
import lombok.Data;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-08 16:24
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
@Data
public class HalfNumberTest {

    HalfNumber halfNumber = new HalfNumber();

    @Test
    public void majorityElement() {
        int[] data = new int[]{-1,1, 2, 3, 2, 2, 2, 5, 4, 2};
        halfNumber.majorityElement(data);
    }

    @Test
    public void majorityElement1() {
        int[] data = new int[]{-1,1, 2, 3, 2, 2, 2, 5, 4, 2};
        int i = halfNumber.majorityElement1(data);
        System.out.println(i);
    }

    @Test
    public void majorityElement1_1() {
        int[] data = new int[]{3,2,3};
        int i = halfNumber.majorityElement1(data);
        System.out.println(i);
    }

    @Test
    public void majorityElement2_1() {
        int[] data = new int[]{3,2,3};
        int i = halfNumber.majorityElement2(data);
        System.out.println(i);
    }

    @Test
    public void majorityElement3() {
        int[] data = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        int i = halfNumber.majorityElement3(data);
        System.out.println(i);
    }

    /**
     * 当前数据：1
     * res：1
     * rationg：1
     *
     * 当前数据：2
     * rationg：0
     *
     * 当前数据：2
     * res：1
     * rationg：1
     *
     * 当前数据：2
     * rationg：2
     *
     * 当前数据：2
     * rationg：3
     *
     * 当前数据：5
     * rationg：2
     *
     * 当前数据：4
     * rationg：1
     *
     * 当前数据：5
     * rationg：0
     *
     * 2
     *
     */
    @Test
    public void majorityElement4() {
        int[] data = new int[]{1, 2, 2, 2, 2, 5, 4, 5};
        int i = halfNumber.majorityElement4(data);
        System.out.println(i);
    }
}