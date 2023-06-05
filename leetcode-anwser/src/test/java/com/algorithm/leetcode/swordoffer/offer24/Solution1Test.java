package com.algorithm.leetcode.swordoffer.offer24;

import com.algorithm.swordoffer.entity.ListNode;
import com.algorithm.swordoffer.offer24.Solution1;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 14:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution1Test {

    Solution1 solution = new Solution1();

    /***
     * todo: 九师兄  2023/6/5 09:49
     * 测试点：测试反转链表 使用了第三个变量
     * 感觉和数组交换差不多
     *
     * 使用头插法
     */
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