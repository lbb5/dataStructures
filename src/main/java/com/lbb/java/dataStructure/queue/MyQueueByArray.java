package com.lbb.java.dataStructure.queue;

/**
 * @Author libingbing
 * @Date 2020-05-23 21:50
 * @Description 自定义实现队列
 */
public class MyQueueByArray implements Queue {

    //实现队列有两种方法 数组和链表此为数组版本
    //队列大小
    private int size;
    //队列底层数组
    private int[] arr;
    //头指针初始化为-1
    private int head = -1;
    //尾指针初始化为-1
    private int font = -1;


    //构造函数
    public MyQueueByArray(int size) {
        this.size = size;
        //初始化数组
        this.arr = new int[size];
    }

    //判断队列是否已满
    public boolean isFull() {
        return font == size - 1;
    }
    //判断队列是否为空

    public boolean isEmpty() {
        return font == head;
    }

    //添加一个元素进队列
    public void add(int item) {
        if (isFull()) {
            System.out.println("队列空间不足，无法添加");
            return;
        }
        font++;
        arr[font] = item;
        System.out.println("添加元素成功 插入位置为 第 " + font + "位" + "值为" + item);
    }

    //添加一个元素出队列
    public int out() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空,不能出队列");
        }
        head++;

        int res=arr[head];
        return res;
    }

    @Override
    public void showData() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法打印队列");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public int getHead() {
        return head;
    }

    public int getFont() {
        return font;
    }
}
