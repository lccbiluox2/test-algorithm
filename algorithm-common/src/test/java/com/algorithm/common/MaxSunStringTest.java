package com.algorithm.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSunStringTest {

    /**
     * todo:  10_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_10  2023/1/23 下午2:52 九师兄
     *     测试点:
     *
     * 测试结果如下：
     *  a b c
     *  a b
     *  a c
     *  a
     *  b c
     *  b
     *  c
     */
    @Test
    public void function() {
        MaxSunString.function("abc");
    }

    /**
     * todo:  28_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_28  2023/1/23 下午3:00 九师兄
     *     测试点:
     *
     * 运行结果如下
     * abc
     * ab 
     * a c
     * a  
     *  bc
     *  b 
     *   c
     *
     */
    @Test
    public void printAllSubsquence() {
        MaxSunString.printAllSubsquence("abc");
    }
}