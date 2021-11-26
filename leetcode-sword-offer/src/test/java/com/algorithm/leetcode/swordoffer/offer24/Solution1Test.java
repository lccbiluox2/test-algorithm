package com.algorithm.leetcode.swordoffer.offer24;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 14:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution1Test {

    Solution1 solution = new Solution1();

    @Test
    public void reversePrint() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;

        solution.printNode("初始数据", head);

        ListNode ints = solution.reverseList(head);

        solution.printNode("最终结果", ints);
    }
}