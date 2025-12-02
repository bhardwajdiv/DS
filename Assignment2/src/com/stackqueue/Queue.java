package com.stackqueue;
public class Queue {
    static class Node {
        int data;
        Node next;
        Node(int value) { data = value; }
    }

    private Node front, rear;

    public void enqueue(int value) {
        Node newnode = new Node(value);
        if (rear == null) {
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Empty");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return val;
    }

    public void display() {
        Node trav = front;
        System.out.print("Queue: ");
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();
    }
}
