package com.algorithm.offer_bible;

/***
 * todo: 2022/9/22 下午9:48 lcc 九师兄
 *   https://leetcode.cn/problems/string-rotation-lcci/
 */
public class Question09 {

    /***
     * todo: 2022/9/22 下午10:13 lcc 九师兄
     *
     * wat erbottle
     *     erbottle wat
     */
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] aChar = s1.toCharArray();
        char[] bChar = s2.toCharArray();
        int length = s2.length() -1 ;
        char[] cChar = new char[length];

        int index  = 0;
        // b 倒着循环
        while (0 < length){
            char c = bChar[length];
            cChar[index] = c;
            if(cChar[index] == aChar[index] && cChar[index] == aChar[s1.length()-1]){
                return true;
            }
            index++;
            length--;
        }
        return true;
    }


    public boolean isFlipedStringv2(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        String s = s2 + s2;
        return s.contains(s1);
    }

}
