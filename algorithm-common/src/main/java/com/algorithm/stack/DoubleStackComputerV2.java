package com.algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * todo: 2023/2/1 22:49 九师兄
 * 【算法】双栈实现综合计算器
 *  https://blog.csdn.net/qq_21383435/article/details/128841485
 *  同样参考：com.algorithm.datastructure.stack.TwoStackForComputer
 **/
public class DoubleStackComputerV2 {


    //返回远算符的优先级，优先级是程序员来确定，优先级使用数字表示
    //数字越大，则优先级就越高。
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;// 假定目前的表达式只有十，-，*，/
        }
    }

    // 判断是不是一个运算符
    private boolean isOperator(char val){
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    //根据符号计算结果
    private int compute(int data1, int data2, char ch) {
        if (ch == '+')
            return data1 + data2;
        if (ch == '-')
            return data2 - data1; // 注意这里有个顺序 第二个弹出的数据是后弹出的
        if (ch == '%')
            return data2 % data1;
        return data1 * data2;
    }

    public int computing(char[] els) {
        //存数据的栈
        Deque<Integer> numStack = new ArrayDeque<>();
        //存符号优先级的优先级
        Deque<Character> operatorStack = new ArrayDeque<>();

        String keepNum = "";
        for (int index = 0; index < els.length; index++) {
            char ch = els[index];
            // 如果是数字，那么加入
            if (!isOperator(ch)) {
                // todo: 处理多位数的时候，不能不是符合就直接入栈，需要往后看，如果还是数字
                //  那么就继续往后面走，否则遇到符号才结束
                //处理多位数
                keepNum += ch;
                // 已经是最后一位了 那么直接保存数字
                if((index+1) == els.length){
                    numStack.push(Integer.parseInt(keepNum));
                    keepNum = "";
                }else {
                    // 判断下一个字符是不是数字，如果是数字，就继续扫描，如果是运算符，则入栈
                    // indext+1
                    if (isOperator(els[index+1])) {
                        numStack.push(Integer.parseInt(keepNum));
                        //重要的！！！！！！， keepNum清空
                        keepNum = "";
                    }
                }

                continue;
            }
            // 如果是符号
            if(isOperator(ch)){
                // 如果符号栈为空，那么直接入栈
                if(operatorStack.isEmpty()){
                    operatorStack.push(ch);
                }else {
                    /**
                     * 3.2 如果符号栈有操作符，就进行比较
                     * 如果当前的操作符的优先级小于或者等于栈中的操作符，就需要从数栈中pop出两个数,在从符号栈中pop出一个符号，进行运算.
                     *      将得到结果，入数栈，然后将当前的操作符入符号栈。
                     * 如果当前的操作符的优先级大于栈中的操作符，就直接入符号栈.
                     **/
                    // 计算当前扫描到的符合的优先级
                    int priority = priority(ch);
                    // todo: 这里注意，这里是拿到栈顶元素 但是不弹出这个元素
                    Character stackTop = operatorStack.peek();
                    // 获取栈顶元素的优先级
                    int topPriority = priority(stackTop);
                    if(priority <= topPriority){
                        // 需要pop数据，和符号，然后进行计算
                        Integer number1 = numStack.pop();
                        Integer number2 = numStack.pop();
                        // 拿到符号
                        char topOperator = operatorStack.pop();
                        // 进行计算 获取计算结果
                        int compute = compute(number1, number2, topOperator);

                        numStack.push(compute); // 数据入栈
                        operatorStack.push(ch);// 符号入栈
                    }else {
                        operatorStack.push(ch);// 符号入栈
                    }
                }
            }
        }
        // 当表达式扫描完毕，就顺序的从 数栈和符号栈中pop出相应的数和符号，并运算.
        while (!operatorStack.isEmpty()) {
            Integer number1 = numStack.pop();
            Integer number2 = numStack.pop();
            // 拿到符号
            char topOperator = operatorStack.pop();
            // 进行计算 获取计算结果
            int compute = compute(number1, number2, topOperator);

            numStack.push(compute); // 数据入栈
        }
        return numStack.poll();
    }
}
