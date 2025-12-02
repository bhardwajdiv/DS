package com.assign;

public class Tester {
	 public static void main(String[] args) {
	        List list = new List();

	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtEnd(30);
	        list.insertAtEnd(40);

	        System.out.println("List:");
	        list.display();

	        list.insertAfter(20, 25);
	        System.out.println("After inserting: ");
	        list.display();

	        list.insertBefore(30, 28);
	        System.out.println("Before inserting: ");
	        list.display();
	    }
}