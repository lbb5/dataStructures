package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 23:06
 * @Description
 */
public class josephu {

    private Boy first = null;

    public void add(int nums) {
        if (nums < 1) {
            System.out.println("输入参数有误");
            return;
        }
        Boy cur = null;
        for (int i = 1; i <= nums; i++) {
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                first.setNext(first);
                cur = first;
            } else {
                cur.setNext(boy);
                boy.setNext(first);
                cur = boy;
            }
        }
    }

    //遍历
    public void list() {
        if (first == null) {
            System.out.println("链表为空，无法遍历");
        }
        Boy temp = first;
        while (true) {
            if (temp.getNext() == first) {
                System.out.println(temp);
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }

    }
}
