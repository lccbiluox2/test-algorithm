package com.algorithm.leetcode.swordoffer.offer67;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-19 16:51
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StringToNumTest {


    private StringToNum stringToNum = new StringToNum();

    @Test
    public void strToInt() {
//        Integer.parseInt(" -41");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    public void strToInt1_1() {
//        int i = stringToNum.strToInt(" -4139 with word");
//        int i = stringToNum.strToInt("42");
//        int i = stringToNum.strToInt("   -42");
//        int i = stringToNum.strToInt("words and 987");
//        int i = stringToNum.strToInt("-91283472332");
//        int i = stringToNum.strToInt("3.14159");
//        int i = stringToNum.strToInt("-w2.14159");
//        int i = stringToNum.strToInt("");
//        int i = stringToNum.strToInt("+1");
//        int i = stringToNum.strToInt(" ");
        int i = stringToNum.strToInt("20000000000000000000");
        System.out.println(stringToNum.strToInt("42"));
        System.out.println(stringToNum.strToInt("  0000000000012345678"));
    }


    @Test
    public void strToInt1_2() {
        System.out.println(stringToNum.strToInt("2147483648"));
    }


}