package com.algorithm.hot.code_020;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisTest {

    private  ValidParenthesis validParenthesis = new ValidParenthesis();

    /***
     * todo: 九师兄  2023/3/26 17:51
     *       第一次报错空指针异常
     */
    @Test
    public void isValid() {
        boolean valid = validParenthesis.isValid("{{()(){}[][()]}}");
        System.out.println(valid);
    }

    /***
     * todo: 九师兄  2023/3/26 17:53
     *   第二次测试这个又报错了
     */
    @Test
    public void isValidV1() {
        boolean valid = validParenthesis.isValid("()[]{}");
        System.out.println(valid);
    }

    @Test
    public void isValidV3() {
        boolean valid = validParenthesis.isValid("(){}}{");
        System.out.println(valid);
    }

    @Test
    public void isValidV4() {
        boolean valid = validParenthesis.isValidv1("(){}}{");
        System.out.println(valid);
    }
}