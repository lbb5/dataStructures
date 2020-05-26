package com.lbb.java.dataStructure.niBolan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author libingbing
 * @Date 2020-05-26 9:15
 * @Description 中缀表达式转换成后缀表达式
 */
public class TranseLate {
    public static void main(String[] args) {
        List<String> list = toList("(1+2)*5-8");
        List<String> translate = translate(list);

        System.out.println(translate);
    }

    public static List<String> translate(List<String> res) {
        //波兰序列转换成逆波兰序列
        //定义一个栈
        Stack<String> stack = new Stack<>();
        List<String> list = new ArrayList<>();

        //循环遍历 list
        for (String item : res) {
            //如果为数字直接进入list当中
            if (item.matches("\\d+")) {
                list.add(item);
            } else if ("(".equals(item)) {
                stack.push(item);
            } else if (")".equals(item)) {
                while (!stack.peek().equals("(")) {
                    list.add(stack.pop());
                }
                stack.pop(); //把左括号弹出
            } else {
                while (stack.size() != 0 && getValue(stack.peek()) >= getValue(item)) {
                    list.add(stack.pop());
                }
                stack.push(item);
            }
        }

        while (stack.size() > 0) {
            list.add(stack.pop());
        }

        return list;
    }

    public static int getValue(String str) {
        int res = 0;
        switch (str) {
            case "+":
                res = 1;
                break;
            case "-":
                res = 1;
                break;
            case "*":
                res = 2;
                break;
            case "/":
                res = 2;
                break;
        }
        return res;
    }

    //将表达式转成list便于操作
    public static List<String> toList(String str) {
        List<String> res = new ArrayList<>();
        int index = 0;
        String s = "";
        do {
            if ((str.charAt(index) < 48) || (str.charAt(index) > 57)) {
                //说明是非数字,直接入list
                res.add(str.charAt(index) + "");
                index++;
            } else {
                while (index < str.length() && (str.charAt(index) >= 48) && ((str.charAt(index) <= 57))) {
                    s += str.charAt(index);
                    index++;
                }
                res.add(s);
                s = "";
            }

        } while (index < str.length());


        return res;
    }

}
