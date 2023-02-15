package com.algorithm.array;

public class ArraySumMaxSon {

    /**
     *todo: 2023/2/15 22:10 九师兄
     * 【算法】正数数组、子数组元素和为K，最长子数组长度
     *  https://blog.csdn.net/qq_21383435/article/details/129051400
     **/
    public static int getMaxLength(int[] arr, int k) {
        if (arr == null || arr.length != 0 || k < 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        // [left…..right]
        // 如果left == right + 1 表示窗口不再有数
        int sum = arr[0];
        int len = 0;
        while (right < arr.length) {
            if (sum == k) {
                len = Math.max(len, right - left + 1);
                sum -= arr[left++];
            } else if (sum < k) {
                right++;
                if (right == arr.length) {
                    break;
                }
                sum += arr[right];
            } else {
                sum -= arr[left++];
            }
        }
        return len;
    }
}
