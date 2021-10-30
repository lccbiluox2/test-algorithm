package com.algorithm.hash;

import java.util.HashMap;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-30 16:00
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: todo: 模拟hash表
 * https://blog.csdn.net/qq_21383435/article/details/121052221
 */
public class SimulationHashTable {


    public static void hashTableTest() {
        HashTable hashTable = new HashTable(5);
        hashTable.add(new Employees(1, "lcc"));
        hashTable.add(new Employees(3, "xjj"));
        hashTable.add(new Employees(5, "dff"));

        hashTable.list();
    }

    public static Employees findEmployById(int i) {
        HashTable hashTable = new HashTable(5);
        hashTable.add(new Employees(1, "lcc"));
        hashTable.add(new Employees(3, "xjj"));
        hashTable.add(new Employees(5, "dff"));

        return hashTable.findEmpById(3);
    }
}


class Employees {
    public int id;
    public String name;
    public Employees next;

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

//创建EmpLinkedList , 表示链表
class EmpLinkedList {
    //头指针，执行第一个Emp,因此我们这个链表的head是直接指向第一个Emp
    private Employees head; // 默认null

    //添加雇员到链表
    //说明
    //1.假定，当添加雇员时，id是自增长,即id的分配总是从小到大
    //因此我们将该雇员直接加入到本链表的最后即可
    public void add(Employees emp) {
        //如果是添加第一个雇员
        if (head == null) {
            head = emp;
            return;
        }
        //如果不是第一个雇员，则使用一个辅助的指针,帮助定位到最后
        Employees curEmp = head;
        while (true) {
            if (curEmp.next == null) { //说明到链表最后
                break;
            }
            curEmp = curEmp.next; //后移
        }
        curEmp.next = emp;
    }

    //遍历链表的雇员信息
    public void list(int i) {
        if (head == null) { //说明链表为空
            System.out.println("当前鍵表カ空");
            return;
        }
        System.out.println("第" + i + "条链表 当前链表的信息为");
        Employees curEmp = head;
        while (true) {
            System.out.printf("=> id=%d name=%s \t", curEmp.id, curEmp.name);
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        System.out.println();
    }

    //根据id查找雇员
    //如果查找到，就返回Emp,如果没有找到，就返回nu1l
    public Employees findEmpById(int id) {
        //判断链表是否为空
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        //辅助指针
        Employees curEmp = head;
        while (true) {
            if (curEmp.id == id) {//找到
                break;//这时就是找到了
            }
            if(curEmp.next == null){
                curEmp = null;
            }
            curEmp = curEmp.next;
        }
        return curEmp;
    }


}


class HashTable {
    private EmpLinkedList[] empLinkedListsArray;
    private int tableSize = 0;

    public HashTable(int tableSize) {
        this.tableSize = tableSize;
        this.empLinkedListsArray = new EmpLinkedList[tableSize];
    }


    //添加雇员
    public void add(Employees emp) {
        //根据员工的id , 得到该员工应当添加到哪条链表
        int empLinkedListNO = hashFun(emp.id);
        //将emp.添加到对应的链表中
        EmpLinkedList empLinkedList = empLinkedListsArray[empLinkedListNO];
        if (empLinkedList == null) {
            empLinkedList = new EmpLinkedList();
            empLinkedListsArray[empLinkedListNO] = empLinkedList;
        }

        empLinkedListsArray[empLinkedListNO].add(emp);
    }

    //遍历所有的链表,遍历hashtab
    public void list() {
        for (int i = 0; i < tableSize; i++) {
            EmpLinkedList empLinkedList = empLinkedListsArray[i];
            if (empLinkedList == null) {
                continue;
            }
            empLinkedList.list(i);
        }
    }

    //编写散列函数，使用一-个简单取模法
    public int hashFun(int id) {
        return id % tableSize;
    }

    public Employees findEmpById(int id) {
        //根据员工的id , 得到该员工应当添加到哪条链表
        int empLinkedListNO = hashFun(id);
        EmpLinkedList empLinkedList = empLinkedListsArray[empLinkedListNO];
        if(empLinkedList == null){
            return null;
        }
        Employees empById = empLinkedList.findEmpById(id);
        if(empById == null){
            System.out.println("没找到相关数据");
            return null;
        }
        return empById;
    }

}