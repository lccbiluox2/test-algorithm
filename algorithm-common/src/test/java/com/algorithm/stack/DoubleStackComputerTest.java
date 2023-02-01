package com.algorithm.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleStackComputerTest {

    /**
     *todo: 2023/2/1 23:19 九师兄
     * 测试点：测试输出这个算法是在正常的
     **/
    @Test
    public void computing() {
        DoubleStackComputer doubleStackComputer = new DoubleStackComputer();
        int computing = doubleStackComputer.computing("3+2*6-2".toCharArray());
        Assert.assertEquals(13,computing);
    }

    /**
     *todo: 2023/2/1 23:18 九师兄
     *  测试点：这个按理应该输出-1 但是实际输出34 还是有些问题的
     *  java.lang.AssertionError:
     * Expected :-1
     * Actual   :34
     **/
    @Test
    public void computing1() {
        DoubleStackComputer doubleStackComputer = new DoubleStackComputer();
        int computing = doubleStackComputer.computing("3*2/6-2".toCharArray());
        Assert.assertEquals(-1,computing);
    }
}