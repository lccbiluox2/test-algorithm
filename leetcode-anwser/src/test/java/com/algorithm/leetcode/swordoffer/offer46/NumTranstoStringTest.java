package com.algorithm.leetcode.swordoffer.offer46;

import com.algorithm.swordoffer.offer46.NumTranstoString;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-15 22:07
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class NumTranstoStringTest {

    private NumTranstoString numTranstoString = new NumTranstoString();

    @Test
    public void translateNum() {
        int i = numTranstoString.translateNum(12258);
        System.out.println(i);
    }


    @Test
    public void translateNum1_1() {
        int i = numTranstoString.translateNum1(12258);
        System.out.println(i);
    }
}