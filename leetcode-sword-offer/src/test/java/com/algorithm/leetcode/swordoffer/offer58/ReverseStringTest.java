package com.algorithm.leetcode.swordoffer.offer58;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-29 21:38
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ReverseStringTest {

    private ReverseString reverseString = new ReverseString();

    @Test
    public void reverseWords() {
        String result = reverseString.reverseWords1("the sky is blue");
        System.out.println(result);

        result = reverseString.reverseWords1("  hello world!  ");
        System.out.println(result);

        result = reverseString.reverseWords1("a good   example");
        System.out.println(result);


    }

    @Test
    public void reverseWords2() {
        String result = reverseString.reverseWords2("the sky is blue");
        System.out.println(result);

        result = reverseString.reverseWords2("  hello world!  ");
        System.out.println(result);

        result = reverseString.reverseWords2("a good   example");
        System.out.println(result);


    }
}