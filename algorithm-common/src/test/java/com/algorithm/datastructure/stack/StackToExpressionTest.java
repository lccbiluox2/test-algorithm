package com.algorithm.datastructure.stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-25 12:47
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo：【算法】栈实现综合表达式计算
 *     https://blog.csdn.net/qq_21383435/article/details/120469520
 */
public class StackToExpressionTest {

    @Test
    public void parseAndCalExpression() {
        StackToExpression stackToExpression = new StackToExpression();
        stackToExpression.parseAndCalExpression("1+4*2+5");
    }
}