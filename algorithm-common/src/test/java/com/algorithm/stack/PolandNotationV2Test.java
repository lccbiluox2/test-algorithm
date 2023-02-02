package com.algorithm.stack;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PolandNotationV2Test {

    /**
     *todo: 2023/2/2 22:29 九师兄
     * 测试点：测试 (3+4)*5-6 = 29
     * 这里我们输入后缀表达式然后进行计算
     * 测试结果为29 证明计算正确
     **/
    @Test
    public void calculate() {
        PolandNotationV2 polandNotationV2 = new PolandNotationV2();
        List<String> listString = polandNotationV2.getListString("3 4 + 5 * 6 -");
        int calculate = polandNotationV2.calculate(listString);
        System.out.println(calculate);
    }

    /**
     *todo: 2023/2/2 22:51 九师兄
     * 测试点：将字符串切分成中缀表达式
     * [1, +, (, (, 2, +, 3, ), *, 4, ), -, 5]
     **/
    @Test
    public void toInfixExpressionList() {
        PolandNotationV2 polandNotationV2 = new PolandNotationV2();
        List<String> listString = polandNotationV2.toInfixExpressionList("1+((2+3)*4)-5");
        System.out.println(listString);
    }

    /**
     *todo: 2023/2/2 22:54 九师兄
     * 测试点：测试将中缀表达式转成后缀表达式
     *
     * 测试结果如下：
     * 中缀表达式:[1, +, (, (, 2, +, 3, ), *, 4, ), -, 5]
     * 后缀表达式:[1, 2, 3, +, 4, *, +, 5, -]
     **/
    @Test
    public void parseSuffixExpressionList() {
        PolandNotationV2 polandNotationV2 = new PolandNotationV2();
        List<String> listString = polandNotationV2.toInfixExpressionList("1+((2+3)*4)-5");
        System.out.println("中缀表达式:"+listString);
        List<String> nextString = polandNotationV2.parseSuffixExpressionList(listString);
        System.out.println("后缀表达式:"+nextString);
    }

    /**
     *todo: 2023/2/2 22:58 九师兄
     * 测试点：整体测试
     *
     * 中缀表达式:[1, +, (, (, 2, +, 3, ), *, 4, ), -, 5]
     * 后缀表达式:[1, 2, 3, +, 4, *, +, 5, -]
     * 计算的结果16
     * 最终结果:16
     **/
    @Test
    public void calculate2() {
        PolandNotationV2 polandNotationV2 = new PolandNotationV2();
        List<String> listString = polandNotationV2.toInfixExpressionList("1+((2+3)*4)-5");
        System.out.println("中缀表达式:"+listString);
        List<String> nextString = polandNotationV2.parseSuffixExpressionList(listString);
        System.out.println("后缀表达式:"+nextString);
        int calculate = polandNotationV2.calculate(nextString);
        System.out.println("最终结果:"+calculate);
    }
}