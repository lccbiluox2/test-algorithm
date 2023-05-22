package com.algorithm.swordoffer.offer57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * todo: 9/12/22 3:22 PM 九师兄
 * <p>
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * <p>
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 * 示例 2：
 * <p>
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class SumSequence {

    /**
     * todo: 9/12/22 6:03 PM 九师兄
     * <p>
     * 思路题解
     * 9
     * 中间数 4.5   首先是超过4.5 的两个数字相加都不会小于 9  所以后续的不用判断
     * 1 2 3 4     1 一直到 4 然后大于9了 所以不符合
     * 2 3 4     为了让我们的数据能减少计算，所以我们要把最前面的删除 并且sum - 第一个数据 然后再次计算发现正好 那么保存起来
     * 3 4 5   然后是 这个也不行
     * 4 5   这个可以要保存起来
     * 5 6
     **/
    public int[][] findContinuousSequence(int target) {
        int sum = 0;
        // todo: 九师兄 存放结果的数据
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int center = (target / 2) + 1; // todo: 九师兄 中间数据
        for (int i = 1; i < target; i++) {
            // todo: 九师兄 如果数据大于中间数据了 那么就直接结束 因为不会有结果了
            if (i > center) {
                break;
            }
            // todo: 九师兄 如果和大于我们的数据 我们要一直减少到小于
            while (target < sum) {
                sum = sum - list.get(0);
                list.remove(0);
            }

            sum = sum + i;

            // todo: 九师兄 如果和加了最新的数据还是 大于我们的数据 我们要一直减少到小于
            while (target < sum) {
                sum = sum - list.get(0);
                list.remove(0);
            }
            // todo: 九师兄 如果数据小于 那么我们累加
            if (sum <= target) {
                list.add(i);
            }
            // todo: 九师兄 如果数据等于 那么可以开始新一轮了
            if (sum == target) {
                result.add(list);
                list = new ArrayList<>(list);
            }
        }
        int[][] arr = new int[result.size()][];
        int i = 0;
        for (List<Integer> item : result) {
            int[] sun = new int[item.size()];
            for (int j = 0; j < item.size(); j++) {
                Integer integer = item.get(j);
                sun[j] = integer;
            }
            arr[i] = sun;
            i++;
        }
        System.out.println(arr);
        return arr;
    }


    /**
     * todo: 9/12/22 6:37 PM 九师兄
     * <p>
     * <p>
     * 作者：sdwwld
     * 链接：https://leetcode.cn/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/solution/shu-ju-jie-gou-he-suan-fa-hua-dong-chuan-74eb/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     **/
    public int[][] findContinuousSequenceV2(int target) {
        int left = 1; // 滑动窗口的左边界
        int right = 2; // 滑动窗口的右边界
        int sum = left + right; // 滑动窗口中数字的和
        List<int[]> res = new ArrayList<>();
        //窗口的左边是窗口内的最小数字，只能小于等于target / 2,
        //因为题中要求的是至少含有两个数
        while (left <= target / 2) {
            if (sum < target) {
                //如果窗口内的值比较小，右边界继续向右移动，
                //来扩大窗口
                sum += ++right;
            } else if (sum > target) {
                //如果窗口内的值比较大，左边边界往右移动，
                //缩小窗口
                sum -= left++;
            } else {
                //如果窗口内的值正好等于target，就把窗口内的值记录
                //下来，然后窗口的左边和右边同时往右移一步
                int[] arr = new int[right - left + 1];
                for (int k = left; k <= right; k++) {
                    arr[k - left] = k;
                }
                res.add(arr);
                //左边和右边同时往右移一位
                sum -= left++;
                sum += ++right;
            }
        }
        //把结果转化为数组
        return res.toArray(new int[res.size()][]);
    }


    public int[][] findContinuousSequencev3(int target) {
        List<int[]> res = new ArrayList<>();
        int n = 2;
        //死循环
        while (true) {
            int total = target - n * (n - 1) / 2;
            //当分子小于等于0的时候，退出循环
            if (total <= 0)
                break;
            //如果首项是正整数，满足条件
            if (total % n == 0) {
                int[] arr = new int[n];
                //找出首项的值
                int startValue = total / n;
                for (int k = 0; k < n; k++) {
                    arr[k] = startValue + k;
                }
                res.add(arr);
            }
            //继续找
            n++;
        }
        //反转，比如当target等于9的时候，结果是
        //[[4,5],[2,3,4]]，但题中要求的是不同
        // 序列按照首个数字从小到大排列，所以这里反转一下
        Collections.reverse(res);
        //把list转化为数组
        return res.toArray(new int[res.size()][]);
    }


}
