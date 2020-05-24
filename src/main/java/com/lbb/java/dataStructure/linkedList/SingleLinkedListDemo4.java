package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 11:29
 * @Description 单链表测试
 */
public class SingleLinkedListDemo4 {

    public static void main(String[] args) {
        SingleLinkedList list1 = new SingleLinkedList();

        HeroNode node =new HeroNode(1,"黎兵兵","班长");
        HeroNode node2 =new HeroNode(3,"钟裕民","体育委员");
        HeroNode node3 =new HeroNode(5,"彭红燃","学习委员");
        HeroNode node4 =new HeroNode(7,"李悦","副班长");

        list1.addByOrder(node);
        list1.addByOrder(node4);
        list1.addByOrder(node3);
        list1.addByOrder(node2);


        SingleLinkedList list2 = new SingleLinkedList();

        HeroNode node5 =new HeroNode(2,"黎兵兵2","班长");
        HeroNode node6 =new HeroNode(4,"钟裕民2","体育委员");
        HeroNode node7 =new HeroNode(6,"彭红燃2","学习委员");
        HeroNode node8 =new HeroNode(8,"李悦2","副班长");

        list2.addByOrder(node5);
        list2.addByOrder(node6);
        list2.addByOrder(node7);
        list2.addByOrder(node8);



        list2.merge(list1.getHead(),list2.getHead());







    }
}
