package com.algorithm.swordoffer.offer42;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-06 22:15
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 42. 连续子数组的最大和
 */
public class ContinuousAnArrayOfSum {

    /**
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public int maxSubArray1(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int tempSum = 0;
                for (int k = i; k <= j; k++) {
                    tempSum = tempSum + nums[k];
                }
                max = Math.max(max, tempSum);
            }
        }
        return max;
    }


   static Map<String, Integer> map = new HashMap<String, Integer>();

    /**
     * @param a
     * @param beginIndex
     * @param endIndex   折半法寻找   n*logN + N
     */
    public static int findMaxSubArray(int[] a, int beginIndex, int endIndex) {
        int leftIndex = 0, rightIndex = 0;


        if (beginIndex == endIndex) {//如果只剩下一个元素
            if (a[beginIndex] > 0) {
                return a[beginIndex];
            }
            return 0;
        }

        int leftMaxSum, rightMaxSum, totalMaxSum;
        int midIndex = (beginIndex + endIndex) / 2;
        /*****求分开的大小***********/
        leftMaxSum = findMaxSubArray(a, beginIndex, midIndex);//分的思想，需找左边最大的值
        rightMaxSum = findMaxSubArray(a, midIndex + 1, endIndex);
        /******************/

        int theLeftBorderMaxSum = 0;
        int theRightBorderMaxSum = 0;
        /********求整体的大小***************/
        int tempSum = 0;
        for (int i = midIndex; i >= beginIndex; i--) {//从左边靠近
            tempSum += a[i];
            if (tempSum > theLeftBorderMaxSum) {
                theLeftBorderMaxSum = tempSum;
                leftIndex = i;//可能适合的左索引值
            }
        }

        tempSum = 0;//置空
        for (int i = midIndex + 1; i <= endIndex; i++) {//从右边靠近
            tempSum += a[i];
            if (tempSum > theRightBorderMaxSum) {
                theRightBorderMaxSum = tempSum;
                rightIndex = i;//可能适合的右索引值
            }
        }

        //分之后就要治了
        totalMaxSum = theLeftBorderMaxSum + theRightBorderMaxSum;//两边连起来的大小
        int tempMax = max3(leftMaxSum, rightMaxSum, totalMaxSum);
        /*******求子数组之和最大的游标边界***********/
        if (null == map.get("tempMax") || tempMax > map.get("tempMax").intValue()) {//第一次赋值或者出现更大的子数组，if判断从前往后判断
            if (rightMaxSum == max3(leftMaxSum, rightMaxSum, totalMaxSum)) {//如果是合并之后右边值最大
                map.put("leftIndex", Integer.valueOf(midIndex + 1));
                map.put("rightIndex", Integer.valueOf(rightIndex));
            } else if (leftMaxSum == max3(leftMaxSum, rightMaxSum, totalMaxSum)) {//如果是左边值最大
                map.put("leftIndex", Integer.valueOf(leftIndex));
                map.put("rightIndex", Integer.valueOf(midIndex));
            } else {//如果是右边值最大
                map.put("leftIndex", Integer.valueOf(leftIndex));
                map.put("rightIndex", Integer.valueOf(rightIndex));
            }
            map.put("tempMax", tempMax);
        }
        return tempMax;
    }

    public static int max3(int a, int b, int c) {
        return a > b ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    /**
     * 测试点：求最大子数组
     * @param nums
     * @return
     */
    public int maxSubArray3(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(dp[i-1] > 0){
                dp[i] = dp[i-1] + nums[i];
            }else {
                dp[i] = nums[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max,dp[i]);
        }
        return max;
    }


}
