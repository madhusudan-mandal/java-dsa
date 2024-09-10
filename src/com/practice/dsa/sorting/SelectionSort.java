package com.practice.dsa.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25,63,45,52,32,19};
		selectionSort(arr, arr.length);
		for(int ae : arr)
			System.out.print(ae+ " ");
	}
	
	public static void selectionSort(int[] arr, int length)
	{
		for(int i=0; i<length-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<length;j++)
			{
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}

}
