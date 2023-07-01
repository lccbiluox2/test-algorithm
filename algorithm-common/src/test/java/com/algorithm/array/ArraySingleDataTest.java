package com.algorithm.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraySingleDataTest {

    private ArraySingleData arraySingleData = new ArraySingleData();

    /***
     * todo: 九师兄  2023/7/1 15:13
     *
     * https://www.nowcoder.com/practice/389fc1c3d3be4479a154f63f495abff8?tpId=13&tqId=11193&tab=answerKey&from=cyc_github
     *
     * 描述
     * 一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
     *
     * 数据范围：数组长度 2\le n \le 10002≤n≤1000，数组中每个数的大小 0 < val \le 10000000<val≤1000000
     * 要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
     *
     * 提示：输出时按非降序排列。
     * 示例1
     * 输入：
     * [1,4,1,6]
     * 复制
     * 返回值：
     * [4,6]
     * 复制
     * 说明：
     * 返回的结果中较小的数排在前面
     *
     * 这个题注意是只有2个数字出现了一次
     */
    @Test
    public void findNumsAppearOnce() {
        int[] arr = new int[]{1,4,1,6};
        int[] numsAppearOnce = arraySingleData.findNumsAppearOnce(arr);
        System.out.println(Arrays.toString(numsAppearOnce));
    }
}