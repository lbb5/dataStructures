package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 10:24
 * @Description 单链表的设计与实现
 */
public class SingleLinkedList {

    //初始化一个头节点
    private HeroNode head = new HeroNode(0, "", "");

    //添加一个节点，默认
    public void add(HeroNode node) {

        //依靠临时节点，进行遍历到链表尾部，进行插入
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //程序进行到这一步说明已经遍历到了尾部
        temp.next = node;
    }

    //按照节点的顺序进行添加
    public void addByOrder(HeroNode node) {
        //标志位，说明是否在链表中是否有重复的。
        boolean flag = false;
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                //说明已经到最后面了，直接跳出循环，加在末尾即可。
                break;
            }
            if (temp.next.no > node.no) {
                //一定要找到要插入位置的前一个节点，不能进行插入操作
                break;
            } else if (temp.next.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("不能插入该节点，因为他的编号已经存在 no =" + node.no);
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    //修改节点
    public void update(HeroNode node) {
        if (head.next == null) {
            System.out.println("链表为空，无法操作");
        }
        HeroNode temp = head;
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

    //删除指定节点
    public void delete(int no) {
        if (head.next == null) {
            System.out.println("链表为空，无法操作");
        }
        //标志位，判断需要删除的是否存在
        boolean flag = false;
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                flag = true;
                break;
            }
            if (temp.next.no == no) {
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("不存在，无法删除");
        } else {
            if (temp.next.next == null) {
                //说明被删除的为最后一个
                temp.next = null;
            } else {
                temp.next = temp.next.next;
            }
        }

    }


    //遍历链表
    public void list() {
        if (head.next == null) {
            throw new RuntimeException("链表为空");
        }

        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }

    }


}
