package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 14:47
 * @Description
 */
public class Test {

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

        System.out.println(Test.getLastKItem(singleLinkedList.getHead(), 3));
    }

    //求一个单链表的倒数第k个节点
    public static HeroNode getLastKItem(HeroNode Head, int k) {
        //先遍历链表，求出链表的有效节点数量
        HeroNode temp = Head;
        int num = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            num++;
            temp = temp.next;
        }
        System.out.println("有效节点数为：" + num);

        HeroNode cur = Head.next;
        for (int i = 0; i < num - k; i++) {
            cur = cur.next;
        }
        return cur;
    }

}
