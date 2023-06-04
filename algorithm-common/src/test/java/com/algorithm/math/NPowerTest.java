package com.algorithm.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NPowerTest {

    private NPower nPower = new NPower();

    /***
     * todo: 九师兄  2023/6/4 12:33
     * 测试点：给定一个 double 类型的浮点数 x和 int 类型的整数 n，求 x 的 n 次方。
     *
     * 【算法】求 x 的 n 次方
     * https://blog.csdn.net/qq_21383435/article/details/131030943
     */
    @Test
    public void power() {
        double pow = Math.pow(3, 5);
        System.out.println(pow);

        double power = nPower.Power(3, 5);
        System.out.println(power);
    }

    @Test
    public void power1() {
        double pow = Math.pow(4, 7);
        System.out.println(pow);

        double power = nPower.Power(4, 7);
        System.out.println(power);
    }

    @Test
    public void power2() {
        double pow = Math.pow(4, 8);
        System.out.println(pow);

        double power = nPower.Power(4, 8);
        System.out.println(power);
    }


    /***
     * todo: 九师兄  2023/6/4 12:33
     * 测试点：给定一个 double 类型的浮点数 x和 int 类型的整数 n，求 x 的 n 次方。
     *
     * 【算法】求 x 的 n 次方
     * https://blog.csdn.net/qq_21383435/article/details/131030943
     */
    @Test
    public void powerv3() {
        double power = nPower.powerv3(3, 5);
    }
}