package com.algorithm.datastructure;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 14:04
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo: 参考：https://www.bilibili.com/video/BV1E4411H73v?p=15
 */
public class CycleArrayToQueue {

    private int[] arr;
    private int maxSize;
    private int readIndex;
    private int writeIndex;
    private int free;

    /**
     * todo: 这里做了一个约定 最后一个值 不存储东西 作为 一个标志位
     * @param size
     */
    public CycleArrayToQueue(int size) {
        maxSize = size;
        this.arr = new int[size];
        readIndex = 0;
        writeIndex = 0;
        free = size;
    }

    public boolean isFull() {
        System.out.println("a1 " + writeIndex + " readIndex" + readIndex);
        System.out.println("a2 " + writeIndex + 1);
        System.out.println("a3 " + (writeIndex + 1) % maxSize);
        return (writeIndex + 1) % maxSize == readIndex;
    }

    public boolean isEmpty() {
        return readIndex == writeIndex;
    }

    public void addQueue(int data) {
        if (isFull()) {
            System.out.println("队列已经满了");
            return;
        }
        arr[writeIndex] = data;
        writeIndex = (writeIndex + 1) % maxSize;
    }


    public Integer readQueue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空");
        }
        int value = arr[readIndex];
        readIndex = (readIndex + 1) % maxSize;
        return value;
    }

    public void printDetail() {
        System.out.println("readIndex:" + readIndex);
        System.out.println("writeIndex:" + writeIndex);
        System.out.println("free:" + free);
        ArraysUtils.printIntArray(arr);
        System.out.println();
    }
}
