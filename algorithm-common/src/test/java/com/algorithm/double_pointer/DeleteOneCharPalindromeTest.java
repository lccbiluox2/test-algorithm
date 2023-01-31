package com.algorithm.double_pointer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteOneCharPalindromeTest {

    @Test
    public void validPalindrome() {
        boolean abca = DeleteOneCharPalindrome.validPalindrome("abca");
        Assert.assertEquals(true,abca);
    }

    /***
     * todo: 17_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_17  2023/1/31 15:52 17 九师兄
     *   给你一个字符串 s，最多 可以从中删除一个字符。
     *   如果是多个字符的，这种方式就不准确了
     */
    @Test
    public void validPalindrome1() {
        boolean abca = DeleteOneCharPalindrome.validPalindrome("abcdba");
        Assert.assertEquals(false,abca);
    }
}