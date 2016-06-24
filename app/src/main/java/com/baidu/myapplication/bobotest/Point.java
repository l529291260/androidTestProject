/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.bobotest;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by liuwenbo01 on 2016/6/1.
 */
public class Point<T> {
    private T var ; // var的类型由T指定，即：由外部指定
    public T getVar(){ // 返回值的类型由外部决定
        return var ;
    }
    public void setVar(T var){ // 设置的类型也由外部决定
        this.var = var ;
    }

    public <T> T echo(T name) {
        return name;
    }

    public static int numElementsIncommon(Set s1, Set s2) {
        int result =0 ;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result ++ ;
            }
        }
        return result;
    }

    public static int numNewElementsIncommon(Set<?> s1, Set<?> s2) {
        int result =0 ;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result ++ ;
            }
        }
        s1.add(null);


        return result;
    }

    public void testAaryy() {
        Object[] objectArray = new Long[100];
        objectArray[0] = "hahaha";
    }

}
