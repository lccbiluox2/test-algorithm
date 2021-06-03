package com.algorithm.common.stack.queue;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-03 21:17
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StackToQueue1Test {

    @Test
    public void poll() {
        StackToQueue1<Integer> queue = new StackToQueue1<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int data = rand.nextInt(100);
            System.out.print(data + " ");
            queue.offer(data);
        }
        System.out.println();
        System.out.println("出队：");
        while (!queue.empty()) {
            System.out.print(queue.poll()+" ");
        }
    }
}