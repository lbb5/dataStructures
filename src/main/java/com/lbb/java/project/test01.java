package com.lbb.java.project;

/**
 * @Author libingbing
 * @Date 2020-05-22 11:09
 * @Description 时间复杂度和空间复杂度测试
 */
public class test01 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int sum =0;
        for (int i = 0; i < 100000000; i++) {
            sum+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(sum+"---------------" + (end-start));
    }

}
