package com.algorithm.leetcode.swordoffer.offer38;

import com.algorithm.swordoffer.offer38.StringArrangement;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-12 16:28
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StringArrangementTest {

    private StringArrangement stringArrangement = new StringArrangement();
    
    @Test
    public void permutation() {
        String[] sasds = stringArrangement.permutation("abc");
        System.out.println(Arrays.toString(sasds));
    }
}