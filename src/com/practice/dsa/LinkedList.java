package com.practice.dsa;



public class LinkedList {

	static class Node{
		int value;
		Node next;
		Node(int value)
		{
			this.value=value;
			this.next=null;
		}
	}
	Node head;		// Head will be the first Node of a LinkedList
	
	
	// In LinkedList insertion and deletion is done at the end that is the new node is added after the last node of the given Linked List. 
	public static LinkedList insert(LinkedList list, int data)
	{
		Node new_node = new Node(data);
		// Case 1: Check if head is null means List is empty or not
		// if empty add the node and make it as Head
		if(list.head==null)
			list.head=new_node;
		
		// Case 2: If it is not empty traverse the list to end of the list and add the node at the last of the list
		else
		{
			Node last = list.head;
			
			while(last.next!=null) // Traversing to the end of the list
				last=last.next;
			
			last.next = new_node;
		}
		return list;
	}
	
	public static LinkedList delete(LinkedList list, int key)
	{
		Node currentNode = list.head;
		Node previousNode = null;
		// Case 1: Data to be deleted is found at head
		if(currentNode!=null && key==currentNode.value)
		{
			list.head=currentNode.next;
			return list;
		}
		
		//Case 2: Data is not found at the head, find the previous and current node of the key/data to be deleted 
		while(currentNode!=null && key!=currentNode.value)
		{
			previousNode=currentNode;
			currentNode=currentNode.next;
		}
		// if key is available it will be pointed by currentNode and currentNode should not be null
		// update the previous node's next node value to current node's next
		if(currentNode!=null)
		{
			previousNode.next=currentNode.next;
			System.out.println(key + " deleted");
		}
		
		//Case 3: Key is not present in the list
		if(currentNode==null)
			System.out.println(key +" is not present in list");
		
		return list;
	}
	public static void printList(LinkedList list)
	{
		Node current_node = list.head;
		System.out.print("[ ");
		while(current_node!=null)
		{
			System.out.print(current_node.value + " ");
			current_node=current_node.next;
		}
		System.out.println(" ]");
	}
	
	public static LinkedList insertMiddle(LinkedList list, int data)
	{
		Node new_node = new Node(data);
		Node fast=list.head.next;
		Node slow=list.head;
		if(list.head==null)
			list.head=new_node;
		else
		{
			while(fast!=null && fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
			new_node.next=slow.next;
			slow.next=new_node;
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		// Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
        list.insert(list, 9);
        list=insertMiddle(list, 11);
        list=insertMiddle(list, 12);
        list=insertMiddle(list, 13);
        
   
        // Print the LinkedList 
        printList(list); 
        
        list.delete(list, 5);
        
        printList(list); 
	}
	
	

}
