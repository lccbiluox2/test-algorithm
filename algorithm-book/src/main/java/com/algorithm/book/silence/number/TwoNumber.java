package com.algorithm.book.silence.number;

import java.util.HashMap;
import java.util.Map;

public class TwoNumber {

    /***
     * 给定⼀个数组和⼀个⽬标和，从数组中找两个数字相加等于⽬标和，输出这两个数字的下标
     *
     * https://leetcode.cn/problems/two-sum/submissions/
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int sub=target-nums[i];
            if(map.containsKey(sub)&&map.get(sub)!=i){
                return new int[]{i,map.get(sub)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /***
     * todo: 九师兄  2023/3/11 21:38
     *   看解法⼆中，两个 for 循环，他们⻓的⼀样，我们当然可以把它合起来。复杂度上不会带来什么变化，变化
     * 仅仅是不需要判断是不是当前元素了，因为当前元素还没有添加进 hash ⾥。
     *
     * https://leetcode.cn/problems/two-sum/submissions/
     */
    public int[] twoSumV2(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sub=target-nums[i];
            if(map.containsKey(sub)){
                return new int[]{i,map.get(sub)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
