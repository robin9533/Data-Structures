package com.regnant.rohit.programtest2;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(40);
		l.add(50);
		l.add(55);
		l.add(54);
		l.add(80);
		l.display();
		l.remove(50);
		l.display();
		l.remove(40);
		l.display();
		l.size(); l.display();
	}
}
