package com.algorithm.anoperation;

public class BitOneCount {

    public int bitOneCount(int n){
        String aa = Integer.toBinaryString(n);
        System.out.println(aa);

        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
        System.out.println(cnt);
        return cnt;
    }
}
