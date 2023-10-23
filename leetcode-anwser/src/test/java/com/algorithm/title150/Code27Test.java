package com.algorithm.title150;

import com.algorithm.utils.ArraysUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Code27Test {

    private Code27 code27 = new Code27();

    @Test
    public void removeElement() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int i = code27.removeElement(nums, val);
        System.out.println(i);
        ArraysUtils.printIntArray(nums);
    }

    @Test
    public void removeElement2() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int i = code27.removeElement(nums, val);
        System.out.println(i);
        ArraysUtils.printIntArray(nums);
    }

    @Test
    public void removeElement1() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int i = code27.removeElement1(nums, val);
        System.out.println(i);
        ArraysUtils.printIntArray(nums);
    }
}