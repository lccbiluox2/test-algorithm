package com.algorithm.swordoffer.offer06;

import com.algorithm.swordoffer.entity.ListNode;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 22:23
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 */
public class Solution2 {

    // 执行用时 : 0 ms, 在所有 Java 提交中击败了 100.00% 的用户
    // 内存消耗 : 39.8 MB, 在所有 Java 提交中击败了 100.00% 的用户
    // 我就不使用栈，就不使用递归，反正怎么样也是扫描两趟，为什么要额外分配空间呢？
    // 感谢 @谢飞机 的灵感。
    public static int[] reversePrint(ListNode head) {
        printNode(head);
        ListNode node = head;

        // 这一步就是求链表的长度
        int count = 0;
        while (node != null) {
            ++count;
            printNode(node);
            node = node.next;
        }
        int[] nums = new int[count];

        // 神奇的是这里 正序遍历链表 但是填入数组的时候 是倒序
        node = head;
        for (int i = count - 1; i >= 0; --i) {
            printNode(node);
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }

    private static void printNode(ListNode node) {
        ListNode currnetNode = node;
        while (true){
            if(currnetNode == null){
                break;
            }
            System.out.print(currnetNode.val +"->");
            currnetNode = currnetNode.next;
        }
        System.out.println();
    }

}
