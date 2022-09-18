package com.algorithm.leetcode.swordoffer.offer62;

import java.util.ArrayList;
import java.util.List;

/**
 * todo: 9/12/22 9:44 PM 九师兄
 * <p>
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 * <p>
 * 0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
 * <p>
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: n = 5, m = 3
 * 输出: 3
 * 示例 2：
 * <p>
 * 输入: n = 10, m = 17
 * 输出: 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class CircleRemoveLast {

    /**
     * todo: 9/12/22 9:49 PM 九师兄
     * <p>
     * 10 3
     * 1 2 3 4 5 6 7 8 9 10
     *.    3     6     9
     *.  2         7
     *.1             8
     *.        5
     *.                   10
     *.      4
     **/
    public int lastRemaining(int n, int m) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }

        List<Boolean> accessFlag = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            accessFlag.add(false);
        }
        int count = n;
        int index = 0;
        List<Integer> result = new ArrayList<>();
        while (count > 1) {
            index = index + m;
            if (index > n) {
                index = index - n;
            }
            if (accessFlag.get(index) == false) {
                accessFlag.set(index, true);
                count--;
                result.add(index);
                continue;
            }
            while (accessFlag.get(index)) {
                index = index + 1;
                if (index > n) {
                    index = index - n;
                }
            }
        }
        return -1;
    }
}