package com.algorithm.link;

import com.algorithm.entity.link.ListNode;
import com.algorithm.utils.LinkListUtils;

/***
 * todo: 九师兄  2023/6/4 17:11
 * 【算法】删除有序链表中的重复元素、不保留重复节点
 * https://blog.csdn.net/qq_21383435/article/details/131034047
 */
public class LinkRepeatNodeRemove {


    /***
     * todo: 九师兄  2023/6/4 14:17
     * 本次测试链表，是不保留重复的，直接把重复的去除
     */
    public ListNode deleteDuplicationV1_1(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        ListNode next = pHead.next;
        if (pHead.val == next.val) {
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplicationV1_1(next);
        } else {
            pHead.next = deleteDuplicationV1_1(pHead.next);
            return pHead;
        }
    }


    public ListNode deleteDuplicationV2_1(ListNode pHead) {
        ListNode dummy = new ListNode(0); // 定义一个虚拟头节点，这样就不用处理边界了
        ListNode p = dummy; // 定义一个虚拟头结点 指向虚拟节点
        dummy.next = pHead; // 让虚拟头结点 指向真正的头节点

        while (p.next != null) {
            // 只有p的下个节点不为空，那么我们就定义一个新的指针 q
            ListNode q = p.next; // q指向p的下一个节点
            while (q.next != null && q.val == q.next.val){
                // 只有 q的值与q的下一个节点的值相等，我们就让q往后移动
                q = q.next; // 循环结束后，q就指向 后续元素相同的最后一个位置
            }
            // 如果q 等于 p的下一个节点，那么说明q 没有往后移动，那么说明
            // q在上面判断，发现是没有相同数据的，那么只需要让p往后移动一个位置就好了
            if(q == p.next){
                p =  p.next;
            }else {
                // 否则就说明有重复节点，需要大幅度跳跃节点
                p.next = q.next; // 相当于删除节点
            }
        }
        return dummy.next;
    }


}
