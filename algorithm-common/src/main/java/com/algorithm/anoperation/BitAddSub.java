package com.algorithm.anoperation;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-02 13:44
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BitAddSub {

    /**
     * 假设 a = 3 b = 2
     * a= 0011
     * b= 0010
     * a & b = 0010
     * 然后左移动一位 0100
     * a^b = 0001
     * c | d =
     * 0100
     * 0001  = 0101 巧合等于5
     *
     * @param a
     * @param b
     * @return
     */
    public static int add1(int a, int b) {
        int c = (a & b) << 1;//进位的值
        int d = a ^ b;//不考虑进位，相加的值
        return c | d;//或者 return c ^ d;
    }

    /**
     * 假设是2
     * 2 的二进制是  0010
     * (n >> 1) 右移一位 代表 0001 为 1
     * 然后异或自己 0010 ^ 0001  0011 代表 3
     * 然后(n + 1) 等于 0100
     * 然后 (n & (n + 1)) 0011 & 0100 0000
     *
     * 假设为7
     * 7 的二进制是  0111
     * (n >> 1) 右移一位 代表 0011 为 3
     * 然后异或自己
     *      0111 ^
     *      0011  0100 代表 4
     *
     * 然后(n + 1) 等于 0101
     * 然后 (n & (n + 1))
     *      0100 &
     *      0101 0100
     *
     * @param n
     * @return
     */
    public static boolean hasAlternatingBits(int n) {
        n ^= (n >> 1);
        return (n & (n + 1)) == 0;
    }
}
