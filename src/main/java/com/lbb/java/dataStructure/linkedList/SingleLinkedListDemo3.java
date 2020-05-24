package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 11:29
 * @Description 单链表测试
 */
public class SingleLinkedListDemo3 {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        HeroNode node =new HeroNode(1,"黎兵兵","班长");
        HeroNode node2 =new HeroNode(2,"钟裕民","体育委员");
        HeroNode node3 =new HeroNode(3,"彭红燃","学习委员");
        HeroNode node4 =new HeroNode(4,"李悦","副班长");

        singleLinkedList.addByOrder(node);
        singleLinkedList.addByOrder(node4);
        singleLinkedList.addByOrder(node3);
        singleLinkedList.addByOrder(node2);

        //逆序打印
        singleLinkedList.reversePrint(singleLinkedList.getHead());

        System.out.println("-------------逆序打印之后链表的情况------------------");
        singleLinkedList.list();


    }
}
