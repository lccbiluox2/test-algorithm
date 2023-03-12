package com.algorithm.array;


public class TwoArrayMedian {

    /***
     * todo: 九师兄  2023/3/12 14:12
     *     【算法】求两个有序数组合并后的中位数
     *     https://blog.csdn.net/qq_21383435/article/details/129474114
     */
    public double fidMedianSortedArrays(int[] aArr, int[] bArr) {
        int m = aArr.length;
        int n = bArr.length;
        if (m > n) {
            // 这里保证a数组的长度 小于 b数组的长度
            return fidMedianSortedArrays(bArr, aArr);
        }
        int iMin = 0, iMax = m;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;// 二分法，取i为区间的中间值
            int j = (m + n + 1) / 2 - i;// 由i确定j的位置
            // 交叉比较，判断i是大了 还是小了
            // j != 0 && i != m 这俩是保证不越界
            if (j != 0 && i != m && bArr[j - 1] > aArr[i]) {
                iMin = i + 1;// i 需要增大
            } else if (i != 0 && j != n && aArr[i - 1] > bArr[j]) {
                //  i != 0 && j != n 这俩是保证不越界
                iMax = i - 1;// i需要减少
            } else {
                // 达到要求 并且将边界值单独列出来单独思考
                int maxLeft = 0;
                if (i == 0) {
                    // 符合情况A
                    maxLeft = bArr[j - 1];
                } else if (j == 0) {
                    // 符合情况B
                    maxLeft = aArr[i - 1];
                } else {
                    // 符合情况C 和情况D
                    maxLeft = Math.max(aArr[i - 1], bArr[j - 1]);
                }
                // 如果数字是奇数，直接返回左边的最大值
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }


                // 如果（m+n) 是偶数 再求右边的最小值
                int minRight = 0;
                if (i == m) {
                    minRight = bArr[j];
                } else if (j == n) {
                    minRight = aArr[i];
                } else {
                    minRight = Math.min(bArr[j], aArr[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0;
    }
}
