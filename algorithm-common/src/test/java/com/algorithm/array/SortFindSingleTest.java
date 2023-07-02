package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortFindSingleTest {

    private SortFindSingle sortFindSingle = new SortFindSingle();

    @Test
    public void singleNonDuplicate() {
        int[] arr = new int[]{1,1,2};
        int i = sortFindSingle.singleNonDuplicate(arr);
        System.out.println(i);
    }

    @Test
    public void singleNonDuplicate1() {
        int[] arr = new int[]{1,1,2,2,2,2,3,4,4,4};
        int i = sortFindSingle.singleNonDuplicate(arr);
        System.out.println(i);
    }

    @Test
    public void singleNonDuplicate11() {
        int[] arr = new int[]{1,1,2};
        int i = sortFindSingle.singleNonDuplicate1(arr);
        System.out.println(i);
    }


    @Test
    public void singleNonDuplicate12() {
        int[] arr = new int[]{1,1,2,3,3,4,4,8,8};
        int i = sortFindSingle.singleNonDuplicate1(arr);
        System.out.println(i);
    }

    @Test
    public void singleNonDuplicate13() {
        int[] arr = new int[]{1,2,2};
        int i = sortFindSingle.singleNonDuplicate1(arr);
        System.out.println(i);
    }

    @Test
    public void singleNonDuplicate14() {
        int[] arr = new int[]{3,3,7,7,10,11,11};
        int i = sortFindSingle.singleNonDuplicate2(arr);
        System.out.println(i);
    }

    @Test
    public void singleNonDuplicate4() {
        int[] arr = new int[]{1,1,2,3,3,4,4,8,8};
        int i = sortFindSingle.singleNonDuplicate3(arr);
        System.out.println(i);
    }

    @Test
    public void singleNonDuplicate5() {
        int[] arr = new int[]{1,1,2,3,3,4,4,8,8};
        int i = sortFindSingle.singleNonDuplicate4(arr);
        System.out.println(i);
    }

}