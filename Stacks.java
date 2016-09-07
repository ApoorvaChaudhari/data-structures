package com.capco.simpleexamples;

public class Stacks {
	Node top;
	
	class Node {
		int data;
		Node next;
		
		void setData(int d){
			this.data = d;
		}
		
		void setNext(Node n){
			this.next = n;
		}
		
		int getData(){
			return this.data;
		}
		
		Node getNext(){
			return this.next;
		}
	}
	
	void pushNode(int d) {
		if(top == null) {
			Node n = new Node();
			n.setData(d);
			n.setNext(null);
			top = n;
		} else {
			Node n = new Node();
			n.setData(d);
			n.setNext(top);
			top = n;
		}
	}
	
	int popNode() {
		int n;
		if(top == null) {
			System.out.println("Cannot pop from an empty stack");
			throw new UnsupportedOperationException("Can not pop an empty stack");
		} else {
			n = top.getData();
			top = top.getNext();
			return n;
		}
	}
	
	void printStack(Stacks s) {
		Node n = new Node();
		n = s.top;
		while (n!=null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
	
	public static void main(String[] args) {
		Stacks s = new Stacks();
		s.pushNode(10);
		s.pushNode(5);
		s.pushNode(22);
		
		s.printStack(s);
		s.popNode();
		s.popNode();
		//s.printStack(s);
		s.popNode();
		s.popNode();
		
		s.pushNode(45);
		s.pushNode(54);
		s.pushNode(12);
	}

}
