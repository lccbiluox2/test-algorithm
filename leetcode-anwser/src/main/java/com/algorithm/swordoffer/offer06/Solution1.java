package com.algorithm.swordoffer.offer06;

import com.algorithm.swordoffer.entity.ListNode;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 22:06
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution1 {

    Stack<Integer> stack = new Stack<>();


    public int[] reversePrint(ListNode head) {
        stackData(head);
        int[] arr = new int[stack.size()];
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            Integer pop = stack.pop();
            arr[i] = pop;
        }
        return arr;
    }

    private void stackData(ListNode head) {
        if(head == null){
            return;
        }
        int val = head.val;
        stack.push(val);
        stackData(head.next);
    }
}
