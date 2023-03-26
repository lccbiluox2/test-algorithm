package com.algorithm.leetcode.swordoffer.offer50;

import com.algorithm.swordoffer.offer50.OneNoRepeatChar;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 20:21
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class OneNoRepeatCharTest {

    OneNoRepeatChar oneNoRepeatChar = new OneNoRepeatChar();

    /**
     * 测试点：找重复
     * a b  b  a  c d d f f e
     */
    @Test
    public void firstUniqChar() {
        String data = "abbacddffe";
        char c = oneNoRepeatChar.firstUniqChar(data);
        System.out.println(">" + c + "<");
    }

    @Test
    public void firstUniqChar1() {
        String data = "abbacd";
        char c = oneNoRepeatChar.firstUniqChar1(data);
        System.out.println(">" + c + "<");

        data = "aadadaad";
        c = oneNoRepeatChar.firstUniqChar1(data);
        System.out.println(">" + c + "<");

        data = "leetcode";
        c = oneNoRepeatChar.firstUniqChar1(data);
        System.out.println(">" + c + "<");

    }

    @Test
    public void firstUniqChar2() {
        String data = "abbacd";
        char c = oneNoRepeatChar.firstUniqChar2(data);
        System.out.println(">" + c + "<");

        data = "aadadaad";
        c = oneNoRepeatChar.firstUniqChar2(data);
        System.out.println(">" + c + "<");

        data = "leetcode";
        c = oneNoRepeatChar.firstUniqChar2(data);
        System.out.println(">" + c + "<");

    }

    @Test
    public void firstUniqChar3() {
        String data = "abbacd";
        char c = oneNoRepeatChar.firstUniqChar3(data);
        System.out.println(">" + c + "<");

        data = "aadadaad";
        c = oneNoRepeatChar.firstUniqChar3(data);
        System.out.println(">" + c + "<");

        data = "leetcode";
        c = oneNoRepeatChar.firstUniqChar3(data);
        System.out.println(">" + c + "<");

    }

    @Test
    public void firstUniqChar4() {
        String data = "abbacd";
        char c = oneNoRepeatChar.firstUniqChar4(data);
        System.out.println(">" + c + "<");

        data = "aadadaad";
        c = oneNoRepeatChar.firstUniqChar4(data);
        System.out.println(">" + c + "<");

        data = "leetcode";
        c = oneNoRepeatChar.firstUniqChar4(data);
        System.out.println(">" + c + "<");

    }

}