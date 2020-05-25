package com.lbb.java.dataStructure.stack;

/**
 * @Author libingbing
 * @Date 2020-05-25 8:37
 * @Description 用数组实现栈
 */
public class StackByArray {

    private int size;
    private int[] arr;
    private int top = -1;

    public StackByArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void add(int item) {
        if(isFull()){
            System.out.println("栈已满，无法添加");
            return;
        }
        top++;
        arr[top] = item;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("栈为空，没有元素，不能弹出");
            throw new RuntimeException("栈为空，没有元素，不能弹出");
        }
        int res = arr[top];
        top--;
        return res;
    }

    public boolean isFull() {
        return (top + 1) == size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
