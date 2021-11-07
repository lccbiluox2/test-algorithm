package com.algorithm.anoperation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-01 19:05
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class DigitalAboveTest {

    /**
     * 测试点：
     * 一个长度为n-1的递增排序数组中的所有数字都是唯一的， 并 且 每 个 数 字 都 在 范 围 0 ～ n-
     * 1 之 内 。 在 范 围 0 ～ n-1 内 的 n 个 数 字 中 有 且 只 有 一 个 数 字 不 在 该 数 组 中 ， 请 找 出 这 个 数
     * 字。
     *
     * 测试结果：
     *  13 是错误的
     */
    @Test
    public void missingNumber() {
        int[] aa = new int[]{1, 2, 3, 4, 6, 7, 8};
        int i = DigitalAbove.missingNumber(aa);
        System.out.println(i);
    }

    /**
     * 测试点： 可以看到这里有一个致命的地方，必须是从0开始
     */
    @Test
    public void missingNumberTest() {
        int[] aa = new int[]{0,1, 2, 3, 4, 6, 7, 8};
        int i = DigitalAbove.missingNumber(aa);
        System.out.println(i);
    }

    @Test
    public void missingNumberTest1() {
        int[] aa = new int[]{0,1, 2, 3, 4, 6, 7, 8};
        int i = DigitalAbove.missingNumber1(aa);
        System.out.println(i);
    }

    @Test
    public void missingNumberTest2() {
        int[] aa = new int[]{1, 2, 3, 4, 6, 7, 8};
        int i = DigitalAbove.missingNumber1(aa);
        System.out.println(i);
    }

    @Test
    public void missingNumberTest3() {
        int[] aa = new int[]{1, 2, 3, 4, 6, 7, 8};
        int i = DigitalAbove.missingNumber2(aa);
        System.out.println(i);
    }

    @Test
    public void missingNumberTest31() {
        int[] aa = new int[]{0,1, 2, 3, 4, 6, 7, 8};
        int i = DigitalAbove.missingNumber3(aa);
        System.out.println(i);
    }


    @Test
    public void hammingDistanceTest() {
        int i = DigitalAbove.hammingDistance(1,4);
        System.out.println(i);
    }


    @Test
    public void reverseTest() {
        int i = Integer.reverse(4);
        System.out.println(i);

        int num = 0x55555555;
        System.out.println("num的二进制表示：");
//        System.out.println(Util.bitInt32(num));
        System.out.println("第一步计算之后num的二进制表示：");
        num = (num & 0x55555555) << 1 | (num >>> 1) & 0x55555555;
//        System.out.println(Util.bitInt32(num));
    }

    @Test
    public void singleNumberTest() {
        int[] aa = new int[]{1,1, 2, 2, 4, 6, 8, 8};
        int[] i = DigitalAbove.singleNumber(aa);
        System.out.println(Arrays.toString(i));
    }

    /**
     * 测试点：测试2个字符只有一个不相同
     * 测试结果正常
     */
    @Test
    public void findTheDifference() {
        String s = "abe";
        String t = "abce";
        char result = DigitalAbove.findTheDifference(s, t);
        System.out.println(String.valueOf(result));
    }

    /**
     * 测试点：测试2个字符只有一个不相同
     *        假设有2个不相同呢？
     * 测试结果不正常
     */
    @Test
    public void findTheDifference1() {
        String s = "abef";
        String t = "abce";
        char result = DigitalAbove.findTheDifference(s, t);
        System.out.println(String.valueOf(result));
    }


}