package com.algorithm.link;

import com.algorithm.link.entity.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-10 17:13
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkHashRingTest {

    @Test
    public void isLinkHashRing() {
        Node node5 = new Node(5);
        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node2 = new Node(2);
        Node node6 = new Node(6);
        Node node8 = new Node(8);
        Node node1 = new Node(1);

        node5.setNext(node3);
        node3.setNext(node7);
        node7.setNext(node2);
        node2.setNext(node6);
        node6.setNext(node8);
        node8.setNext(node1);
        node1.setNext(node2);

        boolean ring = LinkHashRing.isLinkHashRingUseSenond(node5);
        System.out.println(ring);
    }


    /**
     * 重复的节点为2
     * true
     */
    @Test
    public void isLinkHashRingUseHashTest() {
        Node node5 = new Node(5);
        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node2 = new Node(2);
        Node node6 = new Node(6);
        Node node8 = new Node(8);
        Node node1 = new Node(1);

        node5.setNext(node3);
        node3.setNext(node7);
        node7.setNext(node2);
        node2.setNext(node6);
        node6.setNext(node8);
        node8.setNext(node1);
        node1.setNext(node2);

        boolean ring = LinkHashRing.isLinkHashRingUseHash(node5);
        System.out.println(ring);
    }

    @Test
    public void twoPointTest() {
        Node node5 = new Node(5);
        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node2 = new Node(2);
        Node node6 = new Node(6);
        Node node8 = new Node(8);
        Node node1 = new Node(1);

        node5.setNext(node3);
        node3.setNext(node7);
        node7.setNext(node2);
        node2.setNext(node6);
        node6.setNext(node8);
        node8.setNext(node1);
        node1.setNext(node2);

        boolean ring = LinkHashRing.twoPoint(node5);
        System.out.println(ring);
    }


    @Test
    public void cycleLengthTest() {
        Node node5 = new Node(5);
        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node2 = new Node(2);
        Node node6 = new Node(6);
        Node node8 = new Node(8);
        Node node1 = new Node(1);

        node5.setNext(node3);
        node3.setNext(node7);
        node7.setNext(node2);
        node2.setNext(node6);
        node6.setNext(node8);
        node8.setNext(node1);
        node1.setNext(node2);

        boolean ring = LinkHashRing.cycleLength(node5);
        System.out.println(ring);
    }

    @Test
    public void cyclePointTest() {
        Node node5 = new Node(5);
        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node2 = new Node(2);
        Node node6 = new Node(6);
        Node node8 = new Node(8);
        Node node1 = new Node(1);

        node5.setNext(node3);
        node3.setNext(node7);
        node7.setNext(node2);
        node2.setNext(node6);
        node6.setNext(node8);
        node8.setNext(node1);
        node1.setNext(node2);

        boolean ring = LinkHashRing.cyclePoint(node5);
        System.out.println(ring);
    }
}