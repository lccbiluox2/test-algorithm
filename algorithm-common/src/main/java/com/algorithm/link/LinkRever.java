package com.algorithm.link;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-02 19:41
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkRever {

    private static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void add(ArrayList<Integer> arrayList) {
        for (Integer integer : arrayList) {
            linkedList.add(integer);
        }
    }

    public static void print() {
        int size = linkedList.size() -1 ;
        for (int i = size; -1 < i; i--) {
            System.out.println(linkedList.get(i));
        }
    }


}
