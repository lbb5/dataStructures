package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 19:50
 * @Description 测试双向链表
 */
public class DoubleLinkedListDemo {

    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList =new DoubleLinkedList();

        DoubleNode node1 =new DoubleNode(1,"黎兵兵","班长");
        DoubleNode node2 =new DoubleNode(2,"钟裕民","体育委员");
        DoubleNode node3 =new DoubleNode(3,"彭红燃","学习委员");
        DoubleNode node4 =new DoubleNode(4,"李悦","副班长");

        doubleLinkedList.add(node1);
        doubleLinkedList.add(node2);
        doubleLinkedList.add(node3);
        doubleLinkedList.add(node4);
        doubleLinkedList.list();

        doubleLinkedList.delete(1);
        System.out.println("-------------------");
        doubleLinkedList.list();

        doubleLinkedList.delete(4);
        System.out.println("-------------------");
        doubleLinkedList.list();

    }

}
