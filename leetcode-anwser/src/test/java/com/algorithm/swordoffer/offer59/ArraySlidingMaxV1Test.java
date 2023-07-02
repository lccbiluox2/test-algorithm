package com.algorithm.swordoffer.offer59;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraySlidingMaxV1Test {

    private ArraySlidingMaxV1 arraySlidingMaxV1 = new ArraySlidingMaxV1();

    @Test
    public void maxSlidingWindow4() {
        int[] numbers = new int[]{1,3,-1,-3,5,3,6,7};
        ArrayList<Integer> ints = arraySlidingMaxV1.maxSlidingWindow4(numbers, 3);
        System.out.println(ints);
    }
}