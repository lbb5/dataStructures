package com.lbb.java.dataStructure.queue;

/**
 * @Author libingbing
 * @Date 2020-05-23 22:16
 * @Description 队列接口
 */
public interface Queue {
    boolean isFull();

    boolean isEmpty();

    void add(int item);

    int out();

    void showData();
}
