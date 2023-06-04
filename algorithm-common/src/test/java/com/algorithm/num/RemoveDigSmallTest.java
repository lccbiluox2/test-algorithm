package com.algorithm.num;

import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-12 22:38
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:  删去k个数字后的最小值
 */
public class RemoveDigSmallTest {


    @Test
    public void setUp1() throws Exception {
        System.out.println(RemoveDigSmall.removeDigSmall("541270936",3));
    }

    @Test
    public void setUp2() throws Exception {
        System.out.println(RemoveDigSmall.removeDigSmall("10",2));
    }


    /**
     * 测试结果如下：
     * 1212
     * 200
     * 0
     * 120936
     *
     * @throws Exception
     */
    @Test
    public void setUp() throws Exception {
        System.out.println(RemoveDigSmall.removeDigSmall("1593212",3));
        System.out.println(RemoveDigSmall.removeDigSmall("30200",1));
        System.out.println(RemoveDigSmall.removeDigSmall("10",2));
        System.out.println(RemoveDigSmall.removeDigSmall("541270936",3));
    }

    /**
     * 1212
     * 200
     * 0
     * 120936
     *
     * @throws Exception
     */
    @Test
    public void removeKDigitsTest() throws Exception {
        System.out.println(RemoveDigSmall.removeKDigits("1593212",3));
        System.out.println(RemoveDigSmall.removeKDigits("30200",1));
        System.out.println(RemoveDigSmall.removeKDigits("10",2));
        System.out.println(RemoveDigSmall.removeKDigits("541270936",3));
    }


    @Test
    public void removeKDigits1Test() throws Exception {
        System.out.println(RemoveDigSmall.removeKDigits1("1593212",3));
        System.out.println(RemoveDigSmall.removeKDigits1("30200",1));
        System.out.println(RemoveDigSmall.removeKDigits1("10",2));
        System.out.println(RemoveDigSmall.removeKDigits1("541270936",3));
    }
}