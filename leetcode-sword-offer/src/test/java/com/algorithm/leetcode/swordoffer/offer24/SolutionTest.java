package com.algorithm.leetcode.swordoffer.offer24;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 09:31
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SolutionTest {


    Solution solution = new Solution();

    @Test
    public void reversePrint() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;

        solution.printNode(head);

        ListNode ints = solution.reverseList(head);

        solution.printNode(ints);
    }
}