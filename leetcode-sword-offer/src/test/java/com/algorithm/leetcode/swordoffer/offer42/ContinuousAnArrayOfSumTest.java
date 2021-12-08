package com.algorithm.leetcode.swordoffer.offer42;

import com.algorithm.leetcode.swordoffer.entity.Tuple2;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-06 22:37
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ContinuousAnArrayOfSumTest {

    ContinuousAnArrayOfSum client = new ContinuousAnArrayOfSum();

    @Test
    public void maxSubArray() {
        int[] data = new int[]{1, 3, 5, -4, -6, 8, 9, -18, 22};
        int i = client.maxSubArray(data);
        System.out.println(i);
    }

    @Test
    public void maxSubArray1() {
        int[] data = new int[]{1, 3, 17, -4, -6, 6, -18, 17};
        int i = client.maxSubArray(data);
        System.out.println(i);
    }

    @Test
    public void maxSubArray1_1() {
        int[] data = new int[]{1, 3, 17, -4, -6, 6, -18, 17};
        int i = client.maxSubArray1(data);
        System.out.println(i);
    }

    /**
     * 测试点：想测试最大子数组之和是哪几个数字组成的
     *
     * 最大的子数组之和为：14
     * 最适合的左索引值：0
     * 最适合的右索引值：3
     * 数组的总和为：4
     *
     */
    @Test
    public void maxSubArray3_1() {
        int[] data = new int[]{6, 3, -2, 7, -15, 1, 2, 2};
        System.out.println("最大的子数组之和为："+client.findMaxSubArray(data, 0, data.length-1));
        Map<String, Integer> map = client.getMap();
        System.out.println("最适合的左索引值："+map.get("leftIndex"));
        System.out.println("最适合的右索引值："+map.get("rightIndex"));
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        System.out.println("数组的总和为："+total);
    }
}