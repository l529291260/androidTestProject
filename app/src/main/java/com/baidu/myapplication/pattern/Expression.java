/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.pattern;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liuwenbo01 on 2016/8/17.
 */
public class Expression {
    /*
    * \w \s .
    *
    *
    *
    * */
    private static String TAG = "Expression";

    public static void doExpression() {

        Pattern p = Pattern.compile("DR(\\d+)(New)R(\\d)");
        Matcher m = p.matcher("DR102NewR2");
        boolean found = m.find();
        if (found) {

            Log.e(TAG, "Found value: " + m.groupCount());
            Log.e(TAG, "Found value: " + m.group(0));
            Log.e(TAG, "Found value: " + m.group(1));
            Log.e(TAG, "Found value: " + m.group(2));
            Log.e(TAG, "Found value: " + m.group(3));

        }
    }

    public static void doExpression1() {

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        // 贪婪匹配，匹配尽量多的字符
        String pattern = "(.*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            Log.e(TAG, "Found value: " + m.groupCount());
            Log.e(TAG, "Found value: " + m.group(0));
            Log.e(TAG, "Found value: " + m.group(1));
            Log.e(TAG, "Found value: " + m.group(2));
            Log.e(TAG, "Found value: " + m.group(2));
        } else {
            Log.e(TAG, "NO MATCH");
        }

    }

    public static void doExpression2(String ip) {

        // 按指定模式在字符串查找
        // 贪婪匹配，匹配尽量多的字符
        String pattern = "(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(ip);
        if (m.find()) {
            Log.e(TAG, "Found value: " + m.groupCount());
            Log.e(TAG, "Found value: " + m.group(0));
            Log.e(TAG, "Found value: " + m.group(1));
            Log.e(TAG, "Found value: " + m.group(2));
            Log.e(TAG, "Found value: " + m.group(3));
            Log.e(TAG, "Found value: " + m.group(4));
        } else {
            Log.e(TAG, "NO MATCH");
        }

    }


}
