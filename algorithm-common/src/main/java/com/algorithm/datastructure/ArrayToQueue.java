package com.algorithm.datastructure;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 11:25
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 数组模拟队列 完全自己模拟的数组模拟队列
 * <p>
 * 初始化如下
 * readIndex
 * []        []     []     []     []
 * writeIndex
 * <p>
 * 加入一个数据如下
 * readIndex
 * []        []     []     []     []
 * 。。。。。writeIndex
 * <p>
 * 加入一个数据如下
 * readIndex
 * []        []     []     []     []
 * 。。。。。。。。。writeIndex
 * <p>
 * 读取一个数据如下
 * 。。。。readIndex
 * []        []     []     []     []
 * 。。。。。。。。。writeIndex
 */
public class ArrayToQueue {

    private int[] arr;
    private int maxSize;
    private int readIndex;
    private int writeIndex;
    private int free;

    public ArrayToQueue(int size) {
        maxSize = size;
        this.arr = new int[size];
        readIndex = 0;
        writeIndex = 0;
        free = size;
    }

    public boolean addQueue(int data) {
        // 如果数据已经写满了,那么就是不能添加了
        if (free == 0) {
            return false;
        }


        /**
         *         readIndex
         *  []        []     []     []     []
         *         writeIndex
         *
         *  这种情况下，还是可以添加了
         */
        if (0 < free && writeIndex < maxSize) {
            arr[writeIndex] = data;
            writeIndex = writeIndex + 1;
            free--;
            return true;
        }

        return false;
    }


    public Integer readQueue() {
        if (free < maxSize) {
            int value = arr[readIndex];
            readIndex = readIndex + 1;
            free++;
            return value;
        }
        return null;
    }

    public void printDetail() {
        System.out.println("readIndex:" + readIndex);
        System.out.println("writeIndex:" + writeIndex);
        System.out.println("free:" + free);
        ArraysUtils.printIntArray(arr);
        System.out.println();
    }
}
