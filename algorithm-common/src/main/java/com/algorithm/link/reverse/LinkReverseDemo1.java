package com.algorithm.link.reverse;

import com.algorithm.entity.link.ListNode;
import com.algorithm.link.entity.Node;

import java.util.Stack;

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
    public static ListNode reverseList(ListNode head){
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


    /**
     * todo:  60_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_60  2023/1/30 13:58 九师兄
     *     测试点: 反转链表使用栈的方式
     */
    public static ListNode reverserLinkedList2(ListNode node){
        Stack<ListNode> nodeStack = new Stack<>();
        ListNode head = null;
        //存入栈中，模拟递归开始的栈状态
        while (node != null){
            nodeStack.push(node);
            node = node.next;
        }
        //特殊处理第一个栈顶元素（也就是反转前的最后一个元素，因为它位于最后，不需要反转，如果它参与下面的while，因为它的下一个节点为空，如果getNode()， 那么为空指针异常）
        if ((!nodeStack.isEmpty())){
            head = nodeStack.pop();
        }
        //排除以后就可以快乐的循环
        while (!nodeStack.isEmpty()){
            ListNode tempNode = nodeStack.pop();
            tempNode.next.next = tempNode;
            tempNode.next = null;
        }
        return head;
    }
}
