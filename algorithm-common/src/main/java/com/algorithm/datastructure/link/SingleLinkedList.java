package com.algorithm.datastructure.link;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 17:53
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SingleLinkedList {


    private HeroNode head = new HeroNode(0, "", "");
    private int realSize = 0;

    public void add(HeroNode newNode) {
        // 头节点不需要动
        HeroNode temp = head;
        // 遍历链表找到最后
        while (true) {
            // 找到链表的最后
            if (temp.getNextNode() == null) {
                break;
            }
            // 如果没找到，将temp后移
            temp = temp.nextNode;
        }
        // 当while结束的时候，temp就指向了最后的节点，将这个节点后面加上这个
        temp.nextNode = newNode;
        realSize++;
    }


    public void addByOrder(HeroNode newNode) {
        // 头节点不需要动
        HeroNode temp = head;
        boolean flag = false;
        // 遍历链表找到最后
        while (true) {
            // 找到链表的最后
            if (temp.getNextNode() == null) {
                break;
            }
            if (temp.nextNode.no > newNode.no) {
                // 找到位置
                break;
            } else if (temp.nextNode.no == newNode.no) {
                // 变好存在
                flag = true;
                break;
            }
            // 如果没找到，将temp后移
            temp = temp.nextNode;
        }
        if (flag) {
            System.out.println("数据已经存在当前序号的" + newNode.no);
        } else {
            // 当while结束的时候，temp就指向了最后的节点，将这个节点后面加上这个
            newNode.nextNode = temp.nextNode;
            temp.nextNode = newNode;
        }

    }

    public void update(HeroNode newHeroNode) {
        if (head.nextNode == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.nextNode;
        // 表示是否找到这个节点
        boolean flag = false;
        // 遍历链表找到最后
        while (true) {
            // 找到链表的最后，已经遍历完列表
            if (temp == null) {
                break;
            }
            if (temp.no == newHeroNode.no) {
                // 找到位置
                flag = true;
                break;
            }
            // 如果没找到，将temp后移
            temp = temp.nextNode;
        }
        if (flag) {
            System.out.println("数据已经存在当前序号的" + temp.no);
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.println("没有找到数据");
        }
    }


    public void delete(int no) {
        if (head.nextNode == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.nextNode;
        // 表示是否找到这个节点
        boolean flag = false;
        // 遍历链表找到最后
        while (true) {
            // 找到链表的最后，已经遍历完列表
            if (temp == null) {
                break;
            }
            if (temp.nextNode.no == no) {
                // 找到位置
                flag = true;
                break;
            }
            // 如果没找到，将temp后移
            temp = temp.nextNode;
        }
        if (flag) {
            System.out.println("数据已经存在当前序号的" + temp.no);
            temp.nextNode = temp.nextNode.nextNode;
            realSize--;
        } else {
            System.out.println("没有找到数据");
        }
    }


    public int size() {
        return realSize;
    }

    /**
     * 这个参考：https://www.bilibili.com/video/BV1E4411H73v?p=22
     * 使用了一个新的链表头 然后逐步遍历节点，然后
     * 读取一个数据加入到当前第二个节点的头部
     */
    public void reverse() {
        if (size() == 1) {
            return;
        }
        HeroNode newHead = new HeroNode(0, "", "");

        HeroNode currentNode = head.nextNode;
        while (true) {
            if (currentNode.nextNode == null) {
                System.out.println("最后一个节点了");
                HeroNode haveData = newHead.nextNode;

                HeroNode temp = currentNode.clone();
                temp.nextNode = null;
                temp.nextNode = haveData;

                newHead.nextNode = temp;

                break;
            }
            // 已经有数据了
            if (newHead.nextNode != null) {
                // 已有数据
                HeroNode haveData = newHead.nextNode;

                HeroNode temp = currentNode.clone();
                temp.nextNode = null;
                temp.nextNode = haveData;

                newHead.nextNode = temp;
            } else {
                HeroNode temp = currentNode.clone();
                temp.nextNode = null;
                newHead.nextNode = temp;
            }
            currentNode = currentNode.nextNode;
        }
        head.nextNode = newHead.nextNode;
        System.out.println("xx");
    }

    /**
     * todo: 这个开销比我写的要少
     */
    public void reverseList() {
        if (head.nextNode == null || head.nextNode.nextNode == null) {
            return;
        }

        HeroNode currentNode = head.nextNode;
        HeroNode next = null; // 指向currentNode节点的下一个节点
        HeroNode newHead = new HeroNode(0, "", "");

        // 每次从老的链表中取出来一个节点，然后加入到新节点的头部
        while (currentNode != null){
            // 事先将下一个节点保存起来
            next = currentNode.nextNode;
            // 当前节点的下一个节点 赋值 新链表的第二个数据，那么后面的数据都挂在这个数据后面了
            // 相当于现在情况是
            //  newHead ->  A->B
            //  currentNode -> A->B
            currentNode.nextNode = newHead.nextNode;
            // 然后如下
            //  newHead ->  currentNode -> A->B
            newHead.nextNode = currentNode;
            // 然后指向下一个原始链表的下一个节点
            currentNode = next;
        }
        head.nextNode = newHead.nextNode;
    }

    private HeroNode getSenondLast() {
        if (head.nextNode == null) {
            System.out.println("链表为空");
            return null;
        }

        HeroNode temp = head.nextNode;
        while (true) {
            if (temp.nextNode.nextNode == null) {
                break;
            }
            temp = temp.nextNode;
        }
        return temp;
    }

    private HeroNode getLast() {
        if (head.nextNode == null) {
            System.out.println("链表为空");
            return null;
        }

        HeroNode temp = head.nextNode;
        while (true) {
            if (temp.nextNode == null) {
                break;
            }
            temp = temp.nextNode;
        }
        return temp;
    }

    public void list() {
        if (head.nextNode == null) {
            System.out.println("链表为空");
            return;
        }

        HeroNode temp = head.nextNode;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp.toString());
            temp = temp.nextNode;
        }
    }
}
