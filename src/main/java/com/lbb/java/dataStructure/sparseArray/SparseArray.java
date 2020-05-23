package com.lbb.java.dataStructure.sparseArray;

import java.io.*;

/**
 * @Author libingbing
 * @Date 2020-05-23 20:15
 * @Description 稀疏数组的代码实现
 */
public class SparseArray {

    public static void main(String[] args) {
        //创建一个原始数组 11*11
        //0 表示没有子 1表示白子 , 2表示黑子
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        arr[5][6] = 1;
        System.out.println("构建原始数组");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("开始构建新的稀疏数组");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum++;
                }
            }
        }

        System.out.println(sum);

        //初始化稀疏数组
        int[][] SparseArray = new int[sum + 1][3];
        SparseArray[0][0] = 11;
        SparseArray[0][1] = 11;
        SparseArray[0][2] = sum;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    count++;
                    SparseArray[count][0] = i;
                    SparseArray[count][1] = j;
                    SparseArray[count][2] = arr[i][j];
                }
            }
        }

        //打印稀疏数组
        System.out.println("---------------打印稀疏数组-------");
        for (int i = 0; i < SparseArray.length; i++) {
            for (int j = 0; j < SparseArray[i].length; j++) {
                System.out.print(SparseArray[i][j] + " ");
            }
            System.out.println();
        }
        //将稀疏数组持久化到磁盘中
        System.out.println(">>>>>>>>>>>>>>>稀疏数组开始写入磁盘");
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("data.txt"));
            for (int i = 0; i < SparseArray.length; i++) {
                for (int j = 0; j < SparseArray[i].length; j++) {
                    out.write(SparseArray[i][j] + "\t");
                }
                out.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(">>>>>>>>>>>>>>>写入磁盘完毕");


        System.out.println("-------------将稀疏数组还原成原数组------------");


        int rows = SparseArray[0][0]; //原数组的行数
        int columns = SparseArray[0][1]; //原数组的行数
        int sum2 = SparseArray[0][2];
        int[][] newArray = new int[rows][columns];
        //11 11 3
        //1 2 1
        //2 3 2
        //5 6 1
        for (int i = 1; i < SparseArray.length; i++) {
            newArray[SparseArray[i][0]][SparseArray[i][1]] = SparseArray[i][2];
        }


        System.out.println("----------------开始打印新数组");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
