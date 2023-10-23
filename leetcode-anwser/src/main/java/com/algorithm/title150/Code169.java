package com.algorithm.title150;

import java.util.HashMap;
import java.util.Map;

public class Code169 {

    /***
     * todo: 九师兄  2023/10/22 22:10
     * 自己想的，然后想直接使用map，但是明显知道这个性能不好
     */
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int length = nums.length;
        int yuzhi = length / 2;
        Map<Integer, Integer> map = new HashMap<>(yuzhi);
        for (int i : nums) {
            Integer integer = map.get(i);
            if (integer == null) {
                map.put(i, 0);
                continue;
            }
            // 有拆箱 装箱 的开销
            integer = integer + 1;
            map.put(i, integer);
            if(integer >= yuzhi){
                return i;
            }
        }
        return 0;
    }


}
