package com.Recursion;

import java.util.ArrayList;

public class SkipCharacterUsingRecursion {
	
	public static ArrayList<ArrayList<Integer>> subsequenceUsingRecursion(int[] num){
		ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
		outer.add(new ArrayList<Integer>());
		
		for(int n:num) {
			int x=outer.size();
			for(int i=0;i<x;i++) {
				ArrayList<Integer> internal=new ArrayList<Integer>(outer.get(i));
				internal.add(n);
				outer.add(internal);
			}
			
		}
		return outer;
	}
	
	public static String skipCharacter(String s,String res,int i) {
		if(i==s.length()) return res;
		
		if(s.charAt(i)=='a') {
			res=skipCharacter(s, res, i+1);
		}
		else
		{
			res=skipCharacter(s, res+s.charAt(i), i+1);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="baccad";
		
	String res=skipCharacter(str,"", 0);
	System.out.println(res);
	int[] arr= {1,2,3};
	ArrayList<ArrayList<Integer>> res1=subsequenceUsingRecursion(arr);
	System.out.println(res1);

	}

}
