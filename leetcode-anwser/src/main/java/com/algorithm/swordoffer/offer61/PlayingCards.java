package com.algorithm.swordoffer.offer61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-09 17:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 61. 扑克牌中的顺子
 */
public class PlayingCards {


    /**
     * 顺子
     *
     * @param nums
     * @return
     */
    public boolean isStraight(int[] nums) {

        // 计算大小王个数
        int conmon = 0;
        List<Integer> noZero = new ArrayList<>();
        for (int num : nums) {
            if (num == 0) {
                conmon++;
            } else {
                noZero.add(num);
            }
        }
        // 对列表进行排序
        Collections.sort(noZero);
        int[] noZeroArray = noZero.stream().mapToInt(Integer::valueOf).toArray();


        for (int i = 0; i < noZeroArray.length - 1; i++) {
            int poorNum = noZeroArray[i + 1] - noZeroArray[i];
            // 如果出现这样，说明有重复的数字，直接返回false
            if (poorNum == 0) {
                return false;
            }
            // 证明前后相差一个数 这是正常的
            if (poorNum == 1) {
                continue;
            } else {
                // 证明前后相差多个数 2 或者 3..

                // 如果没有大小王，那么直接返回false
                if (conmon <= 0) {
                    return false;
                }

                // 比如 5-2 = 3 实际上是差了2个数
                poorNum = poorNum - 1;
                // 差值大于大小王的个数，大小王怎么补充都不能连城串子
                if (poorNum > conmon) {
                    return false;
                } else {
                    conmon = conmon - poorNum;
                }
            }
        }
        return true;
    }

    /**
     * 0,0,1,2,5
     * 4 - 1 = 2
     * <p>
     * 1,2,3,4,5
     * 4
     * <p>
     * 4,3,2,1,5
     *
     * @param nums
     * @return
     */
    public boolean isStraight2(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int poor = nums[i + 1] - nums[i];
            if(poor == 0 && nums[i] != 0){
                return false;
            }
            sum = sum + poor;
        }
        if (sum == 4 || sum == 5 || sum == -5) {
            return true;
        }
        return false;
    }

    public boolean isStraight3(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for(int num : nums) {
            if(num == 0) continue; // 跳过大小王
            max = Math.max(max, num); // 最大牌
            min = Math.min(min, num); // 最小牌
            if(repeat.contains(num)) return false; // 若有重复，提前返回 false
            repeat.add(num); // 添加此牌至 Set
        }
        return max - min < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
    }

}
