package com.practice.dsa;

public class StackLinkedList {
	
	Node top;
	
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	void push(int data)
	{
		Node newNode = new Node(data);
		if(top==null)
			top=newNode;
		else
		{
			newNode.next=top;
			top=newNode;
		}
	}
	
	int pop()
	{
		if(top==null)
		{
			System.out.println("Stack UnderFlow");
			return Integer.MIN_VALUE;
		}
		else
		{
			int popped = top.data;
			top=top.next;
			return popped;
		}
	}
	
	void printStack()
	{
		System.out.print("[ ");
		for(Node n=top;n!=null; n=n.next)
			System.out.print(n.data+" ");
		System.out.println("]");
	}
	int peek()
	{
		if(top==null)
			return Integer.MIN_VALUE;
		else
			return top.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList sl = new StackLinkedList();
		System.out.println(sl.peek());
		sl.pop();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.printStack();
		sl.pop();
		System.out.println(sl.peek());
	}

}
