package com.algorithm.hot.code_020;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisTest {

    private  ValidParenthesis validParenthesis = new ValidParenthesis();

    @Test
    public void isValid() {
        boolean valid = validParenthesis.isValid("{{()(){}[][()]}}");
        System.out.println(valid);
    }
}