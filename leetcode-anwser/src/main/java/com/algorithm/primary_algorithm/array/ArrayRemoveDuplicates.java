package com.algorithm.leetcode.primary_algorithm.array;

public class ArrayRemoveDuplicates {

    /**
     *todo: 2023/4/20 22:28 九师兄
     * 删除排序数组中的重复项
     * https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2gy9m/
     *
     * 删除排序数组中的重复项
     * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
     *
     * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
     *
     * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
     * 返回 k。
     *
     *
     **/
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int i = 0,j = 1;
        int count = 1;
        while (j < nums.length){
            // 证明两个数字相等 那么 nums[i] 保留 j++
            if(nums[i] == nums[j]){
                j++;
            }else if(nums[i] != nums[j]){
                // 两个数据不相同 那么将num[j]位置赋值给 num[i+1]位置
                nums[i+1] = nums[j];
                i++;
                j++;
                count++;
            }
        }

        return count;
    }

}
