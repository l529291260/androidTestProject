/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication;

import android.test.AndroidTestCase;

import com.baidu.myapplication.pattern.Expression;

import org.junit.Test;

/**
 * Created by liuwenbo01 on 2016/8/18.
 */
public class ExpressionTest extends AndroidTestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    @Test
    public void testStartExpression() {
        Expression.doExpression2("10.23.45.67");
        //Expression.doExpression2("1.23.45.");
    }
}
