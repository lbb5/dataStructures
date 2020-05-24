package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 15:15
 * @Description
 */
public class Solution {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return head;
        }
        ListNode temp = head;
        //第一步查找出有效节点数
        int sum = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            sum++;
        }

        ListNode cur = head;
        for (int i = 0; i < sum - n; i++) {
            cur = cur.next;
        }

        if (cur.next.next == null) {
            cur.next = null;
        } else {
            cur.next = cur.next.next;
        }

        return head;
    }


}
