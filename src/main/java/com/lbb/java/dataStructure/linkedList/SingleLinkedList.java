package com.lbb.java.dataStructure.linkedList;

import java.util.Stack;

/**
 * @Author libingbing
 * @Date 2020-05-24 10:24
 * @Description 单链表的设计与实现
 */
public class SingleLinkedList {

    //初始化一个头节点
    private HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }

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

    //判断单链表节点个数(去除头节点哦)
    public int getSize() {
        HeroNode temp = head;
        int size = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            size++;
            temp = temp.next;
        }
        return size;
    }

    //反转单链表
    public void reverse(HeroNode head) {
        if (head.next == null || head.next.next == null) {
            //表示链表为空，或者链表只有一个有效数据
            return;
        }
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverseNode = new HeroNode(0, "", "");

        while (cur != null) {
            next = cur.next;
            cur.next = reverseNode.next;
            reverseNode.next = cur;
            cur = next;
        }

        head.next = reverseNode.next;

    }

    //逆序打印链表，在不破坏原链表的情况下
    public void reversePrint(HeroNode head) {
        if (head.next == null) {
            return;
        }
        Stack<HeroNode> stack = new Stack<>();

        HeroNode cur = head.next;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }

        while (stack.size() != 0) {
            System.out.println(stack.pop());
        }

    }

    //合并两个有序链表，变成一个
    //并打印
    public void merge(HeroNode h1, HeroNode h2) {
        if (h1.next == null && h2.next == null) {
            return;
        }
        HeroNode cur1 = h1.next;
        HeroNode cur2 = h2.next;
        HeroNode mergeHead = new HeroNode(0, "", "");
        HeroNode temp = mergeHead;
        while (cur1 != null && cur2 != null) {
            if (cur1.no < cur2.no) {
                temp.next = cur1;
                cur1 = cur1.next;
                temp = temp.next;
            } else {
                temp.next = cur2;
                cur2 = cur2.next;
                temp = temp.next;
            }
        }
        if (cur1 == null) {
            temp.next = cur2;
        }
        if (cur2 == null) {
            temp.next = cur1;
        }

        HeroNode cur3 = mergeHead.next;
        while (cur3 != null) {
            System.out.println(cur3);
            cur3 = cur3.next;
        }

    }


}
