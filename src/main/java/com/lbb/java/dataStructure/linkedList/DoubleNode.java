package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 19:33
 * @Description
 */
public class DoubleNode {


    //英雄编号
    public int no;
    //英雄名称
    public String name;
    //英雄昵称
    public String nikeName;

    public DoubleNode next;

    public DoubleNode pre;

    public DoubleNode(int no, String name, String nikeName) {
        this.no = no;
        this.name = name;
        this.nikeName = nikeName;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                '}';
    }
}
