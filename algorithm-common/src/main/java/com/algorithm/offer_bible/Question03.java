package com.algorithm.offer_bible;

public class Question03 {

    /**
     *todo: 9/18/22 11:40 AM 九师兄
     * 想用双指针方法 将结果写到后面 结果失败了
     **/
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        int end = S.length() - 1;
        for(int i = length; -1 < i; i--) {
            if(chars[i] == ' ') {
                chars[end] = '0';
                chars[end-1] = '2';
                chars[end-2] = '%';
                end= end -3;
                if(end < 0){
                    end = 0;
                    break;
                }
            } else {
                chars[end] = chars[i];
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i= end;i< S.length();i++){
            builder.append(chars[i]);
        }
        return builder.toString();
    }

    /**
     *todo: 9/18/22 11:58 AM 九师兄
     * 想用双指针方法 将结果写到后面  居然成功了  赞赞赞 牛逼 牛逼
     **/
    public String replaceSpacesv2(String S, int length) {
        int SpaceNums=0;
        char[] chars = S.toCharArray();
        for(int i=0;i<length;i++)
        {
            if(chars[i]==' ')
                SpaceNums++;//判断有几个空格
        }

        int NewLength=length+SpaceNums*2 ;//新长度=原长度+空格数*2
        int newlength=NewLength-1;

        for(int i=length-1;i>=0;i--)//不开辟新数组的情况下，从后往前遍历，避免覆盖
        {
            if(chars[i]==' ')
            {
                chars[newlength--]='0';
                chars[newlength--]='2';
                chars[newlength--]='%';
            }
            else
                chars[newlength--]=chars[i];
        }

        StringBuilder builder = new StringBuilder();
        for (int i= 0 ;i< NewLength;i++){
            builder.append(chars[i]);
        }
        return builder.toString();
    }


}
