package com.algorithm.common.kmp;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-13 18:58
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StringMatchTest {

    @Test
    public void vịolenceMatch() {
        String st1 = "硅硅谷尚硅谷你尚硅 尚硅谷你尚硅谷你尚硅你好";
        String st2 = "尚硅谷你尚硅你";
        int i = StringMatch.vịolenceMatch(st1, st2);
        System.out.println(i);
    }


    /**
     * 测试生成kmp的部分匹配表
     *
     * 结果如下：[0, 0, 0, 0, 1, 2, 0]
     */
    @Test
    public void kmpNextTest() {
        String st2 = "ABCDABD";
        int[] i = StringMatch.kmpNext(st2);
        System.out.println(Arrays.toString(i));
    }

    @Test
    public void kmpMatchTest() {
        String st1 = "AAB DBSDLFFFSABCDABD";
        String st2 = "ABCDABD";
        int i = StringMatch.kmpMatch(st1,st2);
        System.out.println(i);
    }
}