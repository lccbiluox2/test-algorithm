package com.algorithm.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumSequenceTest {

    private SumSequence sumSequence = new SumSequence();

    @Test
    public void findContinuousSequence() {
        ArrayList<ArrayList<Integer>> arrayLists = sumSequence.FindContinuousSequence(9);
        System.out.println(arrayLists);
    }
}