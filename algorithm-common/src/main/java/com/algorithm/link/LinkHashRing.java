package com.algorithm.link;

import com.algorithm.link.entity.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-10 16:19
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 【算法】给定一个链表，判断链表中是否有环
 * https://blog.csdn.net/qq_21383435/article/details/120691236
 */
public class LinkHashRing {

    /**
     * 循环遍历节点，然后每个节点应该只有一个父节点和一个子节点，如果一个节点遍历的时候
     * 连续遍历了自己，那么就是有环形的
     * <p>
     * 循环比较遍历过的，如果遍历过的存在，那么就是环形了
     * <p>
     * todo: 没有实现
     *
     * @return
     */
    public static boolean isLinkHashRingUseSenond(Node head) {
        Node current = head.getNext();
        Node allReadForNode = head;
        allReadForNode.setNext(null);

        while (current.getNext() != null) {
            Node next = current.getNext();

            while (allReadForNode.getNext() != null) {
                Node headNext = head.getNext();
                // 这里注意如果这里不做限制，因为里面也是一个循环，链表环形的情况下会会无限循环
                // 那么什么时候跳出循环呢？就是内层循环的next指向的是
                if (headNext == next) {
                    break;
                }
            }
            Node temp = next;
            temp.setNext(null);
            allReadForNode.setNext(temp);

            current = next;
        }
        return false;
    }

    /**
     * 使用list存储已经遍历的节点
     *
     * @param head
     * @return
     */
    public static boolean isLinkHashRingUseHash(Node head) {
        Node current = head;
        List<Integer> hashList = new ArrayList();
        while (current.getNext() != null) {
            Node next = current.getNext();
            if (next == null) {
                return false;
            }
            if (hashList.contains(next.hashCode())) {
                System.out.println("重复的节点为" + next.getData());
                return true;
            } else {
                hashList.add(next.hashCode());
            }
            current = next;
        }
        return false;
    }

    /**
     * 循环遍历节点，然后每个节点应该只有一个父节点和一个子节点，如果一个节点有2个父节点
     * 那么就是有环的
     *
     * @return
     */
    public static boolean twoPoint(Node head) {
        Node p1 = head;
        Node p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            System.out.println("p1:" + p1.getData());
            System.out.println("p2:" + p2.getData());
            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }

    /*
     * 链表环长度的计算
     * @param head 链表头节点
     * */
    public static boolean cycleLength(Node head) {
        Node p1 = head;
        Node p2 = head;

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;

            System.out.println("===========");
            System.out.println("p1:" + p1.getData());
            System.out.println("p2:" + p2.getData());

            if (p1 == p2) {
                int length = 0;
                while (true) {
                    length++;
                    p1 = p1.next;
                    p2 = p2.next.next;

                    System.out.println("=====2======");
                    System.out.println("p1:" + p1.getData());
                    System.out.println("p2:" + p2.getData());

                    if (p1 == p2) {
                        System.out.println("环的长度是：：" + length);
                        return true;
                    }
                }

            }
        }
        return false;
    }

    /*
     * 判断链表的入环点
     * @param head 链表头节点
     * */
    public static boolean cyclePoint(Node head) {
        Node p1 = head;
        Node p2 = head;

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;

            System.out.println("====求是否有环=======");
            System.out.println("p1:" + p1.getData());
            System.out.println("p2:" + p2.getData());

            if (p1 == p2) {
                p1 = head;
                System.out.println("将p1设置为头节点");
                while (true) {
                    p1 = p1.next;
                    p2 = p2.next;

                    System.out.println("====求环点=======");
                    System.out.println("p1:" + p1.getData());
                    System.out.println("p2:" + p2.getData());
                    if (p1 == p2) {
                        System.out.println("环的入点是：" + p2.data);
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
