package com.algorithm.common.stack.queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-02 19:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StackToQueueTest {


    /**
     * 栈1加入数据1 栈2：0
     * 栈1加入数据2 栈2：0
     * 栈2加入数据0 栈1：1
     * 栈2加入数据1 栈1：0
     * 1
     * 2
     */
    @Test
    public void cal() {
        StackToQueue.stackInAdd(1);
        StackToQueue.stackInAdd(2);

        StackToQueue.stackOutAdd();
        StackToQueue.stackOutAdd();


        StackToQueue.stackOutPrint();
        StackToQueue.stackOutPrint();

    }




}