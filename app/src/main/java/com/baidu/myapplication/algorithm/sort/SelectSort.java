/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.algorithm.sort;

/**
 * Created by liuwenbo01 on 2016/7/26.
 */
public class SelectSort {

    // 从第一轮，找寻出来最小的那一个

    public static void selectSort(int[] arr) {

        if(arr == null || arr.length == 0)
            return ;

        for (int i = 0 ; i < arr.length - 1 ; i++) {
            for (int j = i + 1 ; j < arr.length ; j ++) {
                if (arr[i] > arr[j]) {
                    swap(arr, j , i);
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
