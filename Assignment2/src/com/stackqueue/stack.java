package com.stackqueue;
public class stack {
    static class Node {
        int data;
        Node next;
        Node(int value) { data = value; }
    }

    private Node top;

    public void push(int value) {
        Node newnode = new Node(value);
        newnode.next = top;
        top = newnode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Empty");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public void display() {
        Node trav = top;
        System.out.print("Stack: ");
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        st.pop();
        st.display();
    }
}
