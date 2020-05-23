package com.lbb.java.project;

import java.util.Arrays;

/**
 * @Author libingbing
 * @Date 2020-05-23 10:29
 * @Description
 */
public class maopao {

    public static void main(String[] args) {
        sort(new int[]{1,3,2,9,-1});
    }

    //时间复杂度 n(n2) //空间复杂度 n(1)

    public static void sort (int[] arr){

        // 1 3 5 9 -1
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
