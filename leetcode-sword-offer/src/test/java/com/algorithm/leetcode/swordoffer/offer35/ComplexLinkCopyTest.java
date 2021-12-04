package com.algorithm.leetcode.swordoffer.offer35;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-04 19:00
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ComplexLinkCopyTest {

    private ComplexLinkCopy clent = new ComplexLinkCopy();

    @Test
    public void copyRandomList() {
        Node head = new Node(7);
        Node A = new Node(13);
        Node B = new Node(11);
        Node C = new Node(10);
        Node D = new Node(1);

        head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;

        head.random = null;
        A.random = head;
        B.random = D;
        C.random = B;
        D.random = head;


        Node node = clent.copyRandomList(head);

        System.out.println(node);
    }
}