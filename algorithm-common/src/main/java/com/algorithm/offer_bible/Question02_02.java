package com.algorithm.offer_bible;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Question02_02 {

    /**
     *todo: 9/24/22 6:49 PM 九师兄
     * https://leetcode.cn/problems/kth-node-from-end-of-list-lcci/?favorite=xb9lfcwi
     *
     * https://blog.csdn.net/qq_21383435/article/details/127037265
     **/
    public int kthToLast(ListNode head, int k) {
        if(head == null){
            return 1;
        }
        ListNode currentNode = head;
        ListNode lastNode = head;
        for (int i = 1; i <= k; i++) {
            // 如果正数第k个节点都不存在 那么直接返回 -1
            if(lastNode == null){
                return 1;
            }
            lastNode =  lastNode.next;

        }
        /**
         *todo: 9/25/22 1:26 PM 九师兄 此时 currentNode = 第0个节点  lastNode == 第k个节点
         *  假设  1->2->3->4->5 和 k = 2
         *  1           2       3       4       5
         *  current            lastNode
         *
         **/
        while (lastNode != null){
            lastNode = lastNode.next;
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }


    /**
     *todo: 9/25/22 2:16 PM 九师兄
     *
     *     作者：sdwwld
     *     链接：https://leetcode.cn/problems/kth-node-from-end-of-list-lcci/solution/shuang-zhi-zhen-zhan-di-gui-3chong-jie-jue-fang-2/
     *
     **/
    public int kthToLastv2(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        //链表节点压栈
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        //在出栈串成新的链表
        ListNode firstNode = stack.pop();
        while (--k > 0) {
            ListNode temp = stack.pop();
            temp.next = firstNode;
            firstNode = temp;
        }
        return firstNode.val;
    }

    int size;

    /**
     *todo: 9/25/22 2:22 PM 九师兄
     *   作者：sdwwld
     *   链接：https://leetcode.cn/problems/kth-node-from-end-of-list-lcci/solution/shuang-zhi-zhen-zhan-di-gui-3chong-jie-jue-fang-2/
     *
     **/
    public int kthToLastV3(ListNode head, int k) {
        if (head == null)
            return 0;
        int value = kthToLastV3(head.next, k);
        if (++size == k)
            return head.val;
        return value;
    }



    protected static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
