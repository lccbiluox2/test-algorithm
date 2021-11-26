package com.algorithm.leetcode.swordoffer.offer30;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 16:55
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MinStack2 {

    private Node head;

    public MinStack2() {

    }

    public void push(int x) {

        if (head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(head.min, x), head);
    }

    public void pop() {

        head = head.next;
    }

    public int top() {

        return head.val;
    }

    public int min() {

        return head.min;
    }

    private class Node {

        int val;
        int min;
        Node next;

        public Node(int val, int min, Node next) {

            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
