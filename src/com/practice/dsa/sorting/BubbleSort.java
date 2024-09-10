package com.practice.dsa.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25,63,45,52,32,19};
		bubbleSort(arr, arr.length);
		for(int ae : arr)
			System.out.print(ae+ " ");
	}

	private static void bubbleSort(int[] arr, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
