package com.algorithm.leetcode.swordoffer.offer59;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

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
public class ArraySlidingMax {

    private Deque<Integer> help = new ArrayDeque<>();
    private Deque<Integer> queue = new ArrayDeque<>();


    /**
     * 测试点：暴力求解法  这个居然测试通过了
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums.length < 1) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        // 从0开始循环到 倒数第3个数据，为啥到此为止，因为后面的几个数不满足滑动窗口了
        for (int i = 0; i < (nums.length - k + 1); i++) {
            int tempMax = -1;
            // 往后走3个数，如果不够3个，那么就走能走的几个数
            int endIndex = Math.min(i + k, nums.length);
            for (int j = i; j < endIndex; j++) {
                if (nums[j] > tempMax) {
                    tempMax = nums[j];
                }
            }
            list.add(tempMax);
        }

        int[] result = list.stream().mapToInt(Integer::valueOf).toArray();
        return result;
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums.length < k) {
            return new int[0];
        }

        List<Integer> list = new ArrayList<>();
        // 从0开始循环到 倒数第3个数据，为啥到此为止，因为后面的几个数不满足滑动窗口了
        Integer preMax = null;
        for (int i = 0; i < nums.length; i++) {
            if (list.isEmpty()) {
                int tempMax = -1;
                // 往后走3个数，如果不够3个，那么就走能走的几个数
                int endIndex = Math.min(i + k, nums.length);
                for (int j = i; j < endIndex; j++) {
                    if (nums[j] > tempMax) {
                        tempMax = nums[j];
                    }
                }
                list.add(tempMax);
                preMax = tempMax;
                i = k - 1;
            } else {
                if (preMax < nums[i]) {
                    list.add(nums[i]);
                    preMax = nums[i];
                } else {
                    list.add(preMax);
                }
            }

        }

        int[] result = list.stream().mapToInt(Integer::valueOf).toArray();
        return result;
    }


    public int[] maxSlidingWindow3(int[] nums, int k) {
        // 窗口个数
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        // 遍历数组中元素，right表示滑动窗口右边界
        for (int right = 0; right < nums.length; right++) {
            // 如果队列不为空且当前考察元素大于等于队尾元素，则将队尾元素移除。
            // 直到，队列为空或当前考察元素小于新的队尾元素
            while (!queue.isEmpty() && nums[right] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }

            // 存储元素下标
            queue.addLast(right);

            // 计算窗口左侧边界
            int left = right - k + 1;
            // 当队首元素的下标小于滑动窗口左侧边界left时
            // 表示队首元素已经不再滑动窗口内，因此将其从队首移除
            if (queue.peekFirst() < left) {
                queue.removeFirst();
            }

            // 由于数组下标从0开始，因此当窗口右边界right+1大于等于窗口大小k时
            // 意味着窗口形成。此时，队首元素就是该窗口内的最大值
            if (right + 1 >= k) {
                res[left] = nums[queue.peekFirst()];
            }
        }
        return res;
    }

    public int[] maxSlidingWindow4(int[] nums, int k) {
        if(k == 0 || nums.length == 0){
            return new int[]{};
        }
        // 窗口个数
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();
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
                res[resIndex++] = nums[queue.peek()];
            }


        }
        return res;
    }

}
