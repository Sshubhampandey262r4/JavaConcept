package com.streamQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecodnLargestAndLowestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(4);
		
		
	int ans=	list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	int secondlowest=	list.stream().sorted().skip(1).findFirst().get();
	System.out.println(secondlowest);
	
	int secondhighest=	list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	System.out.println(secondhighest);
	}

}
