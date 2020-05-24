package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 19:35
 * @Description 双向链表的实现
 */
public class DoubleLinkedList {

    private DoubleNode head = new DoubleNode(0, "", "");

    public DoubleNode getHead() {
        return head;
    }

    //遍历链表
    public void list() {
        if (head.next == null) {
            throw new RuntimeException("链表为空");
        }

        DoubleNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }

    }

    //添加一个节点，默认
    public void add(DoubleNode node) {

        //依靠临时节点，进行遍历到链表尾部，进行插入
        DoubleNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //程序进行到这一步说明已经遍历到了尾部
        //这一步构成了双向关联
        temp.next = node;
        node.pre = temp;
    }

    //修改节点
    public void update(DoubleNode node) {
        if (head.next == null) {
            System.out.println("链表为空，无法操作");
        }
        DoubleNode temp = head;
        //定义一个标志位，判断想修改的节点是否存在，如果不存在，自然无法修改
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                flag = true;
                break;
            }
            if (temp.next.no == node.no) {
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("链表不存在该节点，不能修改");
        } else {
            node.next = temp.next.next;
            temp.next = node;
        }
    }

    public void delete(int no) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        boolean flag = false;
        DoubleNode temp = head.next;
        while (true) {
            if (temp == null) {
                flag = true;
                break;
            }
            if (temp.no == no) {
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("没有这个节点，不能进行删除操作");
        } else {
            temp.pre.next=temp.next;
        }
    }
}
