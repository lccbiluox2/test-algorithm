package com.algorithm.link;

import com.algorithm.entity.link.ListNode;

/***
 * todo: 九师兄  2023/6/4 13:13
 *
 * 【算法】在 O(1) 时间内删除链表节点
 * https://blog.csdn.net/qq_21383435/article/details/131031237
 */
public class LinkRemoveNodeAtO1 {

    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null)
            return null;
        if (tobeDelete.next != null) {
            // 要删除的节点不是尾节点
            ListNode next = tobeDelete.next;
            tobeDelete.val = next.val;
            tobeDelete.next = next.next;
        } else {
            if (head == tobeDelete)
                // 只有一个节点
                head = null;
            else {
                ListNode cur = head;
                while (cur.next != tobeDelete)
                    cur = cur.next;
                cur.next = null;
            }
        }
        return head;
    }


}
