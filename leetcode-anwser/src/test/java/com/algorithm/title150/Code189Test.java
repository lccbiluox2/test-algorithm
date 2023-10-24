package com.algorithm.title150;

import com.algorithm.utils.ArraysUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Code189Test {

    private Code189 code189 = new Code189();

    @Test
    public void rotate() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        code189.rotate(nums, k);
        ArraysUtils.printIntArray(nums);;
    }

    @Test
    public void rotate1() {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        code189.rotate(nums, k);
        ArraysUtils.printIntArray(nums);;
    }


    @Test
    public void rotate2() {
        int[] nums = {1,2};
        int k = 1;
        code189.rotate(nums, k);
        ArraysUtils.printIntArray(nums);;
    }

    @Test
    public void rotate3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        code189.rotate1(nums, k);
        ArraysUtils.printIntArray(nums);;
    }

    // [5, 6, 7, 1, 2, 3, 4]
    @Test
    public void rotate4() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        code189.rotate2(nums, k);
        ArraysUtils.printIntArray(nums);;
    }

    // [5, 6, 7, 1, 2, 3, 4]
    @Test
    public void rotate5() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        code189.rotate3(nums, k);
        ArraysUtils.printIntArray(nums);;
    }

    // [5, 6, 7, 1, 2, 3, 4]
    @Test
    public void rotate6() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        code189.rotate4(nums, k);
        ArraysUtils.printIntArray(nums);;
    }
}