package com.lbb.java.dataStructure.queue;

/**
 * @Author libingbing
 * @Date 2020-05-24 9:54
 * @Description
 */
public class CircleQueueDemo {
    public static void main(String[] args) {
        CircleQueue queue = new CircleQueue(5);

        queue.add(1);
        queue.add(1);
        queue.add(1);
        queue.add(1);

        System.out.println(queue.out());
        System.out.println(queue.out());
        System.out.println(queue.out());
        System.out.println(queue.out());

        queue.add(2);

//        queue.showData();

        System.out.println("--------------" + queue.getHead());
        System.out.println(queue.getDataSize());
//        queue.showData();
//
//        System.out.println(queue.isEmpty());

    }
}
