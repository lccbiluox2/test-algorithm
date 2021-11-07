package com.algorithm.tree.hoffmantree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-31 18:57
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: todo: 【算法】赫夫曼编码
 */
public class HoffmanCode {

    //生成赫夫曼树对应的赫夫曼编码
    //思路:
    //1.将赫夫曼编码表存放在Map<Byte,String>形式
    // 32->01 97->100 100->11000 等等[形式]
    static Map<Byte, String> huffmanCodes = new HashMap<Byte, String>();
    //2.在生成赫夫曼编码表示，需要去拼接路径，定义一个StringBuilder存储某个叶子结点的路径
    static StringBuilder stringBuilder = new StringBuilder();

    /**
     * 测试点：测试赫夫曼编码
     * <p>
     * [Node [data =32 weight = 9], Node [data =97 weight = 5], Node [data =100 weight = 1], Node [data =101 weight = 4], Node [data =117 weight = 1], Node [data =118 weight = 2], Node [data =105 weight = 5], Node [data =121 weight = 1], Node [data =106 weight = 2], Node [data =107 weight = 4], Node [data =108 weight = 4], Node [data =111 weight = 2]]
     * Node [data =null weight = 40]
     * Node [data =null weight = 17]
     * Node [data =null weight = 8]
     * Node [data =108 weight = 4]
     * Node [data =null weight = 4]
     * Node [data =106 weight = 2]
     * Node [data =111 weight = 2]
     * Node [data =32 weight = 9]
     * Node [data =null weight = 23]
     * Node [data =null weight = 10]
     * Node [data =97 weight = 5]
     * Node [data =105 weight = 5]
     * Node [data =null weight = 13]
     * Node [data =null weight = 5]
     * Node [data =null weight = 2]
     * Node [data =100 weight = 1]
     * Node [data =117 weight = 1]
     * Node [data =null weight = 3]
     * Node [data =121 weight = 1]
     * Node [data =118 weight = 2]
     * Node [data =null weight = 8]
     * Node [data =101 weight = 4]
     * Node [data =107 weight = 4]
     * <p>
     * 验证 Node [data =108 weight = 4]
     * 108 代表 l  正好是 4个
     *
     * @param args
     */
    public static void main(String[] args) {

        String content = "i like like like java do you like a java";
        byte[] contentBytes = content.getBytes();
        System.out.println(contentBytes.length);

        List<Node> nodes = getNodes(contentBytes);
        System.out.println(nodes);

        Node huffmanTree = createHuffmanTree(nodes);
        preOrder(huffmanTree);

        // 下面要拿到赫夫曼编码  根节点没有code
        getCodes(huffmanTree);
//        getCodes(huffmanTree, "", stringBuilder);

        System.out.println("生成的Map结果如下：" + huffmanCodes);

        // 结果如下 1010100010111111110010001011111111001000101111111100100101001101110001110000011011101000111100101000101111111100110001001010011011100
        String codes = getCodeString(contentBytes, huffmanCodes);
        System.out.println("生成的结果如下：" + codes);

        byte[] zip = zip(codes);
        // 结果如下 [-88, -65, -56, -65, -56, -65, -55, 77, -57, 6, -24, -14, -117, -4, -60, -90, 28]
        // 可以对比原始的 可以知道压缩率为54%
        System.out.println("生成的哈夫曼结果：" + Arrays.toString(zip));

    }

    /**
     * 将上述的方法封装成一个方法
     *
     * @param content
     * @return
     */
    public static byte[] huffmanZip(String content) {

        byte[] contentBytes = content.getBytes();
        List<Node> nodes = getNodes(contentBytes);

        Node huffmanTree = createHuffmanTree(nodes);
        // 下面要拿到赫夫曼编码  根节点没有code
        huffmanCodes = getCodes(huffmanTree);
        String codes = getCodeString(contentBytes, huffmanCodes);
        byte[] zip = zip(codes);
        return zip;
    }

    public static byte[] huffmanZipBytes(byte[] contentBytes) {
        List<Node> nodes = getNodes(contentBytes);

        Node huffmanTree = createHuffmanTree(nodes);
        // 下面要拿到赫夫曼编码  根节点没有code
        huffmanCodes = getCodes(huffmanTree);
        String codes = getCodeString(contentBytes, huffmanCodes);
        byte[] zip = zip(codes);
        return zip;
    }


    /**
     * 赫夫曼解码
     ** @return
     */


    //编写-一个方法，完成对压缩数据的解码

    /**
     * @param huffmanCodes å* s 3ÈiAt map
     * @param huffmanBytes 赫夫曼编码得到的字节数组
     *                     ※@return 就是原来的字符串对应的数组
     */
    public static byte[] decode(Map<Byte, String> huffmanCodes, byte[] huffmanBytes) {


        //1.先得到huffmanBytes对应的二进制的字符串，形式1010100010111...
        StringBuilder stringBuilder = new StringBuilder();
        //将byte数组转成二进制的字符串
        for (int i = 0; i < huffmanBytes.length; i++) {
            byte bytes = huffmanBytes[i];
            //判断是不是最后- -个字节
            boolean flag = (i == huffmanBytes.length - 1);
            stringBuilder.append(byteToBitString(!flag, bytes));
        }
        System.out.println("当前翻译的赫夫曼=" + stringBuilder.toString());

        //把字符串安装指定的赫夫曼编码进行解码
        //把赫夫曼编码表进行调换，因为反向查询a->100 100->a
        Map<String, Byte> map = new HashMap<String, Byte>();
        for (Map.Entry<Byte, String> entry : huffmanCodes.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
        //创建要给集合，存放byte
        List<Byte> list = new ArrayList<>();
        //i可以理解成就是索引，扫描stringBuilder
        for (int i = 0; i < stringBuilder.length();) {
            int count = 1; // 小的计数器
            boolean flag = true;
            Byte b = null;
            while (flag) {
                //1010100010111...
                //递增的取出key 1
                String key = stringBuilder.substring(i, i + count);//i 不动，让count移动,指定匹配到- -个字符
                b = map.get(key);
                if (b == null) {//说明没有匹配到
                    count++;
                } else {
                    //匹配到
                    flag = false;
                }
            }
            list.add(b);
            i += count;
        }

        //当for循环结束后，我们list中就存放了所有的字符"i like like like java do you like a java"
        //把list中的数据放入到byte[ ]并返回
        byte b[] = new byte[list.size()];
        for (int i = 0; i < b.length; i++) {
            b[i] = list.get(i);
        }
        return b;
    }


    private static String byteToBitString(boolean flag, byte code) {
        int temp = code;
        if(flag){
            temp |= 256; // 按为与256 1 0000 0000 | 0000 0000
        }
        // 返回的是二进制的的补码
        String str = Integer.toBinaryString(temp);
        if (flag) {
            return str.substring(str.length() - 8);
        } else {
            return str;
        }

    }

    private static String getCodeString(byte[] bytes, Map<Byte, String> huffmanCodes) {
        //1.利用 huffmanCodes 将 bytes 转成 哈夫曼编码对应的字符串
        StringBuilder stringBuilder = new StringBuilder();
        //遍历bytes数组
        for (byte b : bytes) {
            stringBuilder.append(huffmanCodes.get(b));
        }
        System.out.println("/code结果：" + stringBuilder.toString());
        // 这里生成的结果是133个长度，比原来的内容还要长，因此需要压缩
        return stringBuilder.toString();
    }

    //为了调用方便，我们重载getCodes
    private static Map<Byte, String> getCodes(Node root) {
        if (root == null) {
            return null;
        }
        //处理root的左子树
        getCodes(root.left, "0", stringBuilder);
        //brootEt Fe
        getCodes(root.right, "1", stringBuilder);
        return huffmanCodes;
    }

    //编写一个方法，将字符串对应的byte[]数组， 通过生成的赫夫曼编码表，返回一个赫夫曼编码压缩后的byte[]

    /**
     * @param codes 这时原始的字符串对应的byte[]
     * @return返回赫夫曼编码处理后的byte[] #5l: String content = "i like like like java do you like a java"; =» byte[] contentBytes = content , getBy1
     * 返回的是字符串“1010100010111111110010001011111111001000101111111001001010011011100011100000110111010001111
     * =>I
     */
    private static byte[] zip(String codes) {
        //# "1010100010111111110.." #59 byte[ ]
        //-句话int len = (stringBuilder.1ength() + 7) / 8;
        int len;
        if (codes.length() % 8 == 0) {
            len = codes.length() / 8;
        } else {
            len = codes.length() / 8 + 1;
        }

        byte[] by = new byte[len];

        int index = 0;
        for (int i = 0; i < codes.length(); i += 8) {
            String strByte;
            // 不够8位
            if (i + 8 > codes.length()) {
                strByte = codes.substring(i);

            } else {
                strByte = codes.substring(i, i + 8);
            }
            by[index] = (byte) Integer.parseInt(strByte, 2);
            index++;
        }

        return by;
    }

    /**
     * 功能:将传入的node结点的所有叶子结点的赫夫曼编码得到，并放入到huffmanCodes集合
     *
     * @param node          传入结点
     * @param code          路径:左子结点是0,右子结点1
     * @param stringBuilder 用于拼接路径
     */
    private static void getCodes(Node node, String code, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder);
        //将code加入到stringBuilder2
        stringBuilder2.append(code);
        if (node != null) { //如果node == nu11不处理
            //判断当前node是叶子结点还是非叶子结点
            if (node.data == null) { //非叶子结点
                //递归处理
                //向左递归
                getCodes(node.left, "0", stringBuilder2);
                //向右递归
                getCodes(node.right, "1", stringBuilder2);
            } else {  // 说明是一个叶子节点
                // 就表示找到了某个叶子节点的最后
                huffmanCodes.put(node.data, stringBuilder2.toString());
            }
        }
    }


    private static List<Node> getNodes(byte[] bytes) {
        //1ê!ã-↑ArrayList
        ArrayList<Node> nodes = new ArrayList<Node>();
        //遍历bytes，统计每一个byte出现的次数- >map[key,value]
        Map<Byte, Integer> counts = new HashMap<>();
        for (byte b : bytes) {
            Integer count = counts.get(b);
            if (count == null) {
                counts.put(b, 1);
            } else {
                counts.put(b, count + 1);
            }
        }

        //把每一个键值对转成一个Node对象，并加入到nodes集合
        for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }

        return nodes;
    }


    //可以通过List创建对应的赫夫曼树
    private static Node createHuffmanTree(List<Node> nodes) {
        while (nodes.size() > 1) {
            //排序，从小到大
            Collections.sort(nodes);
            //取出第一颗最小的二叉树
            Node left = nodes.get(0);
            //取出第二颗最小的二叉树
            Node right = nodes.get(1);
            //创建一颗新的二叉树,它的根节点没有data,只有权值


            //(3)构建一颗新的二叉树
            Node parent = new Node(null, left.weight + right.weight);
            parent.left = left;
            parent.right = right;

            //(4)从ArrayList删除处理过的二叉树
            nodes.remove(left);
            nodes.remove(right);
            //  将parent加入到Nodes中
            nodes.add(parent);
        }

        //返回哈夫曼树的rootint index
        return nodes.get(0);
    }


    //编写一个前序遍历的方法
    public static void preOrder(Node root) {
        if (root != null) {
            root.preOrder();
        } else {
            System.out.println("是空树，不能遍历~~");
        }
    }
}


//创建Node , 待数据和权值
class Node implements Comparable<Node> {
    Byte data; // 存放数据(字符)本身,比如'a' => 97 => 32
    int weight; //权值， 表示字符出现的次数
    Node left;//
    Node right;

    public Node(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        //从小到大排序
        return this.weight - o.weight;
    }

    public String toString() {
        return "Node [data =" + data + " weight = " + weight + "]";
    }


    //写一个前序遍历
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }
}