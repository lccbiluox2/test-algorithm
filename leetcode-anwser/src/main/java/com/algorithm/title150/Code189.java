package com.algorithm.title150;

import com.algorithm.utils.ArraysUtils;

import java.util.Arrays;

/**
 * todo: 2023/10/24 23:18 九师兄
 *
 * 【算法】轮转数组
 * https://blog.csdn.net/qq_21383435/article/details/134022963
 **/
public class Code189 {

    /**
     * todo: 2023/10/23 22:42 九师兄
     * k = 3
     * 1,2,3,4,5,6,7 1,2,3,4,5,6,7
     * 写的啥玩意，一坨屎
     **/
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 1) {
            return;
        }
        if (k < 1) {
            return;
        }
        int[] numsNew = new int[nums.length * 2];
        System.arraycopy(nums, 0, numsNew, nums.length, nums.length);
        System.arraycopy(nums, 0, numsNew, 0, nums.length);
        int realK = k % nums.length;
        if (realK % 2 == 0) {
            realK = realK - 1;
        }
        System.arraycopy(numsNew, realK, nums, 0, nums.length);
        ArraysUtils.printIntArray(nums);
    }


    public void rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    // 超时
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            xunhuan(nums, temp);
            nums[0] = temp;
        }
    }

    private void xunhuan(int[] nums, int temp) {
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
    }

    // 通过 几秒前 Java 1 ms 54.2 MB
    public void rotate3(int[] nums, int k) {
        k %= nums.length;
        int[] temp = new int[k];
        int index = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            temp[index] = nums[i];
            index++;
        }

        for (int i = nums.length - k - 1 ; i > -1; i--) {
            nums[i + k ] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    /**
     * todo: 2023/10/24 23:13 九师兄
     * 作者：力扣官方题解
     * 链接：https://leetcode.cn/problems/rotate-array/solutions/551039/xuan-zhuan-shu-zu-by-leetcode-solution-nipk/
     **/
    public void rotate4(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            int index = (i + k) % n ;
            newArr[index] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }


}
