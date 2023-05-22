package com.algorithm.swordoffer.offer24;


import com.algorithm.swordoffer.entity.ListNode;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 09:21
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution {

    Stack<Integer> stack = new Stack<>();

    /**
     * 1->2->3->4->5->NULL
     * 5->4->3->2->1->NULL
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        stackData(head);

        ListNode newHead = null;
        int size = stack.size();
        ListNode currentIndex = null;
        for (int i = 0; i < size; i++) {
            Integer pop = stack.pop();
            ListNode temp = new ListNode(pop);
            if (newHead == null) {
                newHead = temp;
                currentIndex = newHead;
            } else {
                currentIndex.next = temp;
                currentIndex = temp;
            }

        }
        return newHead;
    }

    public void stackData(ListNode head) {
        if (head == null) {
            return;
        }
        int val = head.val;
        stack.push(val);
        stackData(head.next);
    }

    public static void printNode(ListNode node) {
        ListNode currnetNode = node;
        while (true) {
            if (currnetNode == null) {
                break;
            }
            System.out.print(currnetNode.val + "->");
            currnetNode = currnetNode.next;
        }
        System.out.println();
    }

}
