package com.algorithm.common;

import com.algorithm.greedy.GoldBarSegmentation;
import org.junit.Test;

public class GoldBarSegmentationTest {

    /**
     * todo:  10_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_10  2023/1/22 下午9:41 九师兄
     *     测试点:  测试结果为90
     */
    @Test
    public void lessMoney() {
        int[]  arr = new int[]{10,20,30};
        int i = GoldBarSegmentation.lessMoney(arr);
        System.out.println(i);
    }
}