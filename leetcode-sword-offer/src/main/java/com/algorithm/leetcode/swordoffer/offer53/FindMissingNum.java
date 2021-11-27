package com.algorithm.leetcode.swordoffer.offer53;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 19:08
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class FindMissingNum {


    /**
     * 字节写的
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i] - nums[i - 1];
            if (num != 1) {
                return nums[i - 1] + 1;
            }
        }
        if(nums[0] == 0){
            return nums[nums.length-1]+1;
        }else {
            return 0;
        }
    }

    public int missingNumber1(int[] nums) {
        int i = missingNumber(nums, nums.length);
        return i;
    }

  
    /**
     * 二分法
     * @param numsSize
     * @return
     */
   public int missingNumber(int[] nums, int numsSize) {
        // 对于有序数组, 大小为i的数应当处于下标为i的位置上, 如果不在, 说明在该数字之前发生了错位
        int left = 0, right = numsSize - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // 如果中间的数字不等于下标 那么说明[left,mid]中间缺少数据呀
            if (nums[mid] != mid) {
                right = mid;
            } else {
                // 否则的话就是 [mid,right] 中间缺少数据呀
                left = mid + 1;
            }
        }
        // 如果从0 ~ n - 1都不缺值, 则缺少的是n
       if(left == numsSize - 1 && nums[left] == left){
           return left + 1;
       }
        return  left;
    }

    /**
     * 公式方法
     *
     * 理论的和减去实际的和即为缺少的数字
     *
     * @param nums
     * @return
     */
    public int missingNumber3(int[] nums) {
        //计算出0-n的和  n*(n+1)/2
        int sum = nums.length * (nums.length+1)/2;
        return  sum - Arrays.stream(nums).sum() ;
    }
}
