/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.algorithm.sort;

/**
 * Created by liuwenbo01 on 2016/7/26.
 */
public class BubbleSort {

    // 从第一个开始比较，比较一轮之后，把 an 选择出来；然后继续遍历
    // 第一个外循环控制遍历多少次
    // 第二个遍历进行比照。

    public static void bubbleSort(int[] arr) {

        if(arr == null || arr.length == 0)
            return ;

        for (int i = 0 ; i < arr.length -1 ; i++) {
            for (int j = 0 ; j < arr.length - 1 - i; j ++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j , j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
