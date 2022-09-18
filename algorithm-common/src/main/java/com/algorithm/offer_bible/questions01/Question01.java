package com.algorithm.offer_bible.questions01;

import java.util.HashSet;
import java.util.Set;

public class Question01 {

    public boolean isUnique(String astr) {
        if(astr == null){
            return true;
        }
        char[] chars = astr.toCharArray();
        Set<String> set = new HashSet<>();
        for (char item:chars){
            boolean add = set.add(String.valueOf(item));
            if(!add){
                return false;
            }
        }
        return true;
    }

    public boolean isUniquev1(String astr) {
        return astr.chars().distinct().count() == astr.length();
    }

    /**
     *todo: 9/17/22 3:59 PM 九师兄
     * 当最后一次索引的位置不是现在的位置就可以判断重复
     **/
    public boolean isUniquev2(String astr) {
        for (int i=0;i<astr.length();i++){
            if (astr.lastIndexOf(astr.charAt(i))!=i){
                return false;
            }
        }
        return true;
    }

    public boolean isUniquev3(String astr) {
        //位运算
        int mark = 0;
        for(int i = 0;i < astr.length();i++){
            int moveBit = astr.charAt(i) - 'a';
            if((mark & (1 << moveBit)) != 0){
                return false;
            }else{
                mark = mark | (1 << moveBit);
            }
        }
        return true;
    }

}
