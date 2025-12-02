/*In singly linear list implement following operations. i. insert a new node after a given node(data) ii.
 insert a new node before a given node(data)*/

package com.assign;

class List {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void insertAfter(int target, int newData) {
        Node temp = head;

        while (temp != null && temp.data != target) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node with data " + target + " not found.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertBefore(int target, int newData) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == target) {
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != target) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node with data " + target + " not found.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
