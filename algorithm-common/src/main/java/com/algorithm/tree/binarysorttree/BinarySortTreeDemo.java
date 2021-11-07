package com.algorithm.tree.binarysorttree;

import com.algorithm.tree.BinaryTreeDemo;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-07 12:43
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BinarySortTreeDemo {

    public void makeTree() {
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        BinarySortTree binarySortTree = new BinarySortTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            binarySortTree.add(new BinarySortTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        binarySortTree.infixOrder();
    }

    public void deleteLeavesNode() {
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        BinarySortTree binarySortTree = new BinarySortTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            binarySortTree.add(new BinarySortTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        binarySortTree.infixOrder();
        binarySortTree.deleteNode(1);

        System.out.println("中序遍历二叉排序树~间");
        binarySortTree.infixOrder();
    }

    public void deleteHaveSonNode() {
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        BinarySortTree binarySortTree = new BinarySortTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            binarySortTree.add(new BinarySortTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        binarySortTree.infixOrder();
        binarySortTree.deleteNode(9);

        System.out.println("中序遍历二叉排序树~间");
        binarySortTree.infixOrder();
    }
}

//创建二叉排序树
class BinarySortTree {
    private BinarySortTreeNode root;

    public void add(BinarySortTreeNode node) {
        if (root == null) {
            root = node;//如果root为空则直接让root指向node
        } else {
            root.add(node);
        }
    }

    //中序遍历
    public void infixOrder() {
        if (root != null) {
            root.infixOrder();
        } else {
            System.out.println("当前二叉排序树为空");
        }
    }

    public BinarySortTreeNode search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    public BinarySortTreeNode searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }

    public void deleteNode(int value) {
        if (root == null) {
            return;
        }
        // 找到要删除的节点
        BinarySortTreeNode targerNode = search(value);
        // 没有找到要删除的节点
        if (targerNode == null) {
            return;
        }

        // 如果我们发现当前这颗二叉树只有一个节点
        if (root.left == null && root.right == null) {
            // 将根节点置空
            root = null;
            return;
        }
        BinarySortTreeNode parent = searchParent(value);
        // 如果要删除的节点是叶子节点
        if (targerNode.left == null && targerNode.right == null) {
            // 节点的左右节点都是空的

            // 说明是左子节点
            if (parent.left != null && parent.left.value == value) {
                parent.left = null;
            } else if (parent.right != null && parent.right.value == value) {
                // 说明是右节点
                parent.left = null;
            }


        } else {
            // 不是有子节点，那么可能有1个子节点 或者2个子节点

            // 先处理有2个字节点的
            if (targerNode.left != null && targerNode.right != null) {
                int minVal = delRightTreeMin(targerNode.right);
                targerNode.value = minVal;
            } else {
                // 此处目节点只有一个子节点
                if (targerNode.left != null && targerNode.right == null) {
                    // 左节点存在 右节点不存在
                    if (parent == null) {
                        root = targerNode.left;
                    } else {
                        if (parent.left.value == value) {
                            parent.left = targerNode.left;
                        } else {
                            // targenNode 是parent的右子节点
                            parent.right = targerNode.left;
                        }
                    }

                } else if (targerNode.left == null && targerNode.right != null) {
                    // 左节点不存储 右节点存在
                    if (parent == null) {
                        root = targerNode.right;
                    } else {
                        if (parent.left.value == value) {
                            parent.left = targerNode.right;
                        } else {
                            // targenNode 是parent的右子节点
                            parent.right = targerNode.right;
                        }
                    }

                }
            }

        }
    }

    //编写方法:
    //1.返回的以node为根结点的二叉排序树的最小结点的值
    //2.删除node为根结点的二叉排序树的最小结点

    /**
     * @paramnode传入的结点(当做二叉排序树的根结点)
     * @return返回的以node为根结点的二叉排序树的最小结点的值
     */
    public int delRightTreeMin(BinarySortTreeNode node) {
        BinarySortTreeNode target = node;
        //循环的查找左节点，就会找到最小值
        while (target.left != null) {
            target = target.left;
        }
        // 删除最小的值
        deleteNode(target.value);
        return target.value;
    }
}

/**
 * 二叉树节点
 */
class BinarySortTreeNode {
    int value;
    BinarySortTreeNode left;
    BinarySortTreeNode right;

    BinarySortTreeNode(int data) {
        this.value = data;
    }

    /**
     * 查找要删除的节点
     *
     * @param value
     * @return
     */
    public BinarySortTreeNode search(int value) {
        if (value == this.value) {
            return this;
        } else if (value < this.value) {
            if (this.left == null) {
                return null;
            }
            return this.left.search(value);
        } else {
            if (this.right == null) {
                return null;
            }
            return this.right.search(value);
        }
    }

    /**
     * 查找要删除节点的父节点
     *
     * @param value
     * @return
     */
    public BinarySortTreeNode searchParent(int value) {
        // 当前左边节点不为空，而且左边子子节点的值等于要查找的
        boolean leftFind = this.left != null && this.left.value == value;
        boolean rightFind = this.right != null && this.right.value == value;
        if (leftFind || rightFind) {
            return this;
        } else {
            // 如果要查找的值小于当前节点的值，并且当前节点的左子节点不为空
            if (value < this.value && this.left != null) {
                return this.left.searchParent(value);
            } else if (value >= this.value && this.right != null) {
                return this.right.searchParent(value);
            } else {
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    //添加结点的方法
    //递归的形式添加结点,注意需要满足二叉排序树的要求
    public void add(BinarySortTreeNode node) {
        if (node == null) {
            return;
        }
        //判断传入的结点的值，和当前子树的根结点的值关系
        if (node.value < this.value) {
            //如果当前结点左子结点为null
            if (this.left == null) {
                this.left = node;
            } else {
                //递归的向左子树tinaj|
                this.left.add(node);
            }
        } else {
            //如果当前结点左子结点为null
            if (this.right == null) {
                this.right = node;
            } else {
                //递归的向左子树tinaj|
                this.right.add(node);
            }
        }
    }


    // 中序遍历
    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.infixOrder();
        }
    }
}

