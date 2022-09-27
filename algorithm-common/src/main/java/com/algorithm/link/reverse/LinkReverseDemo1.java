package com.algorithm.link.reverse;

import com.algorithm.link.entity.Node;
import com.algorithm.offer_bible.entity.ListNode;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-03 22:39
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkReverseDemo1 {


    public static com.algorithm.link.entity.Node reverseListNode(com.algorithm.link.entity.Node head){
        //单链表为空或只有一个节点，直接返回原单链表
        if (head == null || head.getNext() == null){
            return head;
        }
        //前一个节点指针
        com.algorithm.link.entity.Node preNode = null;
        //当前节点指针
        com.algorithm.link.entity.Node curNode = head;
        //下一个节点指针
        Node nextNode = null;

        while (curNode != null){
            nextNode = curNode.getNext();//nextNode 指向下一个节点
            curNode.setNext(preNode);//将当前节点next域指向前一个节点
            preNode = curNode;//preNode 指针向后移动
            curNode = nextNode;//curNode指针向后移动
        }

        return preNode;
    }

    /**
     *todo: 9/25/22 9:04 PM 九师兄
     * 测试点：测试使用递归反转单向链表
     **/
    public ListNode reverseList(ListNode head){
        /**
         *todo: 9/25/22 9:05 PM 九师兄
         * 如果链表为空，那么说明没法反转链表 如果当前节点下个节点为空，那么说明只有一个节点
         * 所以也不需要反转链表
         **/
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
