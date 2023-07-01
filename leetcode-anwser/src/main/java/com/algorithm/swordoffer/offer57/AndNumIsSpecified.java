package com.algorithm.swordoffer.offer57;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 21:18
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 57. 和为s的两个数字
 * <p>
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 * 示例 2：
 * <p>
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 有序数组的 Two Sum
 */
public class AndNumIsSpecified {

    /**
     * 暴力求解法
     */
    public int[] twoSum(int[] nums, int target) {
        int[] list = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    list[0] = nums[i];
                    list[1] = nums[j];
                    return list;
                }
                // 这里是优化 因为数组是递增的
                if ((nums[i] + nums[j]) > target) {
                    break;
                }
            }
        }
        return null;
    }

    /**
     * 随机算法
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] list = new int[2];
        Random random = new Random();
        while (true) {
            int index1 = random.nextInt(nums.length);
            int index2 = random.nextInt(nums.length);
            while (index1 == index2) {
                index2 = random.nextInt(nums.length);
            }
            if ((nums[index1] + nums[index2]) == target) {
                list[0] = nums[index1];
                list[1] = nums[index2];
                return list;
            }
        }
    }

    /**
     * 双指针 算法贼快
     */
    public int[] twoSum3(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {

            int cur = nums[left] + nums[right];
            System.out.println(cur);
            if (cur == target)
                return new int[]{nums[left], nums[right]};
            else if (cur > target)
                right--;
            else
                left++;
        }

        return new int[]{};
    }

    /**
     * 数组：1,3,4,7,9,12,14,15
     * 目标：11
     * <p>
     * 10
     * 10 8
     * 10 8 7
     * 10 8 7 返回 7 和 4
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum4(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            // 这个值与目标值的差不在set中，那么加入
            if (!set.contains(target - num))
                set.add(num);
            else
                return new int[]{num, target - num};
        }

        return new int[]{};
    }

    public int[] twoSum5(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int num = nums[left] + nums[right];
            if (num > target) {
                right--;
            }
            if (num < target) {
                left++;
            }
            if (num == target) {
                return new int[]{nums[left], nums[right]};
            }
        }
        return null;
    }

}
