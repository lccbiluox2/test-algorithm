package com.algorithm.link.reverse;

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
}