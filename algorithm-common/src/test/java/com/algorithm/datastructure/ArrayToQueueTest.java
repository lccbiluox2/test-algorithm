package com.algorithm.datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 11:44
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ArrayToQueueTest {

    @Test
    public void addQueue() {
        ArrayToQueue arrayToQueue = new ArrayToQueue(4);
        Integer integer = arrayToQueue.readQueue();
        System.out.println(integer);
    }

    @Test
    public void addQueue1() {
        ArrayToQueue arrayToQueue = new ArrayToQueue(4);
        arrayToQueue.addQueue(2);
        arrayToQueue.printDetail();

        Integer integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);
    }

    @Test
    public void addQueue3() {
        ArrayToQueue arrayToQueue = new ArrayToQueue(4);
        arrayToQueue.addQueue(2);
        arrayToQueue.printDetail();

        Integer integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);
    }


    /**
     *  readIndex
     *  []        []     []     []     []
     *                              writeIndex
     */
    @Test
    public void addQueue4() {
        ArrayToQueue arrayToQueue = new ArrayToQueue(4);
        arrayToQueue.addQueue(2);
        arrayToQueue.addQueue(5);
        arrayToQueue.addQueue(8);
        arrayToQueue.printDetail();

        Integer integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);
    }

    @Test
    public void addQueue5() {
        ArrayToQueue arrayToQueue = new ArrayToQueue(4);
        arrayToQueue.addQueue(2);
        arrayToQueue.addQueue(5);
        arrayToQueue.addQueue(8);
        arrayToQueue.addQueue(9);
        arrayToQueue.addQueue(10);
        arrayToQueue.printDetail();

        Integer integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);

        integer = arrayToQueue.readQueue();
        arrayToQueue.printDetail();
        System.out.println(integer);
    }

    @Test
    public void addQueue6() {
        ArrayToQueue arrayToQueue = new ArrayToQueue(4);
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