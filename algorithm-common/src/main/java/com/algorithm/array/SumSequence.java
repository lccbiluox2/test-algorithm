package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/***
 * todo: 九师兄  2023/7/1 16:30
 *
 * 【算法】和为S的连续正数序列
 * https://blog.csdn.net/qq_21383435/article/details/131491676
 */
public class SumSequence {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param sum int整型
     * @return int整型ArrayList<ArrayList <>>
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        // write code here
        int left = 1;
        int right = 2;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int sunTem = left+ right;
        while (right < sum){
            if(sunTem < sum){
                right++;
                sunTem = sunTem + right;
                continue;
            }
            if(sunTem > sum){
                // 左边界往右边移动 同时临时大小减去left
                sunTem = sunTem - left;
                left++;
                continue;
            }
            if(sunTem == sum){
                // 得到一个值 然后把这个值保存起来
                ArrayList<Integer> suns = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    suns.add(i);
                }
                result.add(suns);

                sunTem = sunTem - left;
                left++;
            }
        }
        return result;
    }

}
