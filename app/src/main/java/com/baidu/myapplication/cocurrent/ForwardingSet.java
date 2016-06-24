/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.cocurrent;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by liuwenbo01 on 2016/6/20.
 */
public class ForwardingSet<E>  implements Set<E> {

    private final Set<E> s;
    public ForwardingSet(Set<E> s) {
        this.s = s;
    }

    @Override
    public boolean add(E object) {
        return s.add(object);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return s.addAll(collection);
    }

    @Override
    public void clear() {
        s.clear();

    }

    @Override
    public boolean contains(Object object) {
        return s.contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return s.containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    @NonNull
    @Override
    public Iterator<E> iterator() {
        return s.iterator();
    }

    @Override
    public boolean remove(Object object) {
        return s.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return s.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return s.retainAll(collection);
    }

    @Override
    public int size() {
        return s.size();
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return s.toArray();
    }

    @NonNull
    @Override
    public <T> T[] toArray(T[] array) {
        return s.toArray(array);
    }
}
