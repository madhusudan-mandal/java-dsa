package com.practice.dsa.sorting;

public class QuickSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {55,58,45,42,38,36,50,48};
		QuickSort qs = new QuickSort();
		qs.printArray(arr);
		qs.quickSort(arr, 0, arr.length-1);
		qs.printArray(arr);
	}

	private void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end)
		{
			int p=partition(arr, start,end);
			quickSort(arr, start, p-1);
			quickSort(arr, p+1, end);
		}
	}

	//pivot is start element of array
	private int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i=start;
		for(int j=start+1; j<=end;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
			swap(arr, i, start);
			return i;
	}
	
		
//	private int partition(int[] arr, int start, int end) {
//		int pivot = arr[end];
//		int i=start;
//		for(int j=start; j<end; j++)
//		{
//			if(arr[j]<=pivot)
//			{
//				swap(arr, i, j);
//				i++;
//			}
//		}
//		swap(arr, i, end);
//		return i;
//	}

	private void swap(int[] arr,int i, int j) {
		// TODO Auto-generated method stub
//		System.out.println(i+" "+j);
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
//		System.out.println(i+" "+j);
	}
	private void printArray(int[] arr)
	{
		for(Integer e: arr)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}

}
