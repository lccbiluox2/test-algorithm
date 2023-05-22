package com.algorithm.leetcode.swordoffer.offer58;

import com.algorithm.swordoffer.offer58.RevorseChar;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 17:36
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class RevorseCharTest {

    RevorseChar revorseChar = new RevorseChar();

    /**
     * 测试组装的：118194 纳秒
     */
    @Test
    public void reverseLeftWords() {
        long start = System.nanoTime();

        String data = "abcedcvrsdgdhgyrhrthjufr";
        String s = revorseChar.reverseLeftWords(data, 10);
        System.out.println(s);
        long end = System.nanoTime();
        System.out.println(end - start);

    }

    @Test
    public void reverseLeftWords1() {
        long start = System.nanoTime();

        String data = "abcdf";
        String s = revorseChar.reverseLeftWords1(data, 2);
        System.out.println(s);
        long end = System.nanoTime();
        System.out.println(end - start);

    }

    /**
     * 测试点：测试自己写的
     * gdhgyrhrthjufredcvrsdgdh
     * 274570
     * 为毛耗时更多了？
     */
    @Test
    public void reverseLeftWords1_1() {
        long start = System.nanoTime();

        String data = "gdhgyrhrthjufredcvrsdgdh";
        String s = revorseChar.reverseLeftWords1(data, 10);
        System.out.println(s);
        long end = System.nanoTime();
        System.out.println(end - start);

    }


    /**
     * 测试点：别人的
     * gdhgyrhrthjufredcvrsdgdh
     * 105689
     *  好像更快了
     */
    @Test
    public void reverseLeftWords2() {
        long start = System.nanoTime();

        String data = "gdhgyrhrthjufredcvrsdgdh";
        String s = revorseChar.reverseLeftWords2(data, 10);
        System.out.println(s);
        long end = System.nanoTime();
        System.out.println(end - start);

    }

    /**
     * 测试点：双指针
     * gdhgyrhrthjufredcvrsdgdh
     * 105689
     * 135503 相比之下慢了点
     */
    @Test
    public void reverseLeftWords3() {
        long start = System.nanoTime();

        String data = "abcdf";
        String s = revorseChar.reverseLeftWords3(data, 2);
        System.out.println(s);
        long end = System.nanoTime();
        System.out.println(end - start);

    }

}