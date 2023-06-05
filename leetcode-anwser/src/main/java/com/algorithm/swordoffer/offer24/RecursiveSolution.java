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

    /***
     * todo: 九师兄  2023/6/5 09:42
     *
     * 【算法】剑指 Offer 24. 反转链表
     * https://blog.csdn.net/qq_21383435/article/details/121557972
     */
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
