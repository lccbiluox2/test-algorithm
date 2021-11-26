package com.algorithm.leetcode.swordoffer.offer06;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 22:12
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
        int[] ints = solution.reversePrint(head);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void reversePrint1() {
        ListNode head = new ListNode(1);
        int[] ints = solution.reversePrint(head);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void reversePrint2() {
        int[] ints = solution.reversePrint(null);
        System.out.println(Arrays.toString(ints));
    }
}