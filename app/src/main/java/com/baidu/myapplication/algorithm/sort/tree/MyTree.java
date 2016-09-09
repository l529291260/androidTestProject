/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.myapplication.algorithm.sort.tree;

/**
 * Created by liuwenbo01 on 2016/7/27.
 */
public class MyTree extends Tree {
    Node root;

    // 默认中序遍历作为顺序节点
    @Override
    public void insert(Node node) {
        int index = node.iData;
        if ( root == null ) {
            root = node;
            return;
        }

        Node current = root;

        while (true) {
            if ( current == null ) {
                current = node;
                return;
            }
            if (current.iData > node.iData) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
    }

    @Override
    public boolean delete(int iData) {
        Node current = root;
        Node parent ;
        boolean isLeftChild = true ;
        boolean isHead;

        while (true) {
            parent = current;
            // 没找到相应的current
            if ( current == null ) {
                return false;
            }

            if ( current.iData > iData ) {
                current = current.left;
                isLeftChild = true;
            } else if (current.iData > iData) {
                current = current.right;
                isLeftChild = false;
            } else if (current.iData == iData ) {
                break;
            }
        }

        if (root.equals(current)) {
            root = null;
        }
        if (isLeftChild) {
            parent.left = null;
        } else {
            parent.right = null;
        }
        return  true;
    }

    @Override
    public boolean update(int iData, int fData) {

        Node current = root;
        while (true) {
            if ( current == null ) {
                return false;
            }

            if ( current.iData > iData ) {
                current = current.left;
            } else if (current.iData > iData) {
                current = current.right;
            } else if (current.iData == iData ) {
                break;
            }
        }

        current.fData = fData;
        return true;

    }

    @Override
    public Node find(int iData) {

        Node current = root;
        while (true) {
            if ( current == null ) {
                return null;
            }

            if ( current.iData > iData ) {
                current = current.left;
            } else if (current.iData > iData) {
                current = current.right;
            } else if (current.iData == iData ) {
                return current;
            }
        }

    }

    @Override
    public void displayTree() {

    }

    public void preOderTree(Node node) {
        if (node != null) {
            operate(node);
        } else {
            return;
        }
        preOderTree(node.left);
        preOderTree(node.right);
    }

    public void preOderTreeNoDiGui(Node node) {
        Node current = node;
        while (true) {
            if (current == null) {
                break;
            }

        }
    }

    public void middleOderTree(Node node) {
        middleOderTree(node.left);
        if (node != null) {
            operate(node);
        } else {
            return;
        }
        middleOderTree(node.right);
    }

    public void backOderTree(Node node) {
        backOderTree(node.left);
        backOderTree(node.right);
        if (node != null) {
            operate(node);
        } else {
            return;
        }
    }

    private void operate(Node node) {

    }
}
