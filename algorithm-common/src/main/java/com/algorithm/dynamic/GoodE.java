package com.algorithm.dynamic;

/***
 * todo: 九师兄  2023/10/14 13:18
 *
 * 【算法】r、e、d三个字符串，求好e的尽可能多、最小代价
 *  https://blog.csdn.net/qq_21383435/article/details/133610470
 */
public class GoodE {

    public static class Info {
        public int mostGoodE;
        public int minCost;

        public Info(int mostGoodE, int minCost) {
            this.mostGoodE = mostGoodE;
            this.minCost = minCost;
        }
    }

    /***
     * i 位置 r d e 随意选择
     * 返回 i-1 yes or no + i.....最多的好e，数量是多少
     * 最多的好e,最小的代价
     */
    public static Info zuo(char[] s, int i, char pre_pre, char pre) {
        // 如果你来到最后一个字符，那么你是成全不了任何字符的，因为你选择什么都不可能成全好e
        if (i == s.length) {
            return new Info(0, 0);
        }


        // 可能性1 i 位置字符 要变成  r 有可能成全i-1位置
        int cur1Value = (pre_pre == 'd' && pre == 'e') ? 1 : 0;
        int cur1Cost = s[i] == 'r' ? 0 : 1; // 当前变一次 获取的好处
        Info info1 = zuo(s, i + 1, pre, 'r');
        int p1Value = cur1Value + info1.mostGoodE;
        int p1Cost = cur1Cost + info1.minCost;

        // 可能性2 i 位置字符 要变成  e  那么不能可能成全i-1位置，比如 r e e
        int cur2Value =  0;
        int cur2Cost = s[i] == 'e' ? 0 : 1; // 当前变一次 获取的好处,如果原本的位置是e，那么不需要变化
        Info info2 = zuo(s, i + 1, pre, 'e');
        int p2Value = cur2Value + info2.mostGoodE;
        int p2Cost = cur2Cost + info2.minCost;

        // 可能性3 i 位置字符 要变成  d  那么可能成全i-1位置，比如 r e d
        int cur3Value = (pre_pre == 'r' && pre == 'e') ? 1 : 0;
        int cur3Cost = s[i] == 'd' ? 0 : 1; // 当前变一次 获取的好处
        Info info3 = zuo(s, i + 1, pre, 'd');
        int p3Value = cur3Value + info3.mostGoodE;
        int p3Cost = cur3Cost + info3.minCost;

        // 然后三种可能性全部出来了
        int mostE = 0;
        int minCost = Integer.MAX_VALUE;
        // 如果当前的答案 不如p1的好
        if(mostE < p1Value){
            mostE = p1Value;
            minCost = p1Cost;
        }else if (mostE == p1Value){
            minCost = Math.min(minCost,p1Cost); // 这一步很关键 收入都是一样的，那么代价当前想看看能不能降低一下
        }

        // 如果当前的答案 不如p2的好
        if(mostE < p2Value){
            mostE = p2Value;
            minCost = p2Cost;
        }else if (mostE == p2Value){
            minCost = Math.min(minCost,p2Cost); // 这一步很关键 收入都是一样的，那么代价当前想看看能不能降低一下
        }

        // 如果当前的答案 不如p3的好
        if(mostE < p3Value){
            mostE = p3Value;
            minCost = p3Cost;
        }else if (mostE == p3Value){
            minCost = Math.min(minCost,p3Cost); // 这一步很关键 收入都是一样的，那么代价当前想看看能不能降低一下
        }


        return new Info(mostE, minCost);
    }
}




















