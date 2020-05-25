package com.lbb.java.dataStructure.niBolan;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author libingbing
 * @Date 2020-05-25 23:23
 * @Description 自定义 逆波兰表达式计算出结果
 */
public class myNiBolan {

    public static void main(String[] args) {
        System.out.println(getAnswer("30 4 + 5 * 6 *"));
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }


    public static int getAnswer(String str) {
        //初始化一个栈，最后会在栈中
        Stack<Integer> stack = new Stack<>();

        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (isNumeric(split[i])) {
                //说明为数字
                stack.push(Integer.parseInt(split[i]));
            } else {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                //压出，进行运算后压入
                if ("+".equals(split[i])) {
                    stack.push((pop2 + pop1));
                } else if ("-".equals(split[i])) {
                    stack.push((pop2 - pop1));
                } else if ("*".equals(split[i])) {
                    stack.push(pop2 * pop1);
                } else if ("/".equals(split[i])) {
                    stack.push(pop2 / pop1);
                } else {
                     throw new RuntimeException("输入了非法字符，无法进行计算 字符为" + split[i]);
                }
            }

        }
        return stack.pop();
    }
}
