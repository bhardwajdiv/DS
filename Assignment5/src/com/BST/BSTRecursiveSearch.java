package com.BST;

public class BSTRecursiveSearch {

    static Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {

        Node root = null;
        int[] values = {40, 20, 60, 10, 30, 50, 70};

        for (int v : values)
            root = insert(root, v);

        System.out.println("Search 30: " + search(root, 30));
        System.out.println("Search 90: " + search(root, 90));
    }
}

