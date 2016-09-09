/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication;

import android.test.AndroidTestCase;
import android.util.Log;

import com.baidu.myapplication.memery.Person;

import org.junit.Test;

/**
 * Created by liuwenbo01 on 2016/8/19.
 */
public class PersonTest extends AndroidTestCase {

    private final String TAG = "PersonTest";
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testMemory() {
        Person p = new Person("bobo", 1);
        changePerson(p);
        Log.e(TAG , p.hashCode() + "");
        Log.e(TAG , p.name);
    }

    private void changePerson(Person person){

        Log.e(TAG , person.hashCode() + "");
        person = new Person("kongyan", 2);
    }
}
