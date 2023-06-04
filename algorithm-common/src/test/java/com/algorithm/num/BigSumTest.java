package com.algorithm.num;

import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-15 21:45
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BigSumTest {


    /**
     * -5631521226866015569
     */
    @Test
    public void main() {
        long a = 4267097523399999918l;
        long b = 8548125323443536129l;

        System.out.println(a + b);
    }

    /**
     * 522180905447
     *
     * -5631521226866015569
     * 12715222846843535047
     */
    @Test
    public void bigNumberSum() {
        System.out.println(BigSum.bigSum("4267097523399999918", "8548125323443536129"));

    }

    /**
     * 522191005447
     */
    @Test
    public void bigNumberSumTest() {
        System.out.println(BigSum.bigNumberSum("426709752318", "95481253129"));

    }

}