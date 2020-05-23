package com.lbb.java.dataStructure.queue;

/**
 * @Author libingbing
 * @Date 2020-05-23 22:18
 * @Description
 */
public class QueueDemo {
    public static void main(String[] args) {
        MyQueueByArray queue = new MyQueueByArray(10);
        queue.add(10);
        queue.add(9);
        queue.add(8);
        queue.add(7);
        queue.add(6);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        queue.add(1);
        queue.showData();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(queue.out()+" ");
        }
        System.out.println();
        System.out.println("<-------------->");
        System.out.println(queue.getHead());
        System.out.println(queue.getFont());

        queue.add(10);
        queue.add(9);
        queue.add(8);
        queue.add(7);
        queue.add(6);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);


        queue.showData();

    }
}
