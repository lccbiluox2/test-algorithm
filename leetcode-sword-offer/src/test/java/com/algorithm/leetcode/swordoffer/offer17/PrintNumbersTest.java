package com.algorithm.leetcode.swordoffer.offer17;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 12:11
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class PrintNumbersTest {

    PrintNumbers printNumbers = new PrintNumbers();

    @Test
    public void printNumbers() {
        int[] ints = printNumbers.printNumbers(0);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void printNumbers1() {
        int[] ints = printNumbers.printNumbers1(8);
        System.out.println(Arrays.toString(ints));
    }
}