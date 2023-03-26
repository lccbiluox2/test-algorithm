package com.algorithm.leetcode.swordoffer.offer06;

import com.algorithm.swordoffer.entity.ListNode;
import com.algorithm.swordoffer.offer06.Solution2;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 22:24
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution2Test {

    Solution2 solution = new Solution2();

    @Test
    public void reversePrint() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        int[] ints = solution.reversePrint(head);
        System.out.println(Arrays.toString(ints));
    }

}