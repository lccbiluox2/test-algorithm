package com.algorithm.title150;

public class Code26 {

    /***
     * todo: 九师兄  2023/10/22 20:00
     *
     * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
     *
     * [0,0,1,1,1,2,2,3,3,4]
     *  i   j
     * [0,1,1,1,1,2,2,3,3,4]
     *    i j
     */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0;
        for (int right = 1; right < n; right++) {
            if(nums[left] == nums[right]){
                continue;
            }
            // 两个元素不相等，那么就
            if (nums[left] != nums[right] ) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left+1;
    }
}
