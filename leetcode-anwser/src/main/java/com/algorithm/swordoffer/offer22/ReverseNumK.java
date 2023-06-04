package com.algorithm.swordoffer.offer22;

import com.algorithm.swordoffer.entity.ListNode;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 10:34
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 22. 链表中倒数第k个节点
 * <p>
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，
 * 即链表的尾节点是倒数第1个节点。
 * <p>
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。
 * 这个链表的倒数第 3 个节点是值为 4 的节点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 【算法】剑指 Offer 22. 链表中倒数第k个节点
 * https://blog.csdn.net/qq_21383435/article/details/121588051
 */
public class ReverseNumK {

    public ListNode getKthFromEnd(ListNode head, int k) {
        // 获取链表长度
        int length = 0;
        ListNode currnet = head;
        while (currnet != null) {
            currnet = currnet.next;
            length++;
        }
        System.out.println("链表大小：" + length);

        currnet = head;
        // 获取倒序停止的前一个节点
        int stopIndex = (length - k) - 1;
        while (-1 < stopIndex) {
            currnet = currnet.next;
            stopIndex--;
        }
        return currnet;
    }


    public ListNode getKthFromEnd2(ListNode head, int k) {

        ListNode frontNode = head, behindNode = head;
        while (frontNode != null && k > 0) {

            frontNode = frontNode.next;
            k--;
        }

        while (frontNode != null) {

            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }

        return behindNode;
    }
}
