package com.circularqueue;
public class circularQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public circularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[(front + i) % capacity] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        circularQueue q = new circularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}
