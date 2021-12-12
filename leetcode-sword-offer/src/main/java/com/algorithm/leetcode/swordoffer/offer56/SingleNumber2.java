package com.algorithm.leetcode.swordoffer.offer56;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-11 13:42
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 56 - II. 数组中数字出现的次数 II
 */
public class SingleNumber2 {


    /**
     * 0011
     * 0100
     * 0011
     * 0011
     * <p>
     * 0101 9
     * 0001 1
     * 0011 7
     * 0101 9
     * 0011 7
     * 0101 9
     * 0011 7
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int bitMask = 1 << 31;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bitSum = 0;
            for (int num : nums) {
                int i1 = bitMask & num;
                if (i1 == 1) {
                    bitSum++;
                }
            }
            res = (res << 1) + bitSum % 3;
            bitMask >>= 1;
        }
        return res;
    }

    public int singleNumber1(int[] nums) {
        //最终的结果值
        int res = 0;
        //int类型有32位，统计每一位1的个数
        for (int i = 0; i < 32; i++) {
            //统计第i位中1的个数
            int oneCount = 0;
            for (int j = 0; j < nums.length; j++) {
                oneCount += (nums[j] >>> i) & 1;
            }
            //如果1的个数不是3的倍数，说明那个只出现一次的数字
            //的二进制位中在这一位是1
            if (oneCount % 3 == 1)
                res |= 1 << i;
        }
        return res;
    }


}
