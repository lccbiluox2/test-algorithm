package com.algorithm.swordoffer.offer24;


import com.algorithm.swordoffer.entity.ListNode;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 09:21
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution1 {


    /**
     * 1->2->3->4->5->NULL
     * 5->4->3->2->1->NULL
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head, next = null;
        while(cur != null) {
            // 头节点的下一个赋值给next
            next = cur.next;
            cur.next = pre;

            pre = cur;
            cur = next;
            // 此时cur和next指向的是一样的 都是剩余的列表
        }
        return pre;
    }

    public static void printNode(String message, ListNode node) {
        System.out.print(message);
        ListNode currnetNode = node;
        while (true) {
            if (currnetNode == null) {
                break;
            }
            System.out.print(currnetNode.val + "->");
            currnetNode = currnetNode.next;
        }
        System.out.println();
    }

}
