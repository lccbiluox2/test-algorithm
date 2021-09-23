package com.algorithm.datastructure.link;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-22 22:07
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class DoubleLinkListTest {

    @Test
    public void addLast() {
        DoubleLinkList doubleLinkList = new DoubleLinkList();

        HeroNode node1 = new HeroNode(1, "张三", "战三");
        HeroNode node2 = new HeroNode(2, "王五", "战三");

        doubleLinkList.addLast(node1);
        doubleLinkList.addLast(node2);

        doubleLinkList.list();
    }

    @Test
    public void addFirst() {
        DoubleLinkList doubleLinkList = new DoubleLinkList();

        HeroNode node1 = new HeroNode(1, "张三", "战三");
        HeroNode node2 = new HeroNode(2, "王五", "战三");

        doubleLinkList.addFirst(node1);
        doubleLinkList.addFirst(node2);

        doubleLinkList.list();
    }

    @Test
    public void update() {
        DoubleLinkList doubleLinkList = new DoubleLinkList();

        HeroNode node1 = new HeroNode(1, "张三", "战三");
        HeroNode node2 = new HeroNode(2, "王五", "战三");
        HeroNode node3 = new HeroNode(3, "李思", "李思");

        doubleLinkList.addFirst(node1);
        doubleLinkList.addFirst(node2);
        doubleLinkList.addFirst(node3);

        doubleLinkList.list();

        HeroNode node4 = new HeroNode(2, "王五1", "战三1");
        doubleLinkList.update(node4);

        doubleLinkList.list();
    }

    @Test
    public void deleteFirst() {
        DoubleLinkList doubleLinkList = new DoubleLinkList();

        HeroNode node1 = new HeroNode(1, "张三", "战三");
        HeroNode node2 = new HeroNode(2, "王五", "战三");
        HeroNode node3 = new HeroNode(3, "李思", "李思");

        doubleLinkList.addLast(node1);
        doubleLinkList.addLast(node2);
        doubleLinkList.addLast(node3);

        doubleLinkList.list();

        doubleLinkList.delete(1);

        doubleLinkList.list();
    }

    @Test
    public void delete() {
        DoubleLinkList doubleLinkList = new DoubleLinkList();

        HeroNode node1 = new HeroNode(1, "张三", "战三");
        HeroNode node2 = new HeroNode(2, "王五", "战三");
        HeroNode node3 = new HeroNode(3, "李思", "李思");

        doubleLinkList.addLast(node1);
        doubleLinkList.addLast(node2);
        doubleLinkList.addLast(node3);

        doubleLinkList.list();

        doubleLinkList.delete(2);

        doubleLinkList.list();
    }


    @Test
    public void deleteLast() {
        DoubleLinkList doubleLinkList = new DoubleLinkList();

        HeroNode node1 = new HeroNode(1, "张三", "战三");
        HeroNode node2 = new HeroNode(2, "王五", "战三");
        HeroNode node3 = new HeroNode(3, "李思", "李思");

        doubleLinkList.addLast(node1);
        doubleLinkList.addLast(node2);
        doubleLinkList.addLast(node3);

        doubleLinkList.list();

        doubleLinkList.delete(3);

        doubleLinkList.list();
    }



    @Test
    public void reverseList() {
        DoubleLinkList doubleLinkList = new DoubleLinkList();

        HeroNode node1 = new HeroNode(1, "张三", "战三");
        HeroNode node2 = new HeroNode(2, "王五", "战三");
        HeroNode node3 = new HeroNode(3, "李思", "李思");

        doubleLinkList.addFirst(node1);
        doubleLinkList.addFirst(node2);
        doubleLinkList.addFirst(node3);

        doubleLinkList.list();

        doubleLinkList.reverseList();
        System.out.println("反转之后");

        doubleLinkList.list();
    }
}