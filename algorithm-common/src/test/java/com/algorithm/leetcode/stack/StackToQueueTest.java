package com.algorithm.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackToQueueTest {

    private StackToQueue stack = new StackToQueue();

    /***
     * todo: 九师兄  2023/5/21 09:57
     *
     * 测试点：测试使用2个栈实现队列
     */
    @Test
    public void offer() throws Exception {
        stack.offer(1);
        stack.offer(2);
        stack.offer(3);

        Integer poll = stack.poll();
        System.out.println(poll);

        stack.offer(4);

        poll = stack.poll();
        System.out.println(poll);

        poll = stack.poll();
        System.out.println(poll);

        poll = stack.poll();
    }

    /***
     * todo: 九师兄  2023/5/21 09:57
     *
     * 测试点：测试使用2个栈实现队列
     * 开始这里有一个bug，如果先poll的时候 程序会陷入死循环
     *
     *  if(in.isEmpty() && out.isEmpty()){
     *             return null;
     *         }
     *  然后我加了这个代码解决了这个问题
     */
    @Test
    public void offer1() throws Exception {
        Integer poll = stack.poll();
        System.out.println(poll);

        stack.offer(2);
        stack.offer(3);


    }
}
