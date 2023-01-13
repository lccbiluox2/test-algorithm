package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;

import java.util.Stack;

/***
 * todo: 2023/1/10 下午9:57 lcc 九师兄
 *       二叉树的非递归模式
 */
public class BinaryTreeNotRecursion {

    /**
     * todo: 2023/1/10 下午10:13 九师兄
     *     测试点: 测试不使用递归方式实现 二叉树的先序遍历
     */
    public static void preOrderUnRecur(TreeNode head){
        System.out.println("先序遍历");
        if(head != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.add(head);

            while (!stack.isEmpty()){
                head = stack.pop();
                System.out.println(head.data+" ");
                if(head.rightChild != null){
                    stack.push(head.rightChild);
                }
                if(head.leftChild != null){
                    stack.push(head.leftChild);
                }
            }
        }
    }


    /**
     * todo: 2023/1/11 下午9:29 九师兄
     *     测试点: 测试不使用递归方式实现 二叉树的后序遍历
     */
    public static void postOrderUnRecur(TreeNode head){
        System.out.println("后序遍历");
        if(head != null){
            Stack<TreeNode> stack1 = new Stack<>();
            Stack<TreeNode> stack2 = new Stack<>();
            stack1.push(head);

            while (!stack1.isEmpty()){
                head = stack1.pop();
                stack2.push(head);

                if(head.leftChild != null){
                    stack1.push(head.leftChild);
                }
                if(head.rightChild != null){
                    stack1.push(head.rightChild);
                }
            }
            while (!stack2.isEmpty()){
                System.out.println(stack2.pop().data+"");
            }
            System.out.println();
        }
    }

    /**
     * todo: 2023/1/11 下午9:29 九师兄
     *     测试点: 测试不使用递归方式实现 二叉树的中序遍历
     *
     *     一样的代码参考：com.algorithm.tree.BinaryTreeDemo#levelOrderTraversal(com.algorithm.tree.BinaryTreeDemo.TreeNode)
     */
    public static void inOrderUnRecur(TreeNode head){
        System.out.println("中序遍历");
        if(head != null){
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || head != null){
                if(head != null){
                    stack.push(head);
                    head = head.leftChild;
                }else {
                    head = stack.pop();
                    System.out.print(head.data+" ");
                    head = head.rightChild;
                }
            }
        }
        System.out.println();
    }
}






















