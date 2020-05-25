package com.lbb.java.dataStructure.stack;

/**
 * @Author libingbing
 * @Date 2020-05-25 9:23
 * @Description
 */
public class caluculatorDemo {

    public static void main(String[] args) {
        calculator calculator = new calculator();
        String str="1*2*3+2-1";
        System.out.println(calculator.caluculate(str));
    }
}
