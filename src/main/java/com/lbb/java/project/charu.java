package com.lbb.java.project;

import java.util.Arrays;

/**
 * @Author libingbing
 * @Date 2020-05-23 14:47
 * @Description
 */
public class charu {

    public static void main(String[] args) {

        sort3(new int[]{1, 3, 5, 2, 4, 6});
    }

    public static void sort(int[] arr) {
        // 1 3 5 2 4 6
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sort2(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sort3(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sort4(int[] arr) {
        //5 6 2 1 6 8 9 12

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+3]){

            }
        }
    }
}
