package com.lbb.java.project;

import java.util.Arrays;

/**
 * @Author libingbing
 * @Date 2020-05-23 10:52
 * @Description
 */
public class xuanze {
    public static void main(String[] args) {
        sort(new int[]{1,3,2,6,9,11,10});
    }

    public static void sort(int[] arr) {
        //1 3 2 6 9 11 10
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[min] > arr[j]) {
                    int temp = min;
                    min = j;
                    j = temp;
                }
            }
            int a = arr[min];
            arr[min] = arr[i];
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
