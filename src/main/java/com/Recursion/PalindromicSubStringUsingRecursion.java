package com.Recursion;

import java.util.ArrayList;

public class PalindromicSubStringUsingRecursion {

	public static boolean checkPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
 
            i++;
            j--;
        }
        return true;
    }
 
	public void partition(ArrayList<ArrayList<String>> res, String s, int ind, ArrayList<String> curr) {
        // if we reach the end of string
        // add the current list to the result
 
        if(ind == s.length()) {
            res.add(new ArrayList<String>(curr));
            return;
        }
 
        // Store the current substring
        String temp = "";
 
        for(int i = ind; i < s.length(); i++) {
        	
        	// it will back i will be i+1;
            temp += s.charAt(i);
 
            // check if string temp is palindrome or not
            if(checkPalindrome(temp)){
 
                // adds the string to current list
                curr.add(temp);
 
                // Recursive call for the remaining string
                
                partition(res, s, i+1, curr);
 
                // Remove the string from the current list - (backtracking)
                curr.remove(curr.size()-1);
            }
        }
         
    }
	
	
	public static ArrayList<ArrayList<String>> PalindromicSubString(String s,int x,ArrayList<ArrayList<String>> res,ArrayList<String> curr ) {
		if(x==s.length()+1) {
		  res.add(new ArrayList(curr));
		  curr=new ArrayList<String>();
		  return res;
		}
		int j=x;
		for(int i=0;i<s.length();i++) {
			if(j<=s.length()) {
				if(checkPalindrome(s.substring(i,j))) {
					curr.add(s.substring(i,j));
			      System.out.println(s.substring(i,j));
			   }
			  j++;
			}
				
		}
	 return PalindromicSubString(s,x+1,res,curr);
		
	}
    
    
    public static void main(String[] args) {
 
        // creating obj of GFG class
    	PalindromicSubStringUsingRecursion obj = new PalindromicSubStringUsingRecursion();
 
        // Stores all partitions generated at the end
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
         
        ArrayList<String> curr=new ArrayList<String>();
        String s = "nitin";
 
        int ind = 0;
        
        
        ArrayList<ArrayList<String>> result=   PalindromicSubString(s,1,res,curr);
        for(ArrayList<String> iter : res) {
            System.out.println(iter);
        }
        
//        obj.partition(res, s, ind, curr);
//        
//        for(ArrayList<String> iter : res) {
//            System.out.println(iter);
//        }
        
      // String resl=s.substring(0,5);
     //  System.out.println(result);
 
        
    }

}
