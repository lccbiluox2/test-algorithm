package com.algorithm.swordoffer.offer21;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 15:28
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 50000
 * 0 <= nums[i] <= 10000
 *
 * 【算法】剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * https://blog.csdn.net/qq_21383435/article/details/121592071
 */
public class ExchangeNum {

    public int[] exchange(int[] nums) {
        if (nums.length < 1) {
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left != right) {
            // 左边数据是奇数
            int leftValue = nums[left];
            int rightValue = nums[right];
            if (leftValue % 2 != 0) {
                // 左边奇数  右边奇数 左移动
                if (rightValue % 2 != 0) {
                    left++;
                } else if (rightValue % 2 == 0) {
                    //  左边奇数 右边偶数数 左移动
                    right--;
                }
            } else if (leftValue % 2 == 0) {
                // 如果左边是偶数 如果右边是奇数 那么需要交换
                if (rightValue % 2 != 0) {
                    int temp1 = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp1;
                } else if (rightValue % 2 == 0) {
                    // 左边偶数 右边偶数
                    right--;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }



    public int[] exchange1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            // 如果左边的是奇数 那么就递增
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            // 如果右边的是奇数 那么右边的递减
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }

            // 左边是偶数 右边是奇数 需要交换
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }

    /***
     * todo: 九师兄  2023/6/4 20:26
     * 方法一：创建一个新数组，时间复杂度 O(N)，空间复杂度 O(N)。
     */
    public int[] reOrderArray (int[] nums) {
        // 奇数个数
        int oddCnt = 0;
        for (int x : nums)
            if (!isEven(x))
                oddCnt++;
        int[] copy = nums.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1)
                nums[i++] = num;
            else
                nums[j++] = num;
        }
        return nums;
    }

    private boolean isEven(int x) {
        return x % 2 == 0;
    }

    /***
     * todo: 九师兄  2023/6/4 20:26
     *
     *  方法二：使用冒泡思想，每次都将当前偶数上浮到当前最右边。时间复杂度 O(N2)，
     *  空间复杂度 O(1)，时间换空间。
     *
     */
    public int[] reOrderArrayV1(int[] nums) {
        int N = nums.length;
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isEven(nums[j]) && !isEven(nums[j + 1])) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }


    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
