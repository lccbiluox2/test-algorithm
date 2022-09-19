package com.algorithm.offer_bible;

/***
 * todo: 2022/9/19 下午11:02 lcc 九师兄
 *       https://leetcode.cn/problems/compress-string-lcci/
 */
public class Question06 {

    /***
     * todo: 2022/9/19 下午11:01 lcc 九师兄
     *  自己研究的，这题一看就是需要双指针来做，本次一遍搞定 完美
     */
    public String compressString(String S) {
        char[] chars = S.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int start =0;
        int end=1;
        while (end <= chars.length){
            if( end < chars.length && chars[start] == chars[end]){
                end++;
            }else {
                int count = end - start;
                stringBuilder.append(chars[start]).append(count);
                start = end;
                end = end+1;
            }
        }
        if(stringBuilder.length()  >= chars.length){
            return S;
        }else {
            return stringBuilder.toString();
        }
    }

}
