/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.algorithm.sort;

/**
 * Created by liuwenbo01 on 2016/7/26.
 */
public class Node {

    Object person;                            // 人
    Node nextNode;        // 该对象（'人'）保存的下一个对象的引用

    // 获取当前实体对象（'人'）
    public Object getPerson(){
        return this.person;
    }

    // 获取下一个实体
    public Node getNextNode(){
        return this.nextNode;
    }

    // 构造方法
    public Node (Object p, Node ep){
        this.person = p;
        this.nextNode = ep;
    }
}
