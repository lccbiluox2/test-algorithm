package com.algorithm.leetcode.swordoffer.offer03;

import com.algorithm.swordoffer.offer03.RepeatNum;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 12:00
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class RepeatNumTest {

    RepeatNum repeatNum = new RepeatNum();

    /**
     * 1^1=0;
     * 1^0=1;
     * 0^1=1;
     * 0^0=0;
     *
     */
    @Test
    public void findRepeatNumber() {
        int[] data = new int[]{1,2,3,5,7,7};
        System.out.println(0^1);
        System.out.println(1^2);
        System.out.println(2^2);
        System.out.println(1^2^3);
        System.out.println(7^7);
        System.out.println(1^2^3^5^7^7);
        int repeatNumber = repeatNum.findRepeatNumber(data);
        System.out.println("重复数字有："+repeatNumber);
    }

    @Test
    public void findRepeatNumber1() {
        int[] data = new int[]{1,2,3,5,7,7};
        int repeatNumber = repeatNum.findRepeatNumber1(data);
        System.out.println("重复数字有："+repeatNumber);
    }

    /***
     * todo: 九师兄  2023/5/20 15:17
     * 测试点：https://github.com/CyC2018/CS-Notes/tree/master/notes
     * 测试结果
     *  java.lang.ArrayIndexOutOfBoundsException: 7
     *  该方案有缺陷
     */
    @Test
    public void duplicate() {
        int[] data = new int[]{1,2,3,5,7,7};
        int repeatNumber = repeatNum.duplicate(data);
        System.out.println("重复数字有："+repeatNumber);
    }
}