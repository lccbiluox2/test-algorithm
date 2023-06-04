package com.algorithm.anoperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitOneCountTest {

    private BitOneCount bitOneCount = new BitOneCount();

    /***
     * todo: 九师兄  2023/6/4 10:49
     * 测试点：测试 输入一个整数，输出该数二进制表示中 1 的个数。
     *
     * 10111
     * 4
     *
     * n&(n-1) 位运算可以将 n 的位级表示中最低的那一位 1 设置为 0。不断将 1 设置为 0，直到 n 为 0。
     * 时间复杂度：O(M)，其中 M 表示 1 的个数。
     */
    @Test
    public void bitOneCount() {
        bitOneCount.bitOneCount(23);
    }
}