package com.algorithm.anoperation;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-01 19:04
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: todo: 数字相关的位运算
 */
public class DigitalAbove {

    public static int missingNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++)
            xor ^= nums[i] ^ (i + 1);
        return xor;
    }

    public static int missingNumber1(int[] nums) {
        int length = nums.length;
        int sum = (0 + length) * (length + 1) / 2;
        for (int i = 0; i < length; i++)
            sum -= nums[i];
        return sum;
    }

    public static int missingNumber2(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != i)
                return i;
        }
        return length;
    }

    public static int missingNumber3(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == mid) {
                //如果nums[mid] == mid也就是说当前元素的
                //下标等于他自己，比如数组[0,1,2,3,4,5]每
                //个元素的下标都等于他自己，说明[start,mid]
                //没有缺少任何数字，那么缺少的肯定是在[mid+1,end]
                start = mid + 1;
            } else {
                //如果当前元素的下标不等于他自己，比如[0,1,2,4]中
                //nums[3]==4，说明说明缺少的数字就在这个区间内
                end = mid;
            }
        }
        //如果类似于[0,1,2,3]这种start指向了数组的最后一个，我们让他加1
        return start == nums[start] ? start + 1 : start;
    }


    /**
     * 测试点：测试汉明距离
     *
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingDistance1(int x, int y) {
        int xor = x ^ y;
        int res = 0;
        while (xor != 0) {
            res += xor & 1;
            xor = xor >>> 1;
        }
        return res;
    }

    public int hammingDistance2(int x, int y) {
        int xor = x ^ y;
        int res = 0;
        while (xor != 0) {
            res += 1;
            xor &= xor - 1;
        }
        return res;
    }

    public static int[] singleNumber(int[] nums) {
        int bitmask = 0;
        //把数组中的所有元素全部都异或一遍
        for (int num : nums) {
            bitmask ^= num;
        }
        //因为异或运算的结果不一定都是2的n次幂，
        //在二进制中可能会有多个1，为了方便计算
        // 我们只需保留其中的任何一个1，其他的都
        //让他变为0，这里保留的是最右边的1
        bitmask &= -bitmask;
        int[] rets = {0, 0};
        for (int num : nums) {
            //然后再把数组分为两部分，每部分在
            //分别异或
            if ((num & bitmask) == 0) {
                rets[0] ^= num;
            } else {
                rets[1] ^= num;
            }
        }
        return rets;
    }


    public static char findTheDifference(String s, String t) {
        char[] charArr = s.concat(t).toCharArray();
        char res = 0;
        for (char c : charArr) {
            res ^= c;
        }
        return res;
    }
}
