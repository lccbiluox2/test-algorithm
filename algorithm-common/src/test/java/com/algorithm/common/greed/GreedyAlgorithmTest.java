package com.algorithm.common.greed;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-14 11:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class GreedyAlgorithmTest {

    /**
     * 测试简单交集
     */
    @Test
    public void testSet() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("c");
        set2.add("d");
        set2.add("e");

        set3.add("c");
        set3.add("b");
        set3.add("e");

        set1.retainAll(set3);
        System.out.println("交集是 " + set3);  //交集是 [c]

        //交集
        set1.retainAll(set2);
        System.out.println("交集是 " + set2);  //交集是 [c]

        set1.retainAll(set3);
        System.out.println("交集是 " + set1);  //交集是 [c]
    }

    @Test
    public void greedyAlgorithm() {
        GreedyAlgorithm.greedyAlgorithm();
    }

    @Test
    public void greedyAlgorithm1Test() {
        GreedyAlgorithm.greedyAlgorithm1();
    }
}