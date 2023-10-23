package com.algorithm.title150;

public class Code27 {

    /***
     * todo: 九师兄  2023/10/22 17:36
     *
     * [0,1,2,2,3,0,4,2], val = 2
     *      i
     * [0,1,2,2,3,0,4,2], val = 2
     *      i j j
     * 交换i j 的位置，i往前移动一位
     * [0,1,3,2,2,0,4,2], val = 2
     *        i   j
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int i = 0;
        while (i < nums.length) {
            // 如果相等 那么说明这个数据要进行交换
            if (nums[i] == val) {
                int j = i + 1;
                while (j < nums.length) {
                    if (nums[j] != val) {
                        break;
                    }
                    j++;
                }
                if(j >= nums.length) break;
                // 交换i j 的位置，i往前移动一位
                swap(nums, i, j);
                i++;
            } else {
                i++;
            }
        }
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /***
     * todo: 九师兄  2023/10/22 19:11
     *
     * 作者：力扣官方题解
     * 链接：https://leetcode.cn/problems/remove-element/solutions/730203/yi-chu-yuan-su-by-leetcode-solution-svxi/
     * 来源：力扣（LeetCode）
     */
    public int removeElement1(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
