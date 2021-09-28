package com.algorithm.datastructure.stack;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-25 18:33
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo: https://blog.csdn.net/qq_21383435/article/details/120539224
 */
public class PolandNotationTest {

    /**
     * 运行结果如下：[3, 4, +, 5, *, 6, -]
     */
    @Test
    public void getListString() {
        PolandNotation polandNotation = new PolandNotation();
        String express = "3 4 + 5 * 6 -";
        List<String> listString = polandNotation.getListString(express);
        System.out.println(listString);

    }

    @Test
    public void getListString1() {
        PolandNotation polandNotation = new PolandNotation();
        String express = "3 4 + 5 * 6 -";
        List<String> listString = polandNotation.getListString(express);
        polandNotation.calculate(listString);
        System.out.println(listString);

    }

    @Test
    public void getListString2() {
        PolandNotation polandNotation = new PolandNotation();
        String express = "30 4 + 5 * 6 -";
        List<String> listString = polandNotation.getListString(express);
        polandNotation.calculate(listString);
        System.out.println(listString);

    }

    @Test
    public void toInfixExpressionListTest() {
        PolandNotation polandNotation = new PolandNotation();
        String express = "31+((2+3)*4)-5";
        List<String> listString = polandNotation.toInfixExpressionList(express);
        System.out.println(listString);


    }

    @Test
    public void parseSuffixExpressionListTest() {
        PolandNotation polandNotation = new PolandNotation();
        String express = "1+((2+3)*4)-5";
        List<String> listString = polandNotation.toInfixExpressionList(express);
        System.out.println("中缀表达式："+listString);
        List<String> listStrins = polandNotation.parseSuffixExpressionList(listString);
        System.out.println("后缀表达式："+listStrins);

    }
}