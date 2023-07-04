package com.algorithm.bit;

/***
 * todo: 九师兄  2023/7/4 20:52
 *
 * 位运算使用技巧
 */
public class BitTechnique {

    /***
     * todo: 九师兄  2023/7/4 20:54
     *
     * x ^ 0s = x      x & 0s = 0      x | 0s = x
     * x ^ 1s = ~x     x & 1s = x      x | 1s = 1s
     * x ^ x = 0       x & x = x       x | x = x
     *
     * 2 0 2
     * 3 0 3  这个有些疑问
     * 0 2 2
     *
     * 2 ^ 1
     * 0010
     * 0001
     * 0011 = 3
     *
     * 2 & 1
     * 0010
     * 0001
     * 0000 = 0
     *
     * 2 | 1
     * 0010
     * 0001
     * 0011 = 3
     */
    public void bitRule(){
        System.out.println(2 ^ 0);
        System.out.println(2 & 0);
        System.out.println(2 | 0);

        System.out.println(2 ^ 1);
        System.out.println(2 & 1);
        System.out.println(2 | 1);

        System.out.println(2 ^ 2);
        System.out.println(2 & 2);
        System.out.println(2 | 2);
    }

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while(z != 0) {
            if ((z & 1) == 1) cnt++;
            z = z >> 1;
        }
        return cnt;
    }

    public int hammingDistanceV1(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while (z != 0) {
            z &= (z - 1);
            cnt++;
        }
        return cnt;
    }

    public int hammingDistanceV2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int n : nums) ret = ret ^ n;
        return ret;
    }
}
