package com.algorithm.swordoffer.offer67;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-19 16:50
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 67. 把字符串转换成整数
 */
public class StringToNum {

    public int strToInt(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        String trim = str.trim();
        // 只有空格
        if (trim.length() < 1) {
            return 0;
        }
        StringBuilder builder = new StringBuilder();
        int start = 0;
        // 是否是正数 默认正数
        boolean positive = true;
        if (trim.charAt(0) == '-') {
            builder.append(trim.charAt(0));
            start = 1;
            positive = false;
        } else if (trim.charAt(0) == '+') {
            builder.append(trim.charAt(0));
            start = 1;
        }

        boolean notZreo = true;
        for (int i = start; i < trim.length(); i++) {
            char ch = trim.charAt(i);
            // 如果开头都是0 那么不管他
            if (ch == 48 && notZreo == true) {
                continue;
            }
            if (ch < 48 || 57 < ch) {
                return 0;
            }
            notZreo = false;
            builder.append(ch);
        }
        String s = builder.toString();
        if (s.length() < 1) {
            return 0;
        }
        // 如果只包含正负数
        if (s.equals("-") || s.equals("+")) {
            return 0;
        }


        Integer result = null;
        try {
            result = Integer.parseInt(builder.toString());
        } catch (Exception e) {
            if (positive) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }

        return result;
    }


    /**
     * 别人的方案
     *
     * @param str
     * @return
     */
    public int strToInt1(String str) {
        //去除str首尾的多余空格
        char[] array = str.trim().toCharArray();
        //如果array的长度为0 返回0
        if (array.length==0) return 0;
        //sign表示标志位  1为正  -1 为负  i代表array从何处开始遍历
        int res = 0, sign = 1, i = 1;
        //设置限制值，因为在遍历中先判断res是否越界，再向res赋值，因而对limit的要求/10
        int limit = Integer.MAX_VALUE / 10;
        //如果array[0]=- 表明该数是负数  sign =-1
        if (array[0]=='-') sign = -1;
        else if (array[0]!='+') i = 0;
        for (int j = i; j < array.length; j++) {
            //判断当前字符是否为数字  不是直接退出
            if (array[j]>'9'||array[j]<'0') break;
            //判断遍历到j-1的位置后  res是否大于limit 如果当前res已经大于limit  加上array[j]一定越界
            //当res等于limit时，我们需要判断array[j]是否大于Integer.MAX_VALUE的末位数7
            if (res>limit||res==limit&&array[j]>'7') return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (array[j] - '0');
        }
        return res;
    }


    public int strToInt2(String str) {
        //去前后空格
        char[] chars = str.trim().toCharArray();
        if (chars.length == 0) return 0;
        //记录第一个符合是否为负数
        int sign = 1;
        //开始遍历的位置
        int i = 1;
        //如果首个非空格字符为负号，那么从位置1开始遍历字符串，并且结果需要变成负数
        if (chars[0] == '-') {
            sign = -1;
        } else if (chars[0] != '+') { //如果首个非空格字符不是负号也不是加号，那么从第一个元素开始遍历
            i = 0;
        }
        int number = Integer.MAX_VALUE / 10;
        //结果
        int res = 0;
        for (int j = i; j < chars.length; j++) {
            //遇到非数字直接退出
            if (chars[j] > '9' || chars[j] < '0') break;
                /*
                    这里这个条件的意思为，因为题目要求不能超过int范围，所以需要判断结果是否越界
                    因为res每次都会 * 10 ，所以外面定义了一个int最大值除以10的数字
                    此时只需要保证本次循环的res * 10 + chars[j] 不超过 int 即可保证不越界
                    res > number 意思是，此时res已经大于number了，他 * 10 一定越界
                    res == number && chars[j] > '7' 的意思是，当res == number时，即：214748364
                    此时res * 10 变成 2147483640 此时没越界，但是还需要 + chars[j]，
                    而int最大值为 2147483647，所以当chars[j] > 7 时会越界
                 */
            if (res > number || (res == number && chars[j] > '7')) {
                //根据字符串首负号判断返回最大值还是最小值
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            //字符获取数字需要 - '0' 的位移
            res = res * 10 + (chars[j] - '0');
        }
        //返回结果，需要判断正负
        return res * sign;
    }

    /***
     * todo: 九师兄  2023/7/2 14:27
     * 新的方法
     */
    public int strToInt3(String str) {
        int sign=1;
        long ret = 0;
        char[] arr = str.toCharArray();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==' '){
                continue;
            }
            else if(arr[i]=='-'){
                sign=-1;
            }
            else if(arr[i]=='+'){
            }
            else if(arr[i]>='0'&&arr[i]<='9'){
                ret = ret*10+(arr[i]-'0');
            }
            else{
                return 0;
            }
        }
        return (int) (sign * ret);
    }
}
