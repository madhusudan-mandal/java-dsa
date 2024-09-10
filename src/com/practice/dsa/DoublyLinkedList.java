package com.practice.dsa;

public class DoublyLinkedList {
	
	static class Node{
		Node next;
		Node prev;
		int value;
		
		Node(int data)
		{
			this.value=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	Node head;
	Node tail;
	
	//Traversal of DoublyLinkedList
	// Forward Traversing
	public static void forwardTraversing(DoublyLinkedList list)
	{
		Node current = list.head;
		if(list.head==null)
			System.out.println("Empty List");
		else if(list.head==list.tail)
			System.out.println("[ " + current.value +" ]");
		else
		{
			System.out.print("[ ");
			while(current!=null)
			{
				System.out.print(current.value +" ");
				current=current.next;
			}
			System.out.println("]");
		}
	}
	
	//Backward Traversing
	public static void backwardTraversing(DoublyLinkedList list)
	{
		Node current = list.tail;
		if(list.tail==null)
			System.out.println("Empty List");
		else if(list.head==list.tail)
			System.out.println("[ " + current.value +" ]");
		else
		{
			System.out.print("[ ");
			while(current!=null)
			{
				System.out.print(current.value+" ");
				current=current.prev;
			}
			System.out.println("]");
		}
		
	}
	
	//Insert the key at the end
	public static DoublyLinkedList insertAtEnd(DoublyLinkedList list, int data) {
		Node new_node = new Node(data);
		if(list.head==null )
		{
			list.head=new_node;
			list.tail=new_node;
		}
		else
		{
			new_node.prev=list.tail;
			list.tail.next=new_node;
			list.tail=new_node;
		}
		
		return list;
	}
	
	//Insert the key at the beginning
	public static DoublyLinkedList insertAtBeginning(DoublyLinkedList list, int data)
	{
		Node new_node = new Node(data);
		if(list.head==null)
		{
			list.head=new_node;
			list.tail=new_node;	
		}
		else
		{
			new_node.next=list.head;
			list.head.prev=new_node;
			list.head=new_node;
		}
		return list;
	}
	
	//Insert after a given key
	public static DoublyLinkedList insertAfter(DoublyLinkedList list,int key, int data)
	{
		
		Node new_node = new  Node(data);
		Node current = list.head;
		if(list.head==null)
			System.out.println("EMPTY List");
		else {
			while(current!=null && key!=current.value)
				current = current.next;
			if(current==null)
				System.out.println("KEY " + key + " not found.");
			new_node.prev = current;
			new_node.next = current.next;
			if (current.next != null) {
			        current.next.prev = new_node;
			   }
			current.next = new_node;
		}
		
		return list;
	}
	
	public void deleteAtEnd()
	{
		if(this.tail==null)
			System.out.println("List is EMPTY.");
		else if(this.tail==this.head)
		{
			this.tail=null;
			this.head=null;
		}
		else
		{
			this.tail=this.tail.prev;
			this.tail.next=null;
		}
	}
	
	public void deleteAtStart()
	{
		if(this.head==null)
			System.out.println("EMPTY list.");
		else if(this.head==this.tail)
		{
			this.head=null;
			this.tail=null;
		}
		else
		{
			this.head=this.head.next;
			this.head.prev=null;
		}
	}
	
	public void deleteKey(int key)
	{
		Node current=this.head;
		if(this.head==null)
			System.out.println("EMPTY LIST");
		else
		{
			while(current!=null && current.value!=key)
				current=current.next;
			if(current==null)
				System.out.println("KEY " + key + " not found.");
			else
			{
				current.next.prev=current.prev;
				current.prev.next=current.next;
			}
		}
	}
	public int length()
	{
		Node current=this.head;
		int count=0;
		while(current!=null)
		{
			++count;
			current=current.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyLinkedList list2 = new DoublyLinkedList();
		list.forwardTraversing(list);
		list.backwardTraversing(list);
		list.insertAtBeginning(list, 5);
		
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 4);
		list.insertAtEnd(list, 6);
		list.insertAtEnd(list, 3);
		
		list.insertAtBeginning(list, 8);
		list.insertAtBeginning(list, 7);
		
		list.forwardTraversing(list);
		list.backwardTraversing(list);
		
		list.insertAfter(list,6, 17);
		list.forwardTraversing(list);
		list.insertAfter(list,4, 18);
		list.forwardTraversing(list);
		
//		list.insertAfter(list2,18, 17);
		
		list.deleteAtEnd();
		list.forwardTraversing(list);
		list.deleteAtEnd();
		list.forwardTraversing(list);
		list.deleteAtEnd();
		list.deleteAtStart();
		list.deleteKey(1);

		list.forwardTraversing(list);
		
		System.out.println(list.length());
	}

}
