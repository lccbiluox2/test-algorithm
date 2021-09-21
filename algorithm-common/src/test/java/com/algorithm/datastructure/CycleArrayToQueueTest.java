package com.algorithm.datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 14:39
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class CycleArrayToQueueTest {

    @Test
    public void addQueue6() {
        CycleArrayToQueue arrayToQueue = new CycleArrayToQueue(4);
        arrayToQueue.addQueue(2);
        arrayToQueue.addQueue(5);
        arrayToQueue.addQueue(8);
        arrayToQueue.addQueue(9);
        arrayToQueue.printDetail();

        Integer integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        arrayToQueue.addQueue(10);
        arrayToQueue.printDetail();

        arrayToQueue.addQueue(15);
        arrayToQueue.printDetail();

        integer = arrayToQueue.readQueue();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        System.out.println(integer);

        arrayToQueue.printDetail();
    }

}