package com.lbb.java.dataStructure.stack;

/**
 * @Author libingbing
 * @Date 2020-05-25 9:06
 * @Description 通过计算器模拟 电脑进行运算
 */
public class calculator {
    //思路 ，通过两个栈 ，一个专门放数字 ，一个专门放 符号 ，符号栈为空时，符号可以直接入栈
    // ，如果符号为不为空，则需要出栈 进行运算 ，到最后数字栈就是 结果值

    public int caluculate(String str) {
        if ("".equals(str) || str == null) {
            return 0;
        }
        //数字栈
        StackByArray s1 = new StackByArray(100);
        //符号栈
        StackByArray s2 = new StackByArray(100);
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            String s = c + "";
            if (c >= 48 && c <= 57) {
                //为数字 人数字栈
                s1.add(Integer.parseInt(s));
            } else {
                if (s2.isEmpty()) {
                    s2.add(c);
                } else {
                    int pop1 = s1.pop();
                    int pop2 = s1.pop();
                    int pop3 = s2.pop();
                    //数字 出栈 全部 进行操作完 继续压入栈
                    if (pop3 == 43) {
                        s1.add(pop1 + pop2);
                    } else if (pop3 == 45) {
                        s1.add(pop2 - pop1);
                    } else if (pop3 == 42) {
                        s1.add(pop1 * pop2);
                    } else if (pop3 == 47) {
                        s1.add(pop1 / pop2);
                    }
                    s2.add(c);
                }
            }

        }
        int res1 = s1.pop();
        int res2 = s1.pop();
        int res3 = s2.pop();
        if (res3 == 43) {
            return res1 + res2;
        } else if (res3 == 45) {
            return res2 - res1;
        } else if (res3 == 42) {
            return res1 * res2;
        } else if (res3 == 47) {
            return res2 / res1;
        }
        return 0;
    }
}