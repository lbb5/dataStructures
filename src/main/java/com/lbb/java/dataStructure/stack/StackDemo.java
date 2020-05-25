package com.lbb.java.dataStructure.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author libingbing
 * @Date 2020-05-25 8:44
 * @Description
 */
public class StackDemo {

    public static void main(String[] args) {
        StackByArray stack = new StackByArray(10);
        Stack<String> stack1 =new Stack<>();
        LinkedList<String> list =new LinkedList<>();
        Queue<String> queue =new ConcurrentLinkedQueue<>();
        list.add("a");
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);

        for (int i = 0; i < 8; i++) {
            System.out.println(stack.pop());
        }
    }
}
