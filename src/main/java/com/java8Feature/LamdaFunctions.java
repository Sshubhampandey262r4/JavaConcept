package com.java8Feature;

import java.util.ArrayList;

//In Java, Lambda expressions basically express instances of functional interfaces 
//(An interface with a single abstract method is called a functional interface)

//There are three Lambda Expression Parameters are mentioned below:
//
//1-Zero Parameter
//2-Single Parameter
//3-Multiple Parameters

interface FuncInter1 {
    int operation(int a, int b);
}
public class LamdaFunctions {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.println(n));
        
        FuncInter1 t=(int a,int b)-> a+b;
        int ans=  t.operation(10, 20);
        System.out.println(ans);

	}

}
