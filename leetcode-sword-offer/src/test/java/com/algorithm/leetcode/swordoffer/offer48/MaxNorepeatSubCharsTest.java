package com.algorithm.leetcode.swordoffer.offer48;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-19 21:12
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MaxNorepeatSubCharsTest {

    private MaxNorepeatSubChars client = new MaxNorepeatSubChars();

    @Test
    public void lengthOfLongestSubstring() {
        System.out.println(client.lengthOfLongestSubstring("abcabcbb"));// 3
        System.out.println(client.lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(client.lengthOfLongestSubstring("pwwkew"));//3
        System.out.println(client.lengthOfLongestSubstring(""));//0
        System.out.println(client.lengthOfLongestSubstring(" "));// 1
    }

    @Test
    public void lengthOfLongestSubstring1_1() {
        System.out.println(client.lengthOfLongestSubstring1("abcabcbb"));
        System.out.println(client.lengthOfLongestSubstring1("bbbbb"));
        System.out.println(client.lengthOfLongestSubstring1("pwwkew"));
        System.out.println(client.lengthOfLongestSubstring1(""));
        System.out.println(client.lengthOfLongestSubstring1(" "));
        System.out.println(client.lengthOfLongestSubstring1("aab"));
    }

    @Test
    public void maxUnique() {
        System.out.println(client.maxUnique("abcabcbb"));
    }

    @Test
    public void lengthOfLongestSubstring2_1() {
        System.out.println(client.lengthOfLongestSubstring2("abcabcbb"));
        System.out.println(client.lengthOfLongestSubstring2("bbbbb"));
        System.out.println(client.lengthOfLongestSubstring2("pwwkew"));
        System.out.println(client.lengthOfLongestSubstring2(""));
        System.out.println(client.lengthOfLongestSubstring2(" "));
        System.out.println(client.lengthOfLongestSubstring2("aab"));
    }

    @Test
    public void lengthOfLongestSubstring3_1() {
        System.out.println(client.lengthOfLongestSubstring3("abcabcbb"));
        System.out.println(client.lengthOfLongestSubstring3("bbbbb"));
        System.out.println(client.lengthOfLongestSubstring3("pwwkew"));
        System.out.println(client.lengthOfLongestSubstring3(""));
        System.out.println(client.lengthOfLongestSubstring3(" "));
        System.out.println(client.lengthOfLongestSubstring3("aab"));
    }
}