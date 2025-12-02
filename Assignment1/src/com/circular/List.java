/* Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
 all operations. (Comparision can be done later)*/

package com.circular;

class List {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node tail;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    public void insertAfter(int target, int data) {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next;

        do {
            if (current.data == target) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;

                if (current == tail) {
                    tail = newNode;
                }
                return;
            }
            current = current.next;
        } while (current != tail.next);

        System.out.println("Target not found!");
    }

    public void delete(int target) {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next;
        Node prev = tail;

        do {
            if (current.data == target) {
                if (current == tail && current == tail.next) {
                    tail = null;
                } else if (current == tail) {
                    prev.next = current.next;
                    tail = prev;
                } else if (current == tail.next) {
                    prev.next = current.next;
                    tail.next = prev.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }

            prev = current;
            current = current.next;

        } while (current != tail.next);

        System.out.println("Value not found!");
    }

    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next;

        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);

        System.out.println("(Head)");
    }
}

