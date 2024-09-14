package com.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetUsingRecursion {

	public static ArrayList<String> subset(String str, String res,int i,ArrayList<String> list) {
		 if(str.length()==i) {
			 list.add(res);
			 return list;
		 }
		 list=subset(str, res+str.charAt(i), i+1,list);
		 list=subset(str, res, i+1,list);
		 return list;
	}
	
	public static ArrayList<String> subset(String str, String res,int i) {
		 
		 ArrayList<String> list1=new ArrayList<String>();
		if(str.length()==i) {
			 list1.add(res);
			 return list1;
		 }
		ArrayList<String> left=subset(str, res+str.charAt(i), i+1);
		ArrayList<String> right=subset(str, res, i+1);
		
		list1.addAll(left);
		list1.addAll(right);
	
		 return list1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res= subset("abc", "", 0,new ArrayList<String>());
		ArrayList<String> res1= subset("abc", "", 0);
		Collections.sort(res1);
		System.out.println(res);
		System.out.println(res1);

	}

}
