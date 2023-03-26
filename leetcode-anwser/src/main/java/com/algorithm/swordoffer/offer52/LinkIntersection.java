package com.algorithm.swordoffer.offer52;

import com.algorithm.swordoffer.entity.ListNode;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 12:31
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 52. 两个链表的第一个公共节点
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
            if (tempA.val < tempB.val) {
                // l1 往下走 l2 不动
                tempA = tempA.next;
            } else if (tempA.val > tempB.val) {
                // l1 不动  l2 往下走
                tempB = tempB.next;
            } else if (tempA.val == tempB.val) {
                // l1 不动  l2 往下走
                return tempB;
            }

        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;
        ListNode n1 = headA;
        ListNode n2 = headB;

        while (n1 != n2) {
            n1 = n1 == null ? headB : n1.next;
            n2 = n2 == null ? headA : n2.next;
            System.out.println("n1=" + n1);
            System.out.println("n2=" + n2);
            System.out.println();
        }
        return n1;

    }

    /**
     * todo: 2023/1/8 下午6:17 九师兄
     * 测试点: 求两个链表相交节点
     * https://www.bilibili.com/video/BV13g41157hK/?p=7&spm_id_from=pageDriver&vd_source=44c491a7c7c735ef8081cb60288bb47e
     * 左神大佬讲解
     */
    public ListNode noLoop(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        int n = 0;
        while (cur1.next != null) {
            n++;
            cur1 = cur1.next;
        }
        while (cur2.next != null) {
            n--;
            cur2 = cur2.next;
        }

        if (cur1 != cur2) {
            return null;
        }
        cur1 = n > 0 ? head1 : head2;
        cur2 = cur1 == head1 ? head2 : head1;
        n = Math.abs(n);

        while (n != 0) {
            n--;
            cur1 = cur1.next;
        }
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }


    /**
     * todo: 2023/1/8 下午6:36 九师兄
     * 测试点:测试两个链表是否相交，两个链表都有环的情况下
     * 1. A 有环  B 有环 但是不相交
     * 2. A 有环  B 有环 两者只有一个交点
     * 2. A 有环  B 有环 两者只有2个交点
     */
    public ListNode getIntersectionNodeV2(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        ListNode loop1 = getLoopNode(headA);
        ListNode loop2 = getLoopNode(headB);
        if (loop1 == null || loop2 == null) {
            return noLoop(headA, headB);
        }
        if (loop1 != null && loop2 != null) {
            return bothLoop(headA, loop1, headB, loop2);
        }
        return null;
    }

    private ListNode bothLoop(ListNode headA, ListNode loop1, ListNode headB, ListNode loop2) {
        ListNode cur1 = null;
        ListNode cur2 = null;
        if(loop1 == loop2){
            cur1 = headA;
            cur2 = headB;
            int n = 0;
            while (cur1 != loop1) {
                n++;
                cur1 = cur1.next;
            }
            while (cur2.next != loop2) {
                n--;
                cur2 = cur2.next;
            }
            cur1 = n > 0 ? headA : headB;
            cur2 = cur1 == headA ? headB : headA;
            n = Math.abs(n);
            while (n != 0) {
                n--;
                cur1 = cur1.next;
            }
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        }else {
          cur1 = loop1.next;
          while (cur1 != loop1){
              if(cur1 == loop2){
                  return loop1;
              }
              cur1 = cur1.next;
          }
        }
        return null;
    }

    private ListNode getLoopNode(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        // 快慢指针
        ListNode n1 = head.next;
        ListNode n2 = head.next.next;
        while (n1 != n2) {
            if (n2.next == null || n2.next.next == null) {
                return null;
            }
            n2 = n2.next.next;
            n1 = n1.next;
        }
        n2 = head;
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }
}
