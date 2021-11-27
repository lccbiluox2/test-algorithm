package com.algorithm.leetcode.swordoffer.offer53;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 14:07
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 数组中查找相同的元素
 */
public class FindNum {

    public int search(int[] nums, int target) {
        if (nums.length < 1) {
            return 0;
        }
        // 数组的最大值下标
        int hight = nums.length - 1;
        // 首先递归查找到元素所在位置，有可能为是重复元素的第一个或者第二个
        int index = recursionBinarySearch(nums, target, 0, hight);
        // 一个都没有直接返回
        if (index == -1) {
            return 0;
        }

        // 如果有的话，可能有重复的，往左边找 和 往右边找
        int left = index - 1;
        int right = index;
        int count = 0;
        while (right <= hight && nums[right] == target) {
            count++;
            right++;
        }

        while (-1 < left && nums[left] == target) {
            count++;
            left--;
        }
        return count;
    }

    /**
     * 使用递归的二分查找
     * title:recursionBinarySearch
     *
     * @param arr 有序数组
     * @param key 待查找关键字
     * @return 找到的位置
     */
    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        int middle = (low + high) / 2;            //初始中间位置
        if (arr[middle] > key) {
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }

    }


    public int search1(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int count = 0;
        // 这里是先找到中间元素大于目标元素的
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target)
                right = mid;
            if (nums[mid] < target)
                left = mid + 1;
        }
        System.out.println("左边位置大于右边：" + left +" 值 "+nums[left]);
        while (left < nums.length && nums[left++] == target)
            count++;
        return count;
    }






}
