package com.algorithm.link;

import org.junit.Test;

import java.util.ArrayList;

import static sun.misc.Version.print;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-02 19:47
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkReverTest {

    @Test
    public void testsData(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(6);

        LinkRever.add(arrayList);
        LinkRever.print();
    }
}