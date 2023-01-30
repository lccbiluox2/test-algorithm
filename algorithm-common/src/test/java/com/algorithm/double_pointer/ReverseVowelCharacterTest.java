package com.algorithm.double_pointer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseVowelCharacterTest {

    /**
     * todo:  10_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_10  2023/1/30 14:53 九师兄
     *     测试点: 3. 反转字符串中的元音字符
     *     https://leetcode.cn/problems/reverse-vowels-of-a-string/description/
     *     文章：https://github.com/CyC2018/CS-Notes/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3%20-%20%E5%8F%8C%E6%8C%87%E9%92%88.md
     */
    @Test
    public void reverseVowels() {
        String s = "leetcode";
        String s1 = ReverseVowelCharacter.reverseVowels(s);
        Assert.assertEquals("leotcede",s1);
    }
}