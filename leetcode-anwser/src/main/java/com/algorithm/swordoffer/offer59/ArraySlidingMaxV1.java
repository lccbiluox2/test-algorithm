package com.algorithm.swordoffer.offer59;

import java.util.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-04 22:47
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 【算法】剑指 Offer 59 - I. 滑动窗口的最大值
 *  https://blog.csdn.net/qq_21383435/article/details/121723224
 *
 */
public class ArraySlidingMaxV1 {

    public ArrayList<Integer>  maxSlidingWindow4(int[] nums, int k) {
        if(k == 0 || nums.length == 0){
            return new ArrayList<>();
        }
        // 窗口个数
        ArrayList<Integer> list = new ArrayList<>();

        Deque<Integer> queue = new LinkedList<>();
        int resIndex = 0;
        // 遍历数组中元素，right表示滑动窗口右边界
        for (int i = 0; i < nums.length; i++) {
            // 1. 头 清理超期元素（清理i-k位置的元素）
            while (!queue.isEmpty() && queue.peek() == i - k) {
                queue.remove();
            }

            // 2 尾：维护单调递减队列（清除队列内 < 新入队列的元素
            // 删除所有比心如队元素小的旧的元素
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }

            // 存储元素下标
            queue.addLast(i);

            // 头：获取滑动窗口的最大值（返回头部元素 i>=k -1时)
            // 由于数组下标从0开始，因此当窗口右边界right+1大于等于窗口大小k时
            // 意味着窗口形成。此时，队首元素就是该窗口内的最大值
            if (i >= k - 1) {
                list.add(nums[queue.peek()]);
            }


        }

        return list;
    }

}
