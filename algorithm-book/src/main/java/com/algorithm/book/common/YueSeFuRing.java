package com.algorithm.book.common;

public class YueSeFuRing {

    static final int num = 41;
    static final int killMan = 3;


    public void josephus(int alive){
        int[] man = new int[num];
        int count = 1;
        int i =0,pos = -1;
        while (count <= num){
            do {
                pos = (pos+1) % num;
                if(man[pos] == 0){
                    i++;
                }
                if(i == killMan){
                    i =0;
                    break;
                }
            }while (true);
            man[pos] = count;
            System.out.printf("第%2d个人自杀！约瑟夫环编号为%2d",pos+1,man[pos]);
            printArray(man);
            if(count % 2 == 1){
                System.out.printf(" -> ");
            }else {
                System.out.printf(" --> \n");
            }
            count++;
        }
        System.out.println();
        System.out.printf("这%d需要存活的初始位置应该排在以下序号\n",alive);
        alive = num - alive;

        for (int j = 0; j < num; j++) {
            if(man[j] > alive){
                System.out.printf("初始化编号：%d,约瑟夫环编号：%d \n",j+1,man[j]);
            }
        }
    }

    private void printArray(int[] man) {
        for (Integer item: man){
            System.out.print(" "+item);
        }
    }
}









