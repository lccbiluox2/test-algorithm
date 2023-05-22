package com.algorithm.swordoffer.offer46;


/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-13 13:43
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 46. 把数字翻译成字符串
 */
public class NumTranstoString {

    public int translateNum(int num) {

        // 将int 变量 Num 转成字符串
        String s = String.valueOf(num);

        // dp[i] 表示前 i 位 可以解码的总数
        // db[0] 表示前 0 为 可以解码的总数
        // db[1] 表示前 1 为 可以解码的总数
        int[] dp = new int[s.length()];


        // dp[0] 表示前 0位 可以解码的总数
        dp[0] = 1;

        // 通过 for 循环 填充 dp 数组
        for (int i = 1; i < s.length(); i++) {
            //在当前遍历的过程中，第i个字符为倒数第一个字符
            //那么第i- 1就是倒数第二个字符
            //1、如果发现第i- 1的字符为1
            //2、或者发现第i - 1的字符为2并且第i个字符的值小于等于5
            //这两个判断条件指的值当前遍历的字符的倒数两个字符为
            //10、11、12、13、14、15、16、17、18、19、20、21、22、23、24、25
            if (s.charAt(i-1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '5')) {
                //如果i == 1,说明此时只有两个数字，那么i - 2是不存在的
                //对于这种情况有两种翻译方法，比如num = 14
                // 1、两个数字单独拿出来翻译1翻译为b, 4翻译为e,结果就是be
                // 2、直接把14翻译为字母，结果就是0
                //所以dp[i]=2
                if (i == 1) {
                    //有两种翻译方法
                    dp[i] = 2;
                    //否则的话，说明遍历的字符串有三个数字了
                    //并且最后两个数字可以翻译为字母
                } else {
                    //那么此时dp[i]=dp[i-1]+dp[i-2];
                    dp[i] = dp[i - 1] + dp[i - 2];
                }

                //如果最后两个数字组合在一起都无法翻译为字母
                //比如1258, 最后两个数字58无法翻译为字母，8只能单独翻译，所以方法数和125 一样
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[s.length() - 1];
    }


    public int translateNum1(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        if(len < 2){
            return len;
        }

        char[] chars = s.toCharArray();
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 0; i < len; i++) {
            dp[i] = dp[i-1];
            int currnetNum = 10*(chars[i-1] - '0')+(chars[i] - '0');
            if(currnetNum > 9 && currnetNum < 26){
                if(i -2 < 0){
                    dp[i]++;
                }else {
                    dp[i] += dp[i-2];
                }
            }
        }
        return dp[len-1];
    }
}

