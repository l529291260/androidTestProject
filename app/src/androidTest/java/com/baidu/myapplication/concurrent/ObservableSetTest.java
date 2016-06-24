/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.concurrent;

import android.test.AndroidTestCase;
import android.util.Log;

import com.baidu.myapplication.cocurrent.ObservableSet;
import com.baidu.myapplication.cocurrent.SetObserver;

import org.junit.Test;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuwenbo01 on 2016/6/20.
 */
public class ObservableSetTest extends AndroidTestCase {

    private final String Tag = "ObservableSetTest";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testNotifyElementAdded1() {
        ObservableSet<Integer> set =
                new ObservableSet(new HashSet<Integer>());

        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                Log.e(Tag, element + "");
            }
        });

        for (int i = 0 ; i < 100; i++) {
            set.add(i);
        }

    }


    @Test
    public void testNotifyElementAdded2() {
        ObservableSet<Integer> set =
                new ObservableSet(new HashSet<Integer>());

        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                Log.e(Tag, element + "");
                if (element == 23) {
                    set.removeObserver(this);
                }
            }
        });

        for (int i = 0 ; i < 100; i++) {
            set.add(i);
        }

    }


    // 死锁的例子
    @Test
    public void testNotifyElementAdded3() {
        ObservableSet<Integer> set =
                new ObservableSet(new HashSet<Integer>());
        SetObserver<Integer> ss = new MySetObserver<>();
        set.addObserver(ss);

        for (int i = 0 ; i < 100; i++) {
            set.add(i);
        }

    }



    class MySetObserver<E> implements SetObserver<E> {

        @Override
        public void added(final ObservableSet<E> set, E element) {
            Log.e(Tag, element + "");
            if (element instanceof Integer ) {
                ExecutorService executorService = null ;
                try {
                    executorService =
                            Executors.newSingleThreadExecutor();
                    executorService.submit(new Runnable() {
                        @Override
                        public void run() {
                            set.removeObserver(MySetObserver.this);
                        }
                    });
                } catch (Exception e) {
                    Log.e(Tag, e.getMessage());
                    e.printStackTrace();
                    throw new AssertionError(e.getCause());

                } finally {
                    executorService.shutdown();

                }

            }
        }
    }
}
