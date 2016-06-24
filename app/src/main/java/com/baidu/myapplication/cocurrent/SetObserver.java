/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.cocurrent;

import com.baidu.myapplication.cocurrent.ObservableSet;

/**
 * Created by liuwenbo01 on 2016/6/20.
 */
public interface SetObserver<E> {
    void added(ObservableSet<E> set, E element);
}
