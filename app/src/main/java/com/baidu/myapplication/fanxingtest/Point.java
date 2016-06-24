/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.fanxingtest;

/**
 * Created by liuwenbo01 on 2016/6/1.
 */
public class Point <T> {
    private T var ; // var的类型由T指定，即：由外部指定
    public T getVar(){ // 返回值的类型由外部决定
        return var ;
    }
    public void setVar(T var){ // 设置的类型也由外部决定
        this.var = var ;
    }
}
