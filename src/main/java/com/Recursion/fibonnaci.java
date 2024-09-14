package com.Recursion;

public class fibonnaci {
	
	
	
	// 0 1 1 2 3 5 8
	//fibo(4)
	//fibo(3)
	 //fibo(2)
//fibo(1)-->1    
	
	
	public static int fibo(int n) {
		
		
		// last call of condition will start divide the call
		if(n<2) {
			return n;
		}
		int x1=fibo(n-1);
		int x2=fibo(n-2);
		int x3=fibo(n-3);
		int x4=fibo(n-4);
		
		return x1+x2+x3+x4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ans=  fibo(4);
       System.out.println(ans);
	}

}
