package com.practice.dsa.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25,63,45,52,32,19};
		insertionSort(arr, arr.length);
		for(int ae : arr)
			System.out.print(ae+ " ");

	}
	public static void insertionSort(int[] arr, int l)
	{
		for(int i=1;i<l;i++)
		{
			int j=i-1;
			int key=arr[i];
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];		// Move element to one index if it is greater than key
				j--;
			}
			arr[j+1]=key;				// update the j+1 element by key
		}
	}

}
