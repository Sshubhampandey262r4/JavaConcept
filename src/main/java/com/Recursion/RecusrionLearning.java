package com.Recursion;

public class RecusrionLearning {
	
	
	public static boolean callStr(String s,int i,char ch,boolean found) {
		if(i==s.length()) return found;
		
		if(s.charAt(i)=='l') {
			found=true;
		}
		boolean t1=callStr(s, i+1,ch,found);
		boolean t2=callStr(s, i+1,ch,found);
		
		return t1 || t2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello Shubham";
	boolean	ans =callStr(str, 0, 'l', false);
	System.out.println(ans);

	}

}
