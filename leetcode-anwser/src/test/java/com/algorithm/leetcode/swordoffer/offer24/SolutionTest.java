package com.algorithm.leetcode.swordoffer.offer24;

import com.algorithm.swordoffer.entity.ListNode;
import com.algorithm.swordoffer.offer24.Solution;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 09:31
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SolutionTest {


    Solution solution = new Solution();

    /***
     * todo: 九师兄  2023/6/5 09:46
     * 测试点：测试使用栈的方式实现链表的反转
     */
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