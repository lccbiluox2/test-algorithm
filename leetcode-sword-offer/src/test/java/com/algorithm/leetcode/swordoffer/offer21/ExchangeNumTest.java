package com.algorithm.leetcode.swordoffer.offer21;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 15:29
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ExchangeNumTest {

    private ExchangeNum exchangeNum = new ExchangeNum();

    @Test
    public void exchange() {
        int[] data = new int[]{1,3,4,5,8,7};
        exchangeNum.exchange(data);
    }
}