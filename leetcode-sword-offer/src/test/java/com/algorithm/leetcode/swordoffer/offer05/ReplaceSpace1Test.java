package com.algorithm.leetcode.swordoffer.offer05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 15:57
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ReplaceSpace1Test {

    ReplaceSpace1 space = new ReplaceSpace1();

    /**
     * 测试结果 154 毫秒
     * 测试点：测试系统的 s.replaceAll 性能 115
     */
    @Test
    public void replaceSpace() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.append(i).append(" ");
        }
        long start = System.currentTimeMillis();
        String aa = space.replaceSpace(builder.toString());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 测试点：测试系统的 s.replace 性能 115
     */
    @Test
    public void replaceSpace1() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.append(i).append(" ");
        }
        long start = System.currentTimeMillis();
        String aa = space.replaceSpace1(builder.toString());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 测试点：28 卧槽 自己想的居然这么高
     * 30
     */
    @Test
    public void replaceSpace2() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.append(i).append(" ");
        }
        long start = System.currentTimeMillis();
        String aa = space.replaceSpace2(builder.toString());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 测试点：测试双指针方法 17毫秒 更牛逼了
     */
    @Test
    public void replaceSpace3() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.append(i).append(" ");
        }
        long start = System.currentTimeMillis();
        String aa = space.replaceSpace3(builder.toString());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}