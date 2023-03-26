package com.algorithm.swordoffer.offer40;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 13:46
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 40. 最小的k个数
 */
public class MinKNums1 {

    /**
     * 第一种排序解决
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        // 如果数据长度大于要获取的长度 取k
        int size = 0;
        if (arr.length > k) {
            size = k;
        } else {
            // 否则就是要取的数据比值还长，那么取数组的长度
            size = arr.length;
        }

        int[] result = new int[size];
        for (int i = 0; i < k; i++) {
            if (i >= arr.length) {
                break;
            }
            int currentMin = Integer.MAX_VALUE;
            int lastIndex = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < currentMin) {
                    currentMin = arr[j];
                    lastIndex = j;
                }
            }

            if (lastIndex > -1) {
                result[i] = currentMin;
                arr[lastIndex] = Integer.MAX_VALUE;
            }
        }
        return result;
    }


    public int[] getLeastNumbers3(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 最后一个参数表示我们要找的是下标为k-1的数
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int lo, int hi, int k) {
        // 每快排切分1次，找到排序后下标为j的元素，如果j恰好等于k就返回j以及j左边所有的数；
        int j = partition(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        // 否则根据下标j与k的大小关系来决定继续切分左段还是右段。
        return j > k ? quickSearch(nums, lo, j - 1, k) : quickSearch(nums, j + 1, hi, k);
    }

    // 快排切分，返回下标j，使得比nums[j]小的数都在j的左边，比nums[j]大的数都在j的右边。
    private int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && nums[i] < v) ;
            while (--j >= lo && nums[j] > v) ;
            if (i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }

    // 保持堆的大小为K，然后遍历数组中的数字，遍历的时候做如下判断：
// 1. 若目前堆的大小小于K，将当前数字放入堆中。
// 2. 否则判断当前数字与大根堆堆顶元素的大小关系，如果当前数字比大根堆堆顶还大，这个数就直接跳过；
//    反之如果当前数字比大根堆堆顶小，先poll掉堆顶，再将该数字放入堆中。
    public int[] getLeastNumbers4(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 默认是小根堆，实现大根堆需要重写一下比较器。
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : arr) {
            // 维持堆的最大个数为
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num < pq.peek()) {
                // 如果数字小于堆顶元素，证明这个是更小的数据，需要加入堆，先移除顶部的大数
                pq.poll();
                // 然后将小数放进去
                pq.offer(num);
            }
        }

        // 返回堆中的元素
        int[] res = new int[pq.size()];
        int idx = 0;
        for (int num : pq) {
            res[idx++] = num;
        }
        return res;
    }


    /**
     * 测试点：这个也是一种快排优化
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers5(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
            int index = partition1(arr, lo, hi);
            if (index == k - 1) break;
            else if (index < k - 1) {
                lo = index + 1;
            } else {
                hi = index - 1;
            }
        }
        return Arrays.copyOfRange(arr,0,k);
    }

    private int partition1(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int index = lo;
        for (int i = lo; i <= hi; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, ++index);
            }
        }
        swap(arr, lo, index);
        return index;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
