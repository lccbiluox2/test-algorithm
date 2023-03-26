package com.algorithm.leetcode.swordoffer.offer17;

import com.algorithm.swordoffer.offer17.PrintNumbers1;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 12:26
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class PrintNumbers1Test {


    PrintNumbers1 printNumbers = new PrintNumbers1();

    @Test
    public void printNumbers() {
        String ints = printNumbers.printNumbers(8);
        System.out.println(ints);
    }


}