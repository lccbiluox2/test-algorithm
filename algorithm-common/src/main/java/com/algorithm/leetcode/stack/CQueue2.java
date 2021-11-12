package com.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-12 09:45
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 1  -
 * <p>
 * 1
 * 2 -
 */
class CQueue2 {
    //维护两个成员变量s1和s2,其中s1主要支持插入元素，s2支持删除元素
    Stack<Integer> s1;
    Stack<Integer> s2;
    public CQueue2() {       //在构造方法中创建对象
        s1=new Stack<>();
        s2=new Stack<>();
    }
    //队尾入队时直接将元素压入栈s1中
    public void appendTail(int value) {
        s1.push(value);
    }
    //删除元素时，如果s2中存在元素，那么直接把s2栈顶元素删除即可。
    //如果s2为空，那么需要把s1中的全部元素都出栈压入到s2栈中，此时
    //s2栈中各个元素出栈的顺序其实就是模拟队列中出队的顺序。
    //当然，可能s1本身也为空，所以s2也可能为空，如果为空，返回-1，否则弹出s2栈顶元素
    public int deleteHead() {
        if(!s2.empty()){
            return s2.pop();
        }else{
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }

        if(s2.empty()){
            return -1;
        }else{
            return s2.pop();
        }

    }
}
