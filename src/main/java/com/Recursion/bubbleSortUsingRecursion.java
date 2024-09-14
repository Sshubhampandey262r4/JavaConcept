package com.Recursion;

import java.util.Arrays;

public class bubbleSortUsingRecursion {
	
	
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

	void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (arr[j] > arr[j + 1]) { 
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
    } 
	
	void bubbleSort(int arr[],int i,int n) {
		if(i==n) return;
		for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		bubbleSort(arr, i+1, n);
	}
	
	void bubbleSortUsRecursion(int arr[],int r,int c) {
		if(r==0) return;
		if(r>c) {
			if(arr[c]>arr[r]) {
				int temp=arr[r];
				arr[r]=arr[c];
				arr[c]=temp;
			}
			bubbleSortUsRecursion(arr,r,c+1);
		}
		else
		{
			bubbleSortUsRecursion(arr,r-1,0);
			
		}
	}
	
	void selectionSort(int arr[],int r,int c,int max) {
		if(r==0) return;
		if(r>=c) {
			if(arr[c]>arr[max]) {
			  selectionSort(arr, r, c+1, c);
			}
			else
			{
			selectionSort(arr, r, c+1, max);
			}
		}
		else
		{
			int temp=arr[max];
			arr[max]=arr[r];
			arr[r]=temp;
			selectionSort(arr, r-1,0,0);
			
		}
		
	}
  
    // Prints the array 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        bubbleSortUsingRecursion ob = new bubbleSortUsingRecursion(); 
        int arr[] = { 64, 34, 25, 12, 22, 11, 12 }; 
        //ob.bubbleSortUsRecursion(arr, arr.length-1, 0);
        //ob.selectionSort(arr, arr.length-1, 0, 0);
       // ob.bubbleSort(arr,0,arr.length); 
        System.out.println();
        
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array"); 
        System.out.println(Arrays.toString(arr));
        //ob.printArray(arr); 
    } 

}
