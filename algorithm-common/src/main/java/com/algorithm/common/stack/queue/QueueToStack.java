package com.algorithm.common.stack.queue;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-03 21:55
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class QueueToStack {

    /**
     * take()函数，如果队列中没有数据，则线程wait释放CPU，而poll()则不会等待，直接返回null；
     * 同样，空间耗尽时offer()函数不会等待，直接返回false，而put()则会wait，
     * <p>
     * 因此如果你使用while(true)来获得队列元素，千万别用poll()，CPU会100%的。
     * <p>
     * add: 内部实际上获取的offer方法，当Queue已经满了时，抛出一个异常。不会阻塞。
     * <p>
     * offer:当Queue已经满了时，返回false。不会阻塞。
     * <p>
     * put:当Queue已经满了时，会进入等待，只要不被中断，就会插入数据到队列中。会阻塞，可以响应中断。
     *
     * @param arr
     * @param queue1
     * @param queue2
     * @param <T>
     */
    public static <T> void twoQueueToStack2(T[] arr,
                                            ArrayBlockingQueue<T> queue1,
                                            ArrayBlockingQueue<T> queue2) {
        for (int i = 0; i < arr.length; i++) {//把数据依次放入queue1中
            queue1.add(arr[i]);
        }
        int count = 1;
        while (!(queue1.isEmpty() && queue2.isEmpty())) {//循环条件为queue1和queue2都不为空
            System.out.println("===============================");
            System.out.println("进行第" + count + "轮交换");
            if (queue1.isEmpty()) {
                for (int i = 0; i < arr.length - count; i++) {
                    // peek获取当前元素，不阻塞，不移动指针
                    T queue2Data = queue2.peek();
                    queue1.add(queue2Data);
                    // poll 获取当前元素，队列为空返回null，队列不为空返回元素，获取后移除
                    T re = queue2.poll();
                    System.out.println("从队列2中取出元素：" + queue2Data + "添加到队列1中 队列2移除元素：" + re);
                    printQueue(queue1, queue2);
                }
                System.out.println("--------------------------------队列2最终输出:" + queue2.peek() + " ");
                T re2 = queue2.poll();
                System.out.println("队列2移除元素：" + re2);
                printQueue(queue1, queue2);
                count++;
            } else if (queue2.isEmpty()) {
                for (int i = 0; i < arr.length - count; i++) {
                    T queue1Data = queue1.peek();
                    queue2.add(queue1Data);
                    T re1 = queue1.poll();
                    System.out.println("从队列1中取出元素：" + queue1Data + "添加到队列2中 队列1移除元素：" + re1);
                    printQueue(queue1, queue2);
                }
                System.out.println("--------------------------------队列1最终输出:" + queue1.peek() + " ");
                T re1 = queue1.poll();
                System.out.println("队列2移除元素：" + re1);
                count++;
                printQueue(queue1, queue2);
            }
        }

    }

    private static <T> void printQueue(ArrayBlockingQueue<T> queue1,
                                       ArrayBlockingQueue<T> queue2) {

        System.out.println(Arrays.deepToString(queue1.toArray()));
        System.out.println(Arrays.deepToString(queue2.toArray()));
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 6, 2, 7, 3, 6};
        twoQueueToStack2(arr, new ArrayBlockingQueue<Integer>(100), new ArrayBlockingQueue<Integer>(100));
    }

}
