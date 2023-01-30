package com.algorithm.link.reverse;

import com.algorithm.entity.link.ListNode;
import com.algorithm.link.entity.Node;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-03 22:44
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkReverseDemo1Test {

    /**
     * 单链表反转操作：
     * https://www.jianshu.com/p/9efd3059c63a
     * 测试结果：没测试成功
     */
    @Test
    public void reverseListNode() {
        com.algorithm.link.entity.Node node1 = new com.algorithm.link.entity.Node(1,null);
        com.algorithm.link.entity.Node node2 = new com.algorithm.link.entity.Node(2,node1);
        com.algorithm.link.entity.Node node3 = new com.algorithm.link.entity.Node(3,node2);

        Node reverseNode = LinkReverseDemo1.reverseListNode(node3);

        System.out.println(reverseNode.getData());
        System.out.println(reverseNode.getNext().getData());
        System.out.println(reverseNode.getNext().getNext().getData());

    }

    /**
     * todo:  36_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_36  2023/1/30 13:55 九师兄
     *     测试点: 测试递归反转链表 使用递归的方式
     *     https://juejin.cn/post/6844904022344744967
     */
    @Test
    public void reverseList() {
        ListNode node1 = new ListNode(1,null);
        ListNode node2 = new ListNode(2,node1);
        ListNode node3 = new ListNode(3,node2);

        ListNode reverseNode = LinkReverseDemo1.reverseList(node3);

        System.out.println(reverseNode.val);
        System.out.println(reverseNode.next.val);
        System.out.println(reverseNode.next.next.val);

    }

    /**
     * todo:  60_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_60  2023/1/30 13:58 九师兄
     *     测试点: 反转链表使用栈的方式
     */
    @Test
    public void reverserLinkedList2() {
        ListNode node1 = new ListNode(1,null);
        ListNode node2 = new ListNode(2,node1);
        ListNode node3 = new ListNode(3,node2);

        ListNode reverseNode = LinkReverseDemo1.reverserLinkedList2(node3);

        System.out.println(reverseNode.val);
        System.out.println(reverseNode.next.val);
        System.out.println(reverseNode.next.next.val);

    }
}