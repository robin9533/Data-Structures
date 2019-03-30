package com.regnant.rohit.programtest2;


public class DoubleLinkedList {
	Node head = null;
	Node current = null;
	//Node old = null;
	//Node n1;

	void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			//old=n;
			current = n;
		} else {
			current.nextNode = n;
			n.previousNode=current;
			//old=current;
			current = n;
		}
		//System.out.println("Node Data :"+ n.data);
	}
	
	void remove() {
		//Node n = current;
		  //current.previousNode=null;
		   /*old.nextNode= null;
		   old=current;
		*/   current=current.previousNode;
		    current.nextNode=null;
		}


	void display() {
		Node n = head;
		System.out.println("Node data is :");
		while (n!= null) {
		System.out.println(n.data);
			n = n.nextNode;
		}
		//System.out.println("Node data is :"+current.data);
	}
	void displayRev() {
		Node n = current;
		while (n!= null) {
		System.out.println("Node data in reverse are :"+ n.data);
			n = n.previousNode;
		}
		//System.out.println("Node data is :"+current.data);
	}
	}

