/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.algorithm.sort.tree;

/**
 * Created by liuwenbo01 on 2016/7/27.
 */
public abstract class Tree {

    public abstract  void insert(Node node);
    public abstract boolean delete(int iData);
    public abstract boolean update(int iData, int fData);
    public abstract Node find(int iData);
    // 遍历
    public abstract void displayTree();
}
