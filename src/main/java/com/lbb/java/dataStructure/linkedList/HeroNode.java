package com.lbb.java.dataStructure.linkedList;

/**
 * @Author libingbing
 * @Date 2020-05-24 10:56
 * @Description 组成链表的每一个基本元素
 */
public class HeroNode {
    //英雄编号
    public int no;
    //英雄名称
    public String name;
    //英雄昵称
    public String nikeName;

    public HeroNode next;

    //构造器
    public HeroNode(int no, String name, String nikeName) {
        this.name = name;
        this.no = no;
        this.nikeName = nikeName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                '}';
    }
}
