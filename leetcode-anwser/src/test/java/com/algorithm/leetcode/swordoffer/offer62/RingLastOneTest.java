package com.algorithm.leetcode.swordoffer.offer62;

import com.algorithm.swordoffer.offer62.RingLastOne;
import org.junit.Test;

public class RingLastOneTest {

    private RingLastOne ringLastOne = new RingLastOne();

    @Test
    public void testLastRemaining() {
        int i = ringLastOne.lastRemaining(5, 3);
        System.out.println(i);
    }
}