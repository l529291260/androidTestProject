/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by liuwenbo01 on 2016/5/26.
 */
public class MyTextView2 extends TextView {
    public MyTextView2(Context context) {
        super(context);
    }

    public MyTextView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        System.out.println("MyTextView2---onTouch---DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        System.out.println("MyTextView2---onTouch---MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        System.out.println("MyTextView2---onTouch---UP");
                        break;
                    default:
                        break;
                }
                return false;
            }
        });

        setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("MyTextView2 clicked!");
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("MyTextView2---onTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("MyTextView2---onTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("MyTextView2---onTouchEvent---UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("MyTextView2---dispatchTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("MyTextView2---dispatchTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("MyTextView2---dispatchTouchEvent---UP");
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(event);
    }

}
