package com.algorithm.leetcode.swordoffer.offer52;

import com.algorithm.leetcode.swordoffer.entity.ListNode;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 12:31
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 52. 两个链表的第一个公共节点
 */
public class LinkIntersection {

    /**
     * 这个针对的是有序链表，如果没有有序是错误的
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null && tempB != null) {
            // 如果l1的值小于l2的值，那么证明l1的小，要取这个值
            if(tempA.val < tempB.val) {
                // l1 往下走 l2 不动
                tempA = tempA.next;
            }else if(tempA.val > tempB.val){
                // l1 不动  l2 往下走
                tempB = tempB.next;
            }else if(tempA.val == tempB.val){
                // l1 不动  l2 往下走
                return tempB;
            }

        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;
        ListNode n1 = headA;
        ListNode n2 = headB;

        while(n1 != n2){
            n1 = n1 == null ? headB : n1.next;
            n2 = n2 == null ? headA : n2.next;
            System.out.println("n1="+n1);
            System.out.println("n2="+n2);
            System.out.println();
        }
        return n1;

    }

}
