package com.algorithm.leetcode.swordoffer.offer18;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 23:38
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class DeleteLinkNodeTest {

    DeleteLinkNode deleteLinkNode = new DeleteLinkNode();

    @Test
    public void deleteNode() {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(3);

        head.next = next1;
        next1.next = next2;

        deleteLinkNode.deleteNode(head,2);

    }

    @Test
    public void deleteNode2() {
        ListNode head = new ListNode(1);

        ListNode listNode = deleteLinkNode.deleteNode(head, 1);
        System.out.println(listNode);
    }

    @Test
    public void deleteNode3() {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(3);

        head.next = next1;
        next1.next = next2;

        ListNode listNode = deleteLinkNode.deleteNode(head, 3);
        System.out.println(listNode);
    }

    @Test
    public void deleteNode4() {
        ListNode head = new ListNode(-3);
        ListNode next1 = new ListNode(5);
        ListNode next2 = new ListNode(-99);

        head.next = next1;
        next1.next = next2;

        ListNode listNode = deleteLinkNode.deleteNode(head, -3);
        System.out.println(listNode);
    }
}