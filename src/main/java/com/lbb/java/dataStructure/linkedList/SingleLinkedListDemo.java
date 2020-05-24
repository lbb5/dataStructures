package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 11:29
 * @Description 单链表测试
 */
public class SingleLinkedListDemo {

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
        System.out.println("有效节点数： "+singleLinkedList.getSize());
//        System.out.println("--------更新前------------");
//        singleLinkedList.list();
//        HeroNode node5 =new HeroNode(8,"李悦","副班长2");
//        singleLinkedList.update(node5);
//        System.out.println("--------更新后------------");
//        singleLinkedList.list();
        System.out.println("删除前----------------");
        singleLinkedList.list();
        System.out.println("删除后----------------");
        singleLinkedList.delete(1);
        singleLinkedList.list();
        System.out.println("删除后----------------");
        singleLinkedList.delete(4);
        singleLinkedList.list();

        System.out.println("有效节点数： "+singleLinkedList.getSize());
    }

}
