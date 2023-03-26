package com.algorithm.swordoffer.offer18;


/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 23:19
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 18. 删除链表的节点
 */
public class DeleteLinkNode {

    public ListNode deleteNode(ListNode head, int val) {

        // 只有一个元素 或者第一个元素就是
        if(head.val == val){
            return head.next;
        }

        ListNode currnet = head;
        ListNode pre = head;
        ListNode next = head.next;
        while (currnet != null) {
            if (currnet.val == val) {
                System.out.println("找到数据");
                pre.next = next;
                currnet.next = null;
                break;
            } else {
                pre = currnet;
                currnet = currnet.next;
                next = currnet.next;
                System.out.println("xx");
            }
        }
        return head;
    }


    public ListNode deleteNode1(ListNode head, int val) {
        if(head == null) return head;
        ListNode cur = head;
        ListNode pre = null;
        if(cur.val == val) return head.next;
        // 找到这个节点，此时pre节点指向这个节点的前一个节点
        while(cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;
    }


    public ListNode deleteNode2(ListNode head, int val) {
        ListNode p = head;

        // 例外情况，如果删除的是第一个节点，那就直接返回第一个节点
        if (p.val == val) {
            return head.next;
        }


        while (p.next != null) {
            if (p.next.val == val) {
                // 当前节点指向待删除节点的下一个节点，这样子就成功删除了
                p.next = p.next.next;
                return head;
            }
            p = p.next;
        }

        return head;
    }

}

