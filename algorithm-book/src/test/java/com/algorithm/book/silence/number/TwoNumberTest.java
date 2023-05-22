package com.algorithm.book.silence.number;

import cn.hutool.core.util.ArrayUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoNumberTest {

    private TwoNumber twoNumber = new TwoNumber();

    @Test
    public void twoSum() {
        int[] arr = new int[]{1,5,3,7,9};
        int[] ints = twoNumber.twoSum(arr, 12);
        System.out.println(ArrayUtils.toString(ints));
    }

    @Test
    public void twoSumV2() {
        int[] arr = new int[]{1,5,3,7,9};
        int[] ints = twoNumber.twoSumV2(arr, 12);
        System.out.println(ArrayUtils.toString(ints));
    }
}