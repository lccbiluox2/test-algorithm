package com.algorithm.tree.avl;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-07 19:56
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 【算法】平衡二叉树 Avl 树
 * https://blog.csdn.net/qq_21383435/article/details/121195732
 */
//创建二叉排序树
class AvlTree {
    private AvlTreeNode root;

    public AvlTreeNode getRoot() {
        return root;
    }

    public void add(AvlTreeNode node) {
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

    public AvlTreeNode search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    public AvlTreeNode searchParent(int value) {
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
        AvlTreeNode targerNode = search(value);
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
        AvlTreeNode parent = searchParent(value);
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
    public int delRightTreeMin(AvlTreeNode node) {
        AvlTreeNode target = node;
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
class AvlTreeNode {
    int value;
    AvlTreeNode left;
    AvlTreeNode right;

    AvlTreeNode(int data) {
        this.value = data;
    }

    /**
     * 查找要删除的节点
     *
     * @param value
     * @return
     */
    public AvlTreeNode search(int value) {
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
    public AvlTreeNode searchParent(int value) {
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
    public void add(AvlTreeNode node) {
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

        // 当添加完毕一个节点后,
        if (isShouldLeftRotate()) {
            if(isRightSonBigLeftSon()){
                right.rightRotate();
                leftRotate();
            }else {
                leftRotate();
            }
            // TODO; 必须停止不然可能会报错
            return;
        }

        // 当添加完毕一个节点后,判断是否需要右边旋转
        if (isShouldRightRotate()) {
            if(isLeftSonBigRightSon()){
                // 对左节点进行左边旋转 todo: 注意点
                left.leftRotate();
                rightRotate();
            }else {
                rightRotate();
            }
        }
    }

    /**
     * 如果它的右子树高度大于它的右子树的高度
     *    A
     * B     C
     *     f  g
     *   h
     * @return
     */
    private boolean isRightSonBigLeftSon() {
        return right != null && right.leftHeight() > right.rightHeight();
    }

    /**
     * 如果它的左子树高度大于它的右子树的高度
     *
     *    A
     *   B     C
     * d   e
     *       h
     * @return
     */
    private boolean isLeftSonBigRightSon() {
       return left != null && left.rightHeight() > left.leftHeight();
    }

    /**
     * 右节点树的高度 大于左边 树的高度 比1 大
     *
     * @return
     */
    private boolean isShouldRightRotate() {
        return leftHeight() - rightHeight() > 1;
    }

    /**
     * 左节点树的高度 大于右边 树的高度 比1 大
     *
     * @return
     */
    private boolean isShouldLeftRotate() {
        return rightHeight() - leftHeight() > 1;
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

    /**
     * 返回当前节点的高度，以该节点为根节点的树的高度
     *
     * @return
     */
    public int height() {
        return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
    }

    /**
     * 获取左子树的高度
     */
    public int leftHeight() {
        if (left == null) {
            return 0;
        }
        return left.height();
    }

    /**
     * 求出右子树的高度
     *
     * @return
     */
    public int rightHeight() {
        if (right == null) {
            return 0;
        }
        return right.height();
    }


    /**
     * 左旋转整棵树
     */
    private void leftRotate() {
        //创建新的结点，以当前根结点的值
        AvlTreeNode newNode = new AvlTreeNode(value);
        //把新的结点的左子树设置成当前结点的左子树
        newNode.left = left;
        //把新的结点的右子树设置成带你过去结点的右子树的左子树
        newNode.right = right.left;
        //把当前结点的值替换成右子结点的值
        value = right.value;
        //把当前结点的右子树设置成当前结点右子树的右子树
        right = right.right;
        //把当前结点的左子树(左子结点)设置成新的结点
        left = newNode;
    }


    /**
     * 右旋转整棵树
     */
    private void rightRotate() {
        //创建新的结点，以当前根结点的值
        AvlTreeNode newNode = new AvlTreeNode(value);
        //把新的结点的右子树设置成当前结点的右子树
        newNode.right = right;
        //把新的结点的右子树设置成带你过去结点的左子树的左子树
        newNode.left = left.right;
        //把当前结点的值替换成左子结点的值
        value = left.value;
        //把当前结点的左子树设置成当前结点左子树的左子树
        left = left.left;
        //把当前结点的右子树(右子结点)设置成新的结点
        right = newNode;
    }

}

