package com.algorithm.video.zuoshen.recursion;


import org.junit.Assert;
import org.junit.Test;

public class RecursionMaxArrayTest {

    /**
     * todo: 2023/1/2 下午2:25 九师兄
     *     测试点: 测试递归方式获取数组的最大值
     */
    @Test
    public void testGetMax() {

        int[] arr = {1,3,6,0,6};
        int max = RecursionMaxArray.getMax(arr);
        Assert.assertEquals(max,6);
    }
}