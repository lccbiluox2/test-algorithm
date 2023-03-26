package com.algorithm.swordoffer.offer24;

import com.algorithm.swordoffer.entity.ListNode;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 15:07
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 递归反转链表
 */
public class RecursiveSolution {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

}
