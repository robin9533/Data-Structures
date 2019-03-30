package com.regnant.rohit.programtest2;

public class MainDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList d = new DoubleLinkedList();
		d.add(45);
		d.add(50);
		d.add(60);
		d.add(70);
		d.add(88);
		//System.out.println(d.current.data);
		d.display();
		d.remove();
		d.remove();d.display();

	}

}
