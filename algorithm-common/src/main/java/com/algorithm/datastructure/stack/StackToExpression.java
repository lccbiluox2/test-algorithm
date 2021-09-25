package com.algorithm.datastructure.stack;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-25 12:27
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StackToExpression {

    ArrayToStack3 numStack = new ArrayToStack3(20);
    ArrayToStack3 operaStack = new ArrayToStack3(20);

    public StackToExpression() {

    }

    public int parseAndCalExpression(String expression) {
        int index = 0;
        char ch = 0;
        int res = 0;
        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);
            if (operaStack.isOperator(ch)) {
                if (!operaStack.isEmpty()) {
                    if (operaStack.priority(ch) <= operaStack.priority(operaStack.peak())) {
                        System.out.println("遇到优先级计算一下,计算前");
                        numStack.print();
                        operaStack.print();

                        int num1 = numStack.pop();
                        int num2 = numStack.pop();
                        int opera = operaStack.pop();
                        res = numStack.cal(num1, num2, opera);

                        System.out.println("遇到优先级计算一下，计算中");
                        numStack.print();
                        operaStack.print();

                        numStack.push(res);
                        operaStack.push(ch);

                        System.out.println("遇到优先级计算一下，计算后");
                        numStack.print();
                        operaStack.print();
                    } else {

                        System.out.println("遇到优先级不需要计算，计算前");
                        numStack.print();
                        operaStack.print();

                        operaStack.push(ch);

                        System.out.println("遇到优先级不需要计算，计算后");
                        numStack.print();
                        operaStack.print();


                    }
                } else {

                    System.out.println("站空，计算前");
                    numStack.print();
                    operaStack.print();

                    // 减去48是 ASIIC 码
                    operaStack.push(ch);

                    System.out.println("站空，计算后");
                    numStack.print();
                    operaStack.print();

                }
            }

            if (!operaStack.isOperator(ch)) {

                System.out.println("数字");
                numStack.print();
                operaStack.print();

                numStack.push(ch - 48);


                System.out.println("数字1");
                numStack.print();
                operaStack.print();
            }

            index++;
            if (index >= expression.length()) {
                break;
            }
        }

        while (true) {
            if (operaStack.isEmpty()) {
                break;
            } else {
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                int opera = operaStack.pop();
                res = numStack.cal(num1, num2, opera);

                numStack.push(res);
            }
        }

        int last = numStack.pop();
        System.out.println("表达式结果：" + last);
        return last;
    }

}
