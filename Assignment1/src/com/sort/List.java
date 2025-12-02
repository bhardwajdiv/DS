/* Write a function which will insert values in sorted order into linked list*/

package com.sort;

public class List {
	class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
	public void insertInSortedOrder(int data) {
	    Node newNode = new Node(data);

	    if (head == null || head.data >= data) {
	        newNode.next = head;
	        head = newNode;
	        return;
	    }

	    Node current = head;

	    while (current.next != null && current.next.data < data) {
	        current = current.next;
	    }
	    newNode.next = current.next;
	    current.next = newNode;
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
