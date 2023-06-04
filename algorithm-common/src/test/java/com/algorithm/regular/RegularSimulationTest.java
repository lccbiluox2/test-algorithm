package com.algorithm.regular;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularSimulationTest {


    /***
     * todo: 九师兄  2023/6/4 18:38
     *
     * 【算法】正则匹配、？号和 *号、从左往右尝试模型
     * https://blog.csdn.net/qq_21383435/article/details/129225468
     */
    @Test
    public void isMatch() {
        boolean aaa = RegularSimulation.isMatch("aaa", "a*a");
        Assert.assertTrue("错误",aaa);
    }
}