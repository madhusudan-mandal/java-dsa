package com.practice.dsa;

public class StackArray {
	final int size=10;
//	public StackArray(int size)
//	{
//		this.size=size;
//	}
	int top=-1;
	int[] stack = new int[size];
	
	public int[] push(int data)
	{
		if(top==size-1)
		{
			System.out.println("Stack OverFlow.");
			return stack;
		}
		top++;
		stack[top]=data;
//		System.out.println(data);
		return stack;		
	}
	
	public int[] pop()
	{
		if(top==-1)
		{
			System.out.println("Stack UnderFlow.");
			return stack;
		}
		else
		{
			top--;
			return stack;
		}
	}
	
	public int peek()
	{
		if(this.top==-1)
			return -1;
		else
			return this.stack[top];
	}
	public boolean isEmpty()
	{
		if(this.top==-1)
			return true;
		else
			return false;
	}
	public void printStack()
	{
		System.out.print("[ ");
		for(int i=top;i>-1;i--)
			System.out.print(this.stack[i] + " ");
		System.out.println("]");
	}
	public int length()
	{
		return this.top+1;
	}
	public int capacity()
	{
		return this.size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray sa = new StackArray();
		sa.pop();
		System.out.println(sa.isEmpty());
		sa.push(10);
		sa.push(20);
		sa.push(30);
		sa.push(40);
		sa.push(50);
		sa.push(60);
		sa.push(70);
		sa.push(80);
		sa.push(90);
		sa.push(100);
		sa.push(110);
		sa.printStack();
		System.out.println(sa.length());
		
		sa.pop();
		sa.printStack();
		
		System.out.println(sa.peek());
		System.out.println(sa.isEmpty());
		System.out.println(sa.length());
		
		System.out.println(sa.capacity());
		
		StackArray sa1 = new StackArray();
		System.out.println(sa1.isEmpty());
		sa1.push(101);
		sa1.push(201);
		sa1.push(302);
		sa1.push(402);
		sa1.push(502);
		sa1.push(602);
		sa1.printStack();
		System.out.println(sa1.length());
		
		sa1.pop();
		sa1.printStack();
		
		System.out.println(sa1.peek());
		System.out.println(sa1.isEmpty());
		System.out.println(sa1.length());
		
		System.out.println(sa1.capacity());
	}

}
