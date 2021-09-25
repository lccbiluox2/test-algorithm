package com.algorithm.datastructure.link;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-23 22:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class CycleSingleLinkListTest {

    @Test
    public void mainTest() {
        CycleSingleLinkList cycleSingleLinkList = new CycleSingleLinkList();
        cycleSingleLinkList.addNodes(5);

        cycleSingleLinkList.show();
    }

    @Test
    public void countTest() {
        CycleSingleLinkList cycleSingleLinkList = new CycleSingleLinkList();
        cycleSingleLinkList.addNodes(10);

        cycleSingleLinkList.show();

        cycleSingleLinkList.count(0, 2, 10);
    }

}