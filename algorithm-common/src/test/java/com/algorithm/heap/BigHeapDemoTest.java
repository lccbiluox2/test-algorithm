package com.algorithm.heap;


import org.junit.Test;

public class BigHeapDemoTest {

    /**
     * todo: 2023/1/7 下午10:16 九师兄
     *     测试点: 测试大根堆的插入
     */
    @Test
    public void testHeapInsert() {
        int[] arr = {1,5,7,9,0,2,6,7};
        for (int i = 0; i < arr.length; i++) {
            BigHeapDemo.heapInsert(arr,i);
        }
    }

    /**
     * todo: 2023/1/7 下午10:35 九师兄
     *     测试点:测试大根堆的插入
     */
    @Test
    public void heapInsertDebug() {
        int[] arr = {1,5,7,9,0,2,6,7};
        for (int i = 0; i < arr.length; i++) {
            BigHeapDemo.heapInsertDebug(arr,i);
        }
    }

    @Test
    public void heapInsertDebug1() {
        int[] arr = {5,3,6,7,7};
        for (int i = 0; i < arr.length; i++) {
            BigHeapDemo.heapInsertDebug(arr,i);
        }
    }



}