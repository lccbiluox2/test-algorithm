package com.algorithm.array;

public class SortFindSingle {

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = 1;
        while (left < nums.length) {
            if (nums.length <= right) {
                return nums[right - 1];
            }
            // 数据相等 窗口 往右边扩大
            if (nums[left] == nums[right]) {
                right++;
                continue;
            }
            // 说明走到了交界处  1 1 2 3
            // left = 0 right = 2
            if (nums[left] < nums[right]) {
                int interval = right - left;
                if (interval > 1) {
                    // 证明数据是调到了另外的数据
                    left = right;
                    continue;
                }
                // 如果是 1 2 2 3 left = 0 right = 1
                return nums[left];
            }
        }
        return nums[0];
    }

    public int singleNonDuplicate1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        // 如果只有2个数据
        if (nums.length == 2) {
            if (nums[0] == nums[1]) {
                // 没有单个元素
                return nums[0];
            } else {
                // 两个都是单个元素
                return nums[0];
            }
        }

        int left = 0;
        int mid = 1;
        int right = 2;
        while (left < nums.length) {
            // 左边不等于 中间 有2种情况  1 2 2 和 1 1 2
            if (mid >= nums.length) {
                return nums[left];
            }

            // 1 2 2
            if (nums[left] != nums[mid] && nums[mid] == nums[right]) {
                return nums[left];
            }
            // 1 1 2 3
            if (nums[left] != nums[mid] && nums[mid] != nums[right]) {
                return nums[mid];
            }
            // 1  1 2 2 3
            if (nums[left] == nums[mid] && nums[mid] != nums[right]) {
                if (right == nums.length - 1) {
                    return nums[right];
                }
            }


            left++;
            mid++;
            right++;
        }
        return nums[mid];
    }

    public int singleNonDuplicate2(int[] arr) {
        int x = 0;
        for (int item : arr) {
            x ^= item;
        }
        return x;
    }

    /***
     * todo: 九师兄  2023/7/2 18:35
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode.cn/problems/single-element-in-a-sorted-array/solution/you-xu-shu-zu-zhong-de-dan-yi-yuan-su-by-y8gh/
     *
     */
    public int singleNonDuplicate3(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

    public int singleNonDuplicate4(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            mid -= mid & 1;
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }


    /***
     * todo: 九师兄  2023/7/2 19:40
     *
     * 【算法】540. 有序数组中的单一元素
     *  https://blog.csdn.net/qq_21383435/article/details/131502233
     *  这个算法迷糊了很久才听明白
     */
    public int singleNonDuplicate5(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            // mid 是奇数 要
            if (mid % 2 == 1) {
                mid--; // 为了方便代码 这里设置一定是偶数
            }
            // 如果偶数索引位置对应的数据 等于 奇数索引对应的位置，那么说明数据是成对的 应该看右边
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2; // 数据在右边
            } else {
                high = mid; // 说明数据在左边
            }
        }
        return nums[low];
    }

}
