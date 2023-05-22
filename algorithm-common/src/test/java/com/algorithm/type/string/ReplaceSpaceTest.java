package com.algorithm.type.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceSpaceTest {

    private ReplaceSpace replaceSpace = new ReplaceSpace();

    /***
     * todo: 九师兄  2023/5/20 15:38
     *
     * 题目描述
     * 将一个字符串中的空格替换成 "%20"。
     *
     * Input:
     * "A B"
     *
     * Output:
     * "A%20B"
     *
     */
    @Test
    public void replaceSpace() {
        String aB = replaceSpace.replaceSpace("A B");
        System.out.println(aB);
    }

    @Test
    public void replaceSpace1() {
        String aB = replaceSpace.replaceSpace("A  B C ");
        System.out.println(aB);
    }

    @Test
    public void replaceSpace2() {
        StringBuffer builder = new StringBuffer("A  B C ");
        String aB = replaceSpace.replaceSpace(builder);
        System.out.println(aB);
    }


}