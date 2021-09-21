package com.algorithm.datastructure.link;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 18:08
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SingleLinkedListTest {

    /**
     * 测试点：测试视频的构建方式
     * todo: 参考 https://www.bilibili.com/video/BV1E4411H73v?p=17
     */
    @Test
    public void add() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        HeroNode heroNode1 = new HeroNode(1, "张三", "占山2");
        HeroNode heroNode2 = new HeroNode(2, "张三1", "占山3");
        HeroNode heroNode3 = new HeroNode(3, "张三2", "占山5");

        singleLinkedList.add(heroNode1);
        singleLinkedList.add(heroNode2);
        singleLinkedList.add(heroNode3);

        singleLinkedList.list();
    }
}