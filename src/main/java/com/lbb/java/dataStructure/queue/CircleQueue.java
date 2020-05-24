package com.lbb.java.dataStructure.queue;

/**
 * @Author libingbing
 * @Date 2020-05-24 9:28
 * @Description 环形队列
 */
public class CircleQueue implements Queue {
    //实现队列有两种方法 数组和链表此为数组版本
    //队列大小
    private int size;
    //队列底层数组
    private int[] arr;
    //头指针初始化为0
    private int font;
    //尾指针初始化为0
    private int rear;


    public CircleQueue(int size) {
        this.size = size;
        arr = new int[size];
    }

    @Override
    public boolean isFull() {
        return (rear + 1) % size == font;
    }

    @Override
    public boolean isEmpty() {
        return rear == font;
    }

    @Override
    public void add(int item) {
        if (isFull()) {
            throw new RuntimeException("队列已经满了，不能添加数据");
        }
        arr[rear] = item;
        rear = (rear + 1) % size;
    }

    @Override
    public int out() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能弹出数据");
        }
        int res = arr[font];
        font = (font + 1) % size;
        return res;
    }

    @Override
    public void showData() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        //从font 开始遍历，遍历次数为队列中元素的个数
        for (int i = font; i < font + getDataSize(); i++) {
            System.out.print(arr[i % size] + " ");
        }
    }

    public int getDataSize() {
        return (rear - font + size) % size;
    }

    public int getHead() {
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[font];
    }
}
