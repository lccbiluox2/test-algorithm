package com.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShipTest {

    /**
     *todo: 2023/2/22 22:34 九师兄
     * 【算法】N个人坐船，求最少需要的船的个数
     * https://blog.csdn.net/qq_21383435/article/details/129151926
     **/
    @Test
    public void minBoat() {
        int[] arr = new int[]{1,1,3,3,3,4,4,5,5,5,7,7,9,9,9};
        int i = ArrayShip.minBoat(arr, 10);
        System.out.println(i);
        Assert.assertEquals(8,i);
    }
}