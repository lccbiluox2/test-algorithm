package com.algorithm.link;

import com.algorithm.entity.link.ListNode;
import com.algorithm.utils.LinkListUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkRemoveNodeAtO1Test {

    private LinkRemoveNodeAtO1 linkRemoveNodeAtO1 = new LinkRemoveNodeAtO1();


    /***
     * todo: 九师兄  2023/6/4 13:01
     * 测试点： 在 O(1) 时间内删除链表节点
     * 删除头节点
     *
     * 结果变成 2->3->4
     */
    @Test
    public void deleteNode() {

        ListNode head = new ListNode(1);
        ListNode A = new ListNode(2);
        ListNode B = new ListNode(3);
        ListNode C = new ListNode(4);
        ListNode D = new ListNode(5);

        head.setNext(A);
        A.setNext(B);
        B.setNext(C);
        C.setNext(D);

        linkRemoveNodeAtO1.deleteNode(head, head);
    }

    /***
     * todo: 九师兄  2023/6/4 13:01
     * 测试点： 在 O(1) 时间内删除链表节点
     * 删除中间节点
     *
     * 1->2->4->5->
     */
    @Test
    public void deleteNodeV1() {

        ListNode head = new ListNode(1);
        ListNode A = new ListNode(2);
        ListNode B = new ListNode(3);
        ListNode C = new ListNode(4);
        ListNode D = new ListNode(5);

        head.setNext(A);
        A.setNext(B);
        B.setNext(C);
        C.setNext(D);

        linkRemoveNodeAtO1.deleteNode(head, B);
        LinkListUtils.printLinkList(head);
    }


    /***
     * todo: 九师兄  2023/6/4 13:01
     * 测试点： 在 O(1) 时间内删除链表节点
     * 删除尾部节点
     *
     * 1->2->3->4->
     */
    @Test
    public void deleteNodeV2() {

        ListNode head = new ListNode(1);
        ListNode A = new ListNode(2);
        ListNode B = new ListNode(3);
        ListNode C = new ListNode(4);
        ListNode D = new ListNode(5);

        head.setNext(A);
        A.setNext(B);
        B.setNext(C);
        C.setNext(D);

        linkRemoveNodeAtO1.deleteNode(head, D);
        LinkListUtils.printLinkList(head);
    }
}