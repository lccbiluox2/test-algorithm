package com.algorithm.common.link.reverse;

import com.algorithm.common.link.entity.Node;
import org.junit.Test;

import static org.junit.Assert.*;

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
        Node node1 = new Node(1,null);
        Node node2 = new Node(2,node1);
        Node node3 = new Node(3,node2);

        Node reverseNode = LinkReverseDemo1.reverseListNode(node3);

        System.out.println(reverseNode.getData());
        System.out.println(reverseNode.getNext().getData());
        System.out.println(reverseNode.getNext().getNext().getData());

    }
}