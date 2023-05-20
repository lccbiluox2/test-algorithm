package com.algorithm.type.string;

public class ReplaceSpace {

    public String replaceSpace(String str) {
        if (str == null || str.length() < 1) {
            return str;
        }
        StringBuilder builder = new StringBuilder(str.length());
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                builder.append("%20");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    /***
     * todo: 九师兄  2023/5/20 15:44
     * 测试点：替换空格的另外一种方法
     * 一直有趣的算法思想，但是比较麻烦，而且性能不好
     * 但是比较节省空间
     */
    public String replaceSpace(StringBuffer str) {
        // 先找出所有的空格 然后每个空格代表3个字符 因此需要再后面扩容3个字符
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++)
            if (str.charAt(i) == ' ')
                str.append("  ");

        // 然后倒序移动字符
        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1) {
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }

}
