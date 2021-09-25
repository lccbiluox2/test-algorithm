package com.algorithm.datastructure.link;

import com.algorithm.datastructure.link.entity.Boy;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-23 21:51
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 约瑟夫环形链表问题
 * todo: 参考视频 https://www.bilibili.com/video/BV1E4411H73v?p=29
 */
public class CycleSingleLinkList {

    private Boy first = new Boy();

    public void addNodes(int num) {
        if (num < 1) {
            System.out.println("num值不正确");
            return;
        }
        Boy current = null;
        for (int i = 1; i < num; i++) {
            // 创建节点
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                first.next = first;
                current = first;
            } else {
                current.next = boy;
                boy.next = first;
                current = boy;
            }
        }
    }

    private void addLast(int num) {
        if (num < 1) {
            System.out.println("num值不正确");
            return;
        }
    }

    public void show() {
        if (first == null) {
            System.out.println("没有任何节点");
            return;
        }
        // 因为first不能动，所以要一个临时变量
        Boy current = first;
        while (true) {
            System.out.println("当前节点的值：" + current.no);
            if (current.next == first) {
                System.out.println("遍历完毕");
                break;
            }
            current = current.next;
        }
    }

    public int count(int startNo, int countNum, int nums) {
        if (first == null || countNum < 1 || nums < countNum) {
            System.out.println("数据异常");
            return -1;
        }

        // 将helper 指向最后的节点
        Boy helper = first;
        while (true) {
            if (helper.next == first) {
                System.out.println("遍历完毕");
                break;
            }
            helper = helper.next;
        }

        for (int i = 0; i < startNo - 1; i++) {
            first = first.next;
            helper = helper.next;
        }

        while (true) {
            if (helper == first) {
                System.out.println("此时圈子中只有一个值");
                break;
            }
            // 否则开始移动
            for (int i = 0; i < countNum - 1; i++) {
                first = first.next;
                helper = helper.next;
            }
            // first 此时代表要出圈的小孩
            System.out.println("小孩" + first.no + "出圈");
            first = first.next;
            helper.next = first;
        }
        System.out.println("最后在圈子里的小孩" + helper.no);
        return helper.no;
    }
}
