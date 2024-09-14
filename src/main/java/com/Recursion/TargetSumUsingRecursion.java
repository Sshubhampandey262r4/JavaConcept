package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class TargetSumUsingRecursion {

	// target(0)
	                           // targetVa(1)
	// 0 index--> targetVa(1+1)-2             // 1 index--> target(1+1)-->
	//
	
	
	public static int targetValFind(int[] arr,int x,int minusCount,int plusCount,int target) {
		List<Integer> list=new ArrayList<Integer>();
		int sum=0;
		if(arr.length<=1) return arr.length;
		
		if(x==arr.length || minusCount+x==arr.length) return list.size();
	
		for(int i=0;i<arr.length;i++) {
			for(int j=x;j<minusCount+x;j++) {
				if(i==j) {
					list.add(-arr[i]);
					sum+=-arr[i];
				}
				else
				{
				 list.add(arr[i]);
				 sum+=arr[i];
				}
			}
			
		}
		
		if(sum==target) {
			return list.size();
		}
		
		return targetValFind(arr, x+1,minusCount,plusCount,target);
	}
	public static void targetVal(int[] arr,int x) {
		if(x==3) return;
		
		System.out.println("enter with "+x);
		for(int i=0;i<arr.length;i++) {
			targetVal(arr,x+1);
		}
		
		System.out.println("out with "+x);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1};
		int target=1;
	    
		
		int res=0;
		for(int i=1;i<nums.length;i++) {
			int minus=i;
		    int plus=nums.length-minus;
		    int x=targetValFind(nums, 0,minus,plus,target);
		    res+=x;
		    
		}
		System.out.println(res);
		
		//targetValFind(nums, 0,1,4);
		
		

	}

}
