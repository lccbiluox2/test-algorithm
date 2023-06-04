package com.algorithm.regular;

/***
 * todo: 九师兄  2023/6/4 18:38
 *
 * 【算法】正则匹配、？号和 *号、从左往右尝试模型
 * https://blog.csdn.net/qq_21383435/article/details/129225468
 */
public class RegularSimulation {

    public static boolean isValid(char[] s,char[] e){
        // 要匹配的字符串不能包含 . 和 *
        for (int i = 0; i < s.length; i++) {
            if(s[i] == '*' || s[i] == '.'){
                return false;
            }
        }
        for (int i = 0; i < e.length; i++) {
            // * 号之前 必须有数据，然后 两个 * 不能挨着
            if(e[i] == '*' && (i == 0 || e[i-1] == '*')){
                return false;
            }
        }
        return true;
    }

    public static boolean isMatch(String str,String exp){
        if(str == null || exp == null){
            return false;
        }
        char[] s = str.toCharArray();
        char[] e = exp.toCharArray();
        return isValid(s,e) ? process(s,e,0,0):false;
    }

    // 必须保证 ei 压住的位置 不是 *
    private static boolean process(char[] s, char[] e, int si, int ei) {
        if(ei == e.length){ // exp 已经耗尽了
            return si == s.length;
        }
        // 可能性1 ei +1 位置不是 * 【1. 你没有ei+1位置 2. ei+1位置不是*】
        // str[si] 必须和 exp[ei] 配出来，并且后续能走通
        if(ei +1 == e.length || e[ei+1] != '*'){
            // si != s.length si没有字符了
            // (e[ei] == s[si] || e[ei] == '.') ei位置等于 s[si]  或者 e[ei] 是 .
            return si != s.length && (e[ei] == s[si] || e[ei] == '.')
                    && process(s,e,si+1,ei+1);
        }
        // 可能性2 ei +1 位置是 *
        while (si != s.length && (e[ei] == s[si] || e[ei] == '.')){
            if(process(s,e,si,ei+2)){
                return true;
            }
            si++;
        }
        return process(s,e,si,ei+2);
    }

}
