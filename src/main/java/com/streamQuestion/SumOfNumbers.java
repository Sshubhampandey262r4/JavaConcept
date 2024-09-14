package com.streamQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int res= Arrays.stream(arr).sum();
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		
		int result=list.stream().reduce((a,b)->a+b).get();
		System.out.println("my result is : "+result);
		
		double avg=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		
		int res1=list.stream().mapToInt(e->e).reduce((a,b)->a+b).getAsInt();
		System.out.println(res);
		System.out.println(res1);
		
		double res2=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(res2);
		
		List<Integer> squares=list.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(squares);
		
		list.stream().mapToInt(e->e).average();

	}

}
