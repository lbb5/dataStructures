package com.lbb.java.dataStructure.niBolan;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author libingbing
 * @Date 2020-05-25 23:11
 * @Description 中序表达式转换成后续表达式
 */
public class MyRPN {

    private Stack<Character> s1;
    private String s2;
    private ArrayList<Integer> number;

    public MyRPN() {
        s1 = new Stack<>();
        this.s1.push('#');
        s2 = new String("");
    }

    public boolean isOperation(char op) {
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            return true;
        }
        return false;
    }

    public void makeRPN(String expression) {
        int length = expression.length();
        for (int i=0; i<length; i++) {
            char now = expression.charAt(i);
            // 处理数字
            if (Character.isDigit(now)) {
                if (!s2.isEmpty()) {
                    if (Character.isDigit(s2.charAt(s2.length()-1))) {
                        s2 += "&";
                    }
                }
                s2 += expression.charAt(i);
                while(Character.isDigit(expression.charAt(i+1))) {
                    s2 += expression.charAt(++i);
                }
            }
            // 处理 （
            else if (now == '(') {
                s1.push('(');
            }
            // 处理 ）
            else if (now == ')') {
                while (s1.peek() != '(') {
                    char temp = s1.pop();
                    s2 += temp;
                }
                s1.pop();
            }
            // 处理 #
            else if (now == '#'){
                break;
            }
            // 处理运算符
            else {
                if (!this.isOperation(s1.peek())) {
                    s1.push(now);
                }
                else if (this.compareOperator(now, s1.peek())) {
                    s1.push(now);
                } else {
                    while (this.isOperation(s1.peek()) && !this.compareOperator(now, s1.peek())) {
                        s2 += s1.pop();
                    }
                    s1.push(now);
                }
            }
        }
        while (s1.peek() != '#') {
            s2 += s1.pop();
        }
    }

    /**
     * 结算逆波兰式
     */
    public Integer calculateRPN() {
        Stack<Integer> calculateStack = new Stack<>();
        int length = this.s2.length();
        for (int i=0; i<length; i++) {
            if (Character.isDigit(s2.charAt(i))) {
                int temp = 0;
                temp = temp*10 + s2.charAt(i)-'0';
                while(Character.isDigit(s2.charAt(i+1))) {
                    temp = temp*10 + s2.charAt(++i)-'0';
                }
                if (s2.charAt(i+1) == '&') {
                    ++i;
                }
                calculateStack.push(temp);
            } else {
                int b = calculateStack.pop();
                int a = calculateStack.pop();
                switch (s2.charAt(i)) {
                    case '+' : calculateStack.push(a+b); break;
                    case '-' : calculateStack.push(a-b); break;
                    case '*' : calculateStack.push(a*b); break;
                    case '/' : calculateStack.push(a/b); break;
                }
            }
        }
        return calculateStack.pop();
    }

    /**
     * 比较运算符的优先级
     * @param a：运算符A
     * @param b：运算符B
     * @return 比较结果
     */
    public boolean compareOperator(char a, char b) {
        boolean flag = false;
        if ((a == '*' || a == '/') && (b == '+' || b == '-')){
            flag = true;
        }
        return flag;
    }

    public String getS2() {
        return s2;
    }

    public static void main(String[] args) {
        String str = new String("((10*(6/(9-3)*11))+17)+5#");
        MyRPN myRPN = new MyRPN();
        myRPN.makeRPN(str);
        System.out.println(myRPN.getS2());
        System.out.println(myRPN.calculateRPN());
    }

}