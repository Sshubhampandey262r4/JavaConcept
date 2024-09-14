package com.multithreading;

public class EqualsAndDoubleEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// all primitive always use == 
		// if we compare two objects using == it  compare the memory locations of those objects
		
		String s1="shubham";
		String s2="shubham";
		
		String s3=new String("shubham");
		String s4=new String("shubham");
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s1));

	}

}
