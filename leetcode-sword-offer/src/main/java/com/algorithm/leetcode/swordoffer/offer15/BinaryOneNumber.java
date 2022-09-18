package com.algorithm.leetcode.swordoffer.offer15;

/**
 *todo: 9/12/22 2:30 PM 九师兄
 *
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1'
 * 的个数（也被称为 汉明重量).）。
 *
 *  
 *
 * 提示：
 *
 * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 * 在 Java 中，编译器使用 二进制补码 记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class BinaryOneNumber {

    public int hammingWeight(int n) {
        convertToBinary(n);
        return -1;
    }

    private static void convertToBinary(int num) {
        int[] nums =new int[100];
        int index = 0;
        int count = 0;
        for (int i = num; i >0 ; i/=2,index++) {
            int remainder = i%2;
            if(remainder == 1){
                count++;
            }
            nums[index] = i%2;
        }

        for (int i =index-1; i>=0; i--) {
            System.out.print(nums[i]);
        }
        System.out.println(count);
    }

}
