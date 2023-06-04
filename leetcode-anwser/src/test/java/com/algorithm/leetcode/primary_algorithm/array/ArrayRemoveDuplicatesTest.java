package com.algorithm.leetcode.primary_algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayRemoveDuplicatesTest {

    private ArrayRemoveDuplicates arrayRemoveDuplicates = new ArrayRemoveDuplicates();

    @Test
    public void removeDuplicates() {
        int[] arr = new int[] {0,0,1,1,1,2,2,3,3,4};
        int i = arrayRemoveDuplicates.removeDuplicates(arr);
    }
    @Test
    public void removeDuplicates1() {
        int[] arr = new int[] {1,1,2};
        int i = arrayRemoveDuplicates.removeDuplicates(arr);
    }
}