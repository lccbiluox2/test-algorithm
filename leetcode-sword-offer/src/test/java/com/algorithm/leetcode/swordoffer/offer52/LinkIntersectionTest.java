package com.algorithm.leetcode.swordoffer.offer52;

import com.algorithm.leetcode.swordoffer.entity.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 12:32
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkIntersectionTest {

    LinkIntersection linkIntersection = new LinkIntersection();

    @Test
    public void getIntersectionNode() {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(4);

        head.next = next1;
        next1.next = next2;

        ListNode head_1 = new ListNode(2);
        ListNode next_1 = new ListNode(4);

        head_1.next = next_1;

        ListNode listNode = linkIntersection.getIntersectionNode(head, head_1);
        System.out.println(listNode);
    }

    @Test
    public void getIntersectionNode1() {
        ListNode A = new ListNode(0);
        ListNode B = new ListNode(9);
        ListNode C = new ListNode(1);
        ListNode D = new ListNode(2);
        ListNode E = new ListNode(4);

        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;


        ListNode o1 = new ListNode(3);
        ListNode o2 = new ListNode(2);
        ListNode o3 = new ListNode(4);

        o1.next = o2;
        o2.next = o3;

        ListNode listNode = linkIntersection.getIntersectionNode(A, o1);
        System.out.println(listNode);
    }

    @Test
    public void getIntersectionNode2() {
        ListNode A = new ListNode(0);
        ListNode B = new ListNode(9);
        ListNode C = new ListNode(1);
        ListNode D = new ListNode(2);
        ListNode E = new ListNode(4);

        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;


        ListNode o1 = new ListNode(3);
        ListNode o2 = new ListNode(2);
        ListNode o3 = new ListNode(4);

        o1.next = o2;
        o2.next = o3;

        ListNode listNode = linkIntersection.getIntersectionNode1(A, o1);
        System.out.println(listNode);
    }
}