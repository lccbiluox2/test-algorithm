package com.algorithm.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayTargetIndexTest {

    private ArrayTargetIndex arrayTargetIndex = new ArrayTargetIndex();

    @Test
    public void searchRange() {
        int[] arr = new int[]{5,7,7,8,8,10};
        int[] ints = arrayTargetIndex.searchRange(arr, 6);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void searchRange1() {
        int[] arr = new int[]{2,2};
        int[] ints = arrayTargetIndex.searchRange(arr, 3);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void searchRange2() {
        int[] arr = new int[]{2,2};
        int[] ints = arrayTargetIndex.searchRange(arr, 2);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void searchRange3() {
        int[] arr = new int[]{1};
        int[] ints = arrayTargetIndex.searchRange(arr, 1);
        System.out.println(Arrays.toString(ints));
    }
}