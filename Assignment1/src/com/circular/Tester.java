package com.circular;

public class Tester {
	public static void main(String[] args) {
        List list = new List();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        list.insertAtBeginning(5);
        list.display();

        list.insertAfter(20, 25);
        list.display();

        list.delete(10);
        list.display();

        list.delete(5);
        list.display();

        list.delete(30);
        list.display();
    }
}
