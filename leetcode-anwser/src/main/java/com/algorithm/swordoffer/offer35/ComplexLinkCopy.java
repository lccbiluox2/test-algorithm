package com.algorithm.swordoffer.offer35;


import java.util.HashMap;
import java.util.Map;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-04 18:12
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 35. 复杂链表的复制
 */
public class ComplexLinkCopy {

    private Map<Node,Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        //map中存的是(原节点，拷贝节点)的一个映射
        Map<Node, Node> map = new HashMap<>();
        for (Node cur = head; cur != null; cur = cur.next) {
            map.put(cur, new Node(cur.val));
        }
        //将拷贝的新的节点组织成一个链表
        for (Node cur = head; cur != null; cur = cur.next) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
        }

        return map.get(head);
    }

}
