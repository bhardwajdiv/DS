package com.BST;

public class BSTLevel {

    static Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    static int findLevel(Node root, int key, int level) {
        if (root == null) return -1;

        if (root.data == key)
            return level;

        if (key < root.data)
            return findLevel(root.left, key, level + 1);
        else
            return findLevel(root.right, key, level + 1);
    }

    public static void main(String[] args) {

        Node root = null;
        int[] values = {40, 20, 60, 10, 30, 50, 70};

        for (int v : values)
            root = insert(root, v);

        int key = 50;

        int level = findLevel(root, key, 1);

        if (level != -1)
            System.out.println("Level of " + key + " is: " + level);
        else
            System.out.println("Node not found");
    }
}

