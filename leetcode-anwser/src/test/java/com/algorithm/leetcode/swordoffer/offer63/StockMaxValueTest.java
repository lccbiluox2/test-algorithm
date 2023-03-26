package com.algorithm.leetcode.swordoffer.offer63;

import com.algorithm.swordoffer.offer63.StockMaxValue;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-12 11:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StockMaxValueTest {

    private StockMaxValue stockMaxValue = new StockMaxValue();

    @Test
    public void maxProfit() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int i = stockMaxValue.maxProfit(prices);
        System.out.println(i);

        int[] prices1 = new int[]{7,6,4,3,1};
        int i1 = stockMaxValue.maxProfit(prices1);
        System.out.println(i1);

        int[] prices2 = new int[]{1};
        int i2 = stockMaxValue.maxProfit(prices2);
        System.out.println(i2);
    }

    @Test
    public void maxProfit2_1() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int i = stockMaxValue.maxProfit2(prices);
        System.out.println(i);
    }

    @Test
    public void maxProfit3_1() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int i = stockMaxValue.maxProfit3(prices);
        System.out.println(i);
    }

    @Test
    public void maxProfit4_1() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int i = stockMaxValue.maxProfit4(prices);
        System.out.println(i);
    }
}