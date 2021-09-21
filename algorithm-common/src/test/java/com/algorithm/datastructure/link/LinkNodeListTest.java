package com.algorithm.datastructure.link;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 15:12
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkNodeListTest {

    @Test
    public void addNode() {
        LinkNodeList linkNodeList = new LinkNodeList();
        linkNodeList.printDetail();
    }

    @Test
    public void addNode1() {
        LinkNodeList linkNodeList = new LinkNodeList();
        linkNodeList.addNode("王五",1);
        linkNodeList.addNode("郑凯",3);
        linkNodeList.addNode("李思",6);
        linkNodeList.printDetail();

        int aa = linkNodeList.get("李思");
        System.out.println(aa);
    }
}