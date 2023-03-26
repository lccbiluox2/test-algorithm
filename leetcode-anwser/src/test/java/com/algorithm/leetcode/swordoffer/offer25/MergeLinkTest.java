package com.algorithm.leetcode.swordoffer.offer25;

import com.algorithm.swordoffer.entity.ListNode;
import com.algorithm.swordoffer.offer25.MergeLink;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 11:27
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MergeLinkTest {

    private MergeLink mergeLink = new MergeLink();

    /**
     * 输入：1->2->4, 3->4
     * 输出：1->2->3->4->4
     */
    @Test
    public void mergeTwoLists() {

        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(4);

        head.next = next1;
        next1.next = next2;

        ListNode head_1 = new ListNode(3);
        ListNode next_1 = new ListNode(4);

        head_1.next = next_1;

        ListNode listNode = mergeLink.mergeTwoLists(head, head_1);
        System.out.println(listNode);
    }

    @Test
    public void mergeTwoLists1() {

        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(4);

        head.next = next1;
        next1.next = next2;

        ListNode head_1 = new ListNode(3);
        ListNode next_1 = new ListNode(4);

        head_1.next = next_1;

        ListNode listNode = mergeLink.mergeTwoLists1(head, head_1);
        System.out.println(listNode);
    }
}