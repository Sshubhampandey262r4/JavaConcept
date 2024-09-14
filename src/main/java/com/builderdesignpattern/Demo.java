package com.builderdesignpattern;

public class Demo {
	
	
	 public static void main(String[] args) {
	        int n = 6;
	        int k = 4;
	        int[] price = {2, 4, 1, 5, 10, 6};
	        int[] sequence = {-1, 1, 0, 1, -1, 0};

	        int maxProfit = findMaxProfit(n, k, price, sequence);
	        System.out.println("Max Profit: " + maxProfit);
	    }

	    private static int findMaxProfit(int n, int k, int[] price, int[] sequence) {
	    	
	       int i=0;
	       int j=0;
	       int sum=0;
	       int max=0;
	       while(i<n && j<n) {
	    	   if(j-i+1==k) {
	    		  int half=k/2;
	    		  int end=i+half; 
                  for(int l=end;l<=j;l++) {
	    			   sum+=price[l];
	    		  }
                  int x=i-1;
                  int y=j+1;
                  while(x>=0) {
                	  sum+=sequence[x]*price[x];
                	  x--;
                  }
                  while(y<sequence.length) {
                	  sum+=sequence[y]*price[y];
                	  y++;
                  }
                  if(max<sum) {
                	  max=sum;
                  }
                  if(sequence[i]!=0) {
                      sum-=sequence[i]*price[i];
                  }
                  sum-=price[end];
                 i++;
                 j++;
                 if(j<price.length) {
                 sum+=1*price[j];
                 }
              
	    	   }
	    	   else
	    	   {
	    	     j++;
	    	   }
	    	   
	       }

	       

	        return max;
	    }

	  
	}

	
//	public static int  seprateStone(int N,int K,int arr[]) {
//		int countOfZero=0;
//		int counterOfOne=0;
//		int ans=0;
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]==0) {
//				countOfZero++;
//			}
//			if(arr[i]==1) {
//				counterOfOne++;
//			}
//			
//			if(countOfZero==K) {
//				countOfZero=0;
//				ans++;
//			}	
//			
//			if(counterOfOne==K) {
//				counterOfOne=0;
//				ans++;
//			}
//		}
//		
//		if(countOfZero!=0) {
//			ans++;
//		}
//		
//		if(counterOfOne!=0) {
//			ans++;
//		}
//		
//		return ans;
//	}
//	
//	public static void main(String[] args) {
//		int[] arr= {1,0,1,0};
//		int k=2;
//		int ans=seprateStone(arr.length, k, arr);
//		System.out.println(ans);
//		
//	}


