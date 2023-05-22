package com.algorithm.leetcode.swordoffer.offer24;

import com.algorithm.swordoffer.entity.ListNode;
import com.algorithm.swordoffer.offer24.RecursiveSolution;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 15:08
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class RecursiveSolutionTest {

    RecursiveSolution solution = new RecursiveSolution();

    @Test
    public void reversePrint() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;


        ListNode ints = solution.reverseList(head);
        System.out.println(ints);

    }
}