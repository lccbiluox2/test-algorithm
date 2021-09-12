package com.algorithm.link.reverse;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-03 22:50
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkReverseDemo2 {

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = F;
        print(A);

        LinkedListReversor reversor = LinkedListReversor.RECURSION;
        System.out.println(reversor.getStrategy() + ":");
        Node tmp = reversor.execute(A);
        print(tmp);

        reversor = LinkedListReversor.NO_RECURSION;
        System.out.println(reversor.getStrategy() + ":");
        print(reversor.execute(tmp));
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.value);
            node = node.next;
            if (node != null) {
                System.out.print("->");
            } else {
                System.out.println();
            }
        }
    }

}

class Node {
    public String value;
    public Node next;

    public Node(String value) {
        this.value = value;
    }
}

enum LinkedListReversor {
    RECURSION("递归") {
        @Override
        public Node execute(Node node) {
            Node prev = null;
            if (node == null || node.next == null) {
                prev = node;
                System.out.println("节点末尾：" + node.value);
            } else {
                System.out.println("节点有下游节点" + node.value);
                Node tmp = execute(node.next);
                System.out.println("递归返回节点tmp.value " + tmp.value);
                System.out.println("递归返回节点node.value " + node.value);
                System.out.println("递归返回节点node.next.value " + node.next.value);
                if(node.next.next != null){
                    System.out.println("递归返回节点node.next.next.value " + node.next.next.value);
                }


                node.next.next = node;
                node.next = null;
                prev = tmp;
                if(node.next != null){
                    System.out.println("将节点" + node.next.value + " 指向节点：" + node.value);
                }
                System.out.println("将节点" + node.value + " 的node.next指向空节点：" );

            }
            LinkReverseDemo2.print(prev);
            return prev;
        }
    },
    NO_RECURSION("非递归") {
        @Override
        public Node execute(Node node) {
            Node prev = null;
            while (node != null) {
                Node tmp = node;
                node = node.next;
                tmp.next = prev;
                prev = tmp;
            }
            return prev;
        }
    };
    private String strategy;

    private LinkedListReversor(String strategy) {
        this.strategy = strategy;
    }

    public abstract Node execute(Node node);

    public String getStrategy() {
        return strategy;
    }
}
