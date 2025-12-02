package com.BST;

public class BSTSuccessor {

    static Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    // Find minimum value in subtree
    static Node minValue(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    static Node findSuccessor(Node root, int key) {
        Node successor = null;

        while (root != null) {
            if (key < root.data) {
                successor = root; 
                root = root.left;
            }
            else if (key > root.data) {
                root = root.right;
            }
            else {  
                // Node found
                if (root.right != null)
                    return minValue(root.right);
                break;
            }
        }

        return successor;
    }

    public static void main(String[] args) {

        Node root = null;
        int[] values = {40, 20, 60, 10, 30, 50, 70};

        for (int v : values)
            root = insert(root, v);

        int key = 30;
        Node succ = findSuccessor(root, key);

        if (succ != null)
            System.out.println("Successor of " + key + " is: " + succ.data);
        else
            System.out.println("No successor found!");
    }
}
