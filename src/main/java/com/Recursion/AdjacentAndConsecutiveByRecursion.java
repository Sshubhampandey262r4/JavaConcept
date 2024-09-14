package com.Recursion;

public class AdjacentAndConsecutiveByRecursion {

	public static String removeConsecutiveDuplicate(StringBuilder str,int i) {	
		if(str.length()-1==i){
			return str.toString();
		}
		char ch=str.charAt(i);
		if(ch==str.charAt(i+1)) {
			str.deleteCharAt(i);
			i-=1;
			return removeConsecutiveDuplicate(str, i+1);
		}
		return removeConsecutiveDuplicate(str, i+1);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="aabccba";
		String result=removeConsecutiveDuplicate(new StringBuilder(res), 0);
		System.out.println(result);
	}

}
