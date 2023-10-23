package com.algorithm.title150;

import com.algorithm.utils.ArraysUtils;

import java.util.Arrays;

/***
 * todo: 九师兄  2023/10/15 20:38
 *
 * 88. 合并两个有序数组
 * 提示
 * 简单
 * 2.2K
 * 相关企业
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，
 * 分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，
 * nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，
 * 应忽略。nums2 的长度为 n 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * 示例 2：
 *
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 * 解释：需要合并 [1] 和 [] 。
 * 合并结果是 [1] 。
 * 示例 3：
 *
 * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
 * 输出：[1]
 * 解释：需要合并的数组是 [] 和 [1] 。
 * 合并结果是 [1] 。
 * 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保
 * 合并结果可以顺利存放到 nums1 中。
 */
public class Code88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        if (nums1.length != length) {
            return;
        }
        if(m == 0){
            System.arraycopy(nums2,0,nums1,0,n);
            return;
        }
        int left = m -1;
        int writeIndex = length - 1;
        for (int i = n - 1; 0 <= i; ) {
            // 1    3   5   0   0   0
            //          left
            //              3   5   7
            //                      i
            if (nums2[i] > nums1[left]) { // 直接赋值到
                nums1[writeIndex] = nums2[i];
                writeIndex--;
                i--;
            } else if (nums2[i] == nums1[left]) { // 直接赋值到
                nums1[writeIndex] = nums2[i];
                writeIndex--;
                i--;
            } else if (nums2[i] < nums1[left]) { // 直接赋值到
                // 1    3   5   0   0   0
                //         left
                //              3   4   4
                //                      i
                nums1[writeIndex] = nums1[left];
                writeIndex--;
                left--;
            }
        }
    }

    /***
     * todo: 九师兄  2023/10/15 21:41
     *
     * 作者：力扣官方题解
     *     链接：https://leetcode.cn/problems/merge-sorted-array/solutions/666608/he-bing-liang-ge-you-xu-shu-zu-by-leetco-rrb0/
     *     来源：力扣（LeetCode）
     *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /***
     * todo: 九师兄  2023/10/22 16:46
     *
     * 链接：https://leetcode.cn/problems/merge-sorted-array/solutions/666608/he-bing-liang-ge-you-xu-shu-zu-by-leetco-rrb0/
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }




}
