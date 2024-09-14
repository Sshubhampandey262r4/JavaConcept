package com.Recursion;

public class recursionCallinForLoop {
	
	
	    //loop(3)
	//loop(0)
	
	public static void looprec(int n) {
		if(n<=0) {
			return;
		}
		
		System.out.println("enter the recursive call with "+n);
		 for(int i=0;i<n;i++) {
			System.out.println("enter in loop "+i);
		   looprec(i);
		   System.out.println("out from loop "+i);
		 }
		System.out.println("exit the recursive call with "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       looprec(3);
	}

}
