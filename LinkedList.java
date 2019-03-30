package com.regnant.rohit.programtest2;

public class LinkedList {
	Node head = null;
	Node current = null;
	//Node n1;

	void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextNode = n;
			current = n;
		}
	}
	
	void display() {
		Node n = head;
		System.out.println("elements in node are:");
		while (n!= null) {
		System.out.println(n.data);
			n = n.nextNode;
		}
		//System.out.println("Node data current.data);
		
	}
	
	void display2() {
		Node n = current;
		while (n.nextNode== null) {
		System.out.println("Node data is :"+current.data);
			n = n.nextNode;
		}
	}
	
	void remove(int data) {
		Node t = null;
		Node n = head;
		while(n!=null) {
			if(head.data==data) {
				head=head.nextNode;
				break;}
			if(n.data==data) {
			t.nextNode=n.nextNode;
			break;
			}
			t=n;
			n=n.nextNode;
		}		
	}
		/*int size() {
			Node n = head;
			int i =0;
			while(n!=null)
			{
				System.out.println("Print the number of number:" + i);
			}
			i++;
			{
				return i;
			}*/
	
		int size() {
			Node n = head;
			int s = 0;
			while (n != null) {
			s++;
			n = n.nextNode;
			}
			return s;
			}

			int max() {
			Node n=head;
			int mx=head.data;
			while(n!=null) {
			if(n.data>mx) {
			mx=n.data;
			}
			n=n.nextNode;
			}
			return mx;
			}

			int min() {
			Node n=head;
			int mn=head.data;
			while(n!=null) {
			if(n.data<mn) {
			mn=n.data;
			}
			n=n.nextNode;
			}
			return mn;
			}
		
}
