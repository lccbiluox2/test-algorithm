package com.algorithm.leetcode.array;

import com.algorithm.utils.ArraysUtils;

import java.util.ArrayList;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-13 15:44
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class DeleteRepeatItem {

    /**
     * 测试点： 删除数组中的重复项
     *
     * @param nums
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
//            ArraysUtils.printIntArray(nums);
        }
        return i + 1;
    }

    /**
     * 上个代码的优化
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates1(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[i - 1]) {
                nums[i++] = n;
            }
//            ArraysUtils.printIntArray(nums);
        }
        return i;
    }
}
