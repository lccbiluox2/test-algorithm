package com.algorithm.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class StepJumpingV2Test {

    private StepJumpingV2 stepJumpingV2 = new StepJumpingV2();

    /***
     * todo: 九师兄  2023/5/21 15:06
     *
     * 【算法】青蛙跳台阶、变态跳台阶
     * https://blog.csdn.net/qq_21383435/article/details/130791889
     */
    @Test
    public void jumpFloorII() {
        int i = stepJumpingV2.jumpFloorII(4);
        System.out.println(i);
    }

    @Test
    public void humpFloorIIV2() {
        int i = stepJumpingV2.humpFloorIIV2(5);
        System.out.println(i);
    }

}