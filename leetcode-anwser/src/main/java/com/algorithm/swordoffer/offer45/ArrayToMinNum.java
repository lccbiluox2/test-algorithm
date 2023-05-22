package com.algorithm.swordoffer.offer45;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-12 19:52
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 【算法】剑指 Offer 45. 把数组排成最小的数 【重刷】
 */
public class ArrayToMinNum {

    /**
     * 3,30,34,5,9
     * <p>
     * 2,30,34,1,9
     * 2130349
     *
     * @param nums
     * @return
     */
    public String minNumber(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (o1, o2) -> ((o1 + o2).compareTo(o2 + o1)));
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }


}
