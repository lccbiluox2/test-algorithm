package com.algorithm.title150;

public class Code26_1 {

    /***
     * todo: 九师兄  2023/10/22 21:07
     *
     * 0,0,1,1,1,2,2,3,3,4
     * i   j
     */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
