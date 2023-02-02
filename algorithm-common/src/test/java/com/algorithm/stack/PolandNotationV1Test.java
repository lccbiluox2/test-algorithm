package com.algorithm.stack;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PolandNotationV1Test {

    /**
     *todo: 2023/2/2 22:29 九师兄
     * 测试点：测试 (3+4)*5-6 = 29
     * 这里我们输入后缀表达式然后进行计算
     * 测试结果为29 证明计算正确
     **/
    @Test
    public void calculate() {
        PolandNotationV1 polandNotationV1 = new PolandNotationV1();
        List<String> listString = polandNotationV1.getListString("3 4 + 5 * 6 -");
        int calculate = polandNotationV1.calculate(listString);
        System.out.println(calculate);
    }
}