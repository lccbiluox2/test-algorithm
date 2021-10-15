package com.algorithm.mathematics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-15 21:45
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BigSumTest {



    @Test
    public void main() {
        long a = 426709752318l;
        long b = 95481253129l;

        System.out.println(a + b);
    }

    /**
     * 522180905447
     */
    @Test
    public void bigNumberSum() {
        System.out.println(BigSum.bigSum("426709752318", "95481253129"));

    }

    /**
     * 522191005447
     */
    @Test
    public void bigNumberSumTest() {
        System.out.println(BigSum.bigNumberSum("426709752318", "95481253129"));

    }

}