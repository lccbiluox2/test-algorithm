package com.algorithm.title150;

import com.algorithm.utils.ArraysUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Code26_1Test {

    private Code26_1 code261 = new Code26_1();


    @Test
    public void removeDuplicates() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = code261.removeDuplicates(nums);
        System.out.println(i);
        ArraysUtils.printIntArray(nums);
    }

    @Test
    public void removeDuplicates1() {
        int[] nums = {1,1,1,2,2,3};
        int i = code261.removeDuplicates(nums);
        System.out.println(i);
        ArraysUtils.printIntArray(nums);
    }

    @Test
    public void removeDuplicates2() {
        int[] nums = {1,1,1,2,2,3};
        int i = code261.removeDuplicates(nums);
        System.out.println(i);
        ArraysUtils.printIntArray(nums);
    }

}