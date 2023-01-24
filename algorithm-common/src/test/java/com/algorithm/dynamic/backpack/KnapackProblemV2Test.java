package com.algorithm.dynamic.backpack;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnapackProblemV2Test {

    @Test
    public void process1() {
        int[] w = {1, 4, 3};//物品的重量
        int[] val = {1500, 3000, 2000}; //物品的价值这里ya1[i]就是前面讲 的v[i]

        int i = KnapackProblemV2.process1(w, val, 0, 0, 0);
        System.out.println(i);
    }
}