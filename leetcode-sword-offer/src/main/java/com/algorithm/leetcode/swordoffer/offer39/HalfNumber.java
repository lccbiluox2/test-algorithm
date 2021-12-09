package com.algorithm.leetcode.swordoffer.offer39;

import com.algorithm.leetcode.swordoffer.offer24.Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-08 16:23
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 39. 数组中出现次数超过一半的数字
 */
public class HalfNumber {

    /**
     * 测试点：采用桶排序的方法，但是没考虑负数的形式
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        if (nums.length < 3) {
            return nums[0];
        }
        int half = (int) Math.ceil(nums.length / 2);
        // 假设有10个桶
        int[] bulk = new int[50000];
        for (int num : nums) {
            // todo:数组会越界
            bulk[num]++;
        }
        int max = -1;
        int maxIndex = 0;
        for (int i = 0; i < bulk.length; i++) {
            if (bulk[i] > max) {
                max = bulk[i];
                maxIndex = i;
            }
        }
        System.out.println("最多的数据:" + maxIndex);
        return maxIndex;
    }

    public int majorityElement1(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        if (nums.length < 3) {
            return nums[0];
        }
        int half = (int) Math.ceil(nums.length / 2);
        // 假设有10个桶
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // todo:数组会越界
            Integer integer = map.get(num);
            if (integer == null) {
                map.put(num, 1);
            } else {
                map.put(num, 1 + integer);
            }
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            Integer key = item.getKey();
            Integer value = item.getValue();
            if (value > half) {
                return key;
            }
        }
        return -1;
    }


    /**
     * 排序方法
     *
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    private int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    /**
     * 随机方法
     *
     * @param nums
     * @return
     */
    public int majorityElement3(int[] nums) {
        Random rand = new Random();

        int majorityCount = nums.length / 2;

        while (true) {
            int candidate = nums[randRange(rand, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }


    /**
     * 测试点：测试摩尔投票
     * 
     * @param nums
     * @return
     */
    public int majorityElement4(int[] nums) {
        int rationg = 0;
        int res = nums[0];
        for (int num : nums) {
            System.out.println("当前数据：" + num);
            if (rationg == 0) {
                System.out.println("res：" + res);
                res = num;
            }
            if (num == res) {
                rationg++;
            } else {
                rationg--;
            }
            System.out.println("rationg：" + rationg);
            System.out.println();
        }
        return res;
    }

}
