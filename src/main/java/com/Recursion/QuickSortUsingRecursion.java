package com.Recursion;

import java.util.Arrays;

public class QuickSortUsingRecursion {
	
	// low and high used to maintain further iteration 
	public static void quickSort(int[] arr,int low,int high) {
		
		if(low>=high) return;
		
		int s=low;
		int e=high;
		int mid=s+(e-s)/2;
		int pivot=arr[mid];
		
		while(s<=e) {
			while(arr[s]<pivot)
				s++;
			while(arr[e]>pivot)
				e--;
			
			// if s or e violated the pivot value condition
			// then we will swap start and end to each other
			if(s<=e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		
		// low will be 0 and e will be something 
		// that we sort again that part of array
		System.out.println(low+" "+e);
		quickSort(arr, low, e);
		// high will be len(arr) and s will be something 
		// that we sort again that part of array
		quickSort(arr, s, high);
	}

	public static void main(String[] args) {
		
	//	p--> pivot elemet it should be anything random last element start elemet anything
	// first part should be less than p--> start < p 
	// second part should be greator than p ---> p < end
		int[] arr= {5,4,3,2,1};
		quickSort(arr, 0, arr.length-1);
		
		
		System.out.println(Arrays.toString(arr));
		

	}

}
