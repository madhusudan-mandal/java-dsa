package com.practice.dsa.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {54,98,16,65,85,43};
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private void sort(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		if(first<last)
		{
			int median = first + (last-first)/2;
			sort(arr, first, median);
			sort(arr, median+1, last);
			merge(arr, first, median, last);
		}
	}

	private void merge(int[] arr, int first, int median, int last) {
		// We need two temp array to store the left and right sub part of array.
		int size1=median-first+1;
		int size2  = last-median;
		
		int[] left= new int[size1];
		int[] right=new int[size2];
		
		//Copy the left sub array to left[] array
		for(int i=0;i<size1; i++)
			left[i]=arr[first+i];
		//Copy the right sub array to right[] array
		for(int j=0;j<size2;j++)
			right[j]=arr[median+1+j];
		
		//merge the left and right subarray to actual array
		
		int i=0, j=0, k=first;
		while(i<size1 && j<size2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		
		while(i<size1)
		{
			arr[k]=left[i];
			k++;i++;
		}
		while(j<size2)
		{
			arr[k]=right[j];
			k++;j++;
		}
	}

}
