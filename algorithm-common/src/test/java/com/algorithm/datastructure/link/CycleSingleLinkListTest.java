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

    /***
     * todo: 九师兄  2023/7/2 11:58
     *
     * 【算法】约瑟夫环问题
     * https://blog.csdn.net/qq_21383435/article/details/131498360
     */
    @Test
    public void countTest() {
        CycleSingleLinkList cycleSingleLinkList = new CycleSingleLinkList();
        cycleSingleLinkList.addNodes(4);

        cycleSingleLinkList.show();

        cycleSingleLinkList.count(2, 2, 4);
    }


    @Test
    public void LastRemaining_Solution() {
        CycleSingleLinkList cycleSingleLinkList = new CycleSingleLinkList();

        int i = cycleSingleLinkList.LastRemaining_Solution(4, 2);
        System.out.println(i);
    }

    @Test
    public void LastRemaining_Solution1() {
        CycleSingleLinkList cycleSingleLinkList = new CycleSingleLinkList();

        int i = cycleSingleLinkList.LastRemaining_Solution(5, 2);
        System.out.println(i);
    }

}