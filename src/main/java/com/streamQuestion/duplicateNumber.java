package com.streamQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(4);
		
	Set<Integer> ans=	list.stream().filter(e->Collections.frequency(list, e)>1)
		.collect(Collectors.toSet());
	
	System.out.println(ans);
	Set<Integer> ans1=new HashSet<>();
	Set<Integer> ans2=list.stream().filter(e->!ans1.add(e))
			.collect(Collectors.toSet());
		
		System.out.println(ans2);
	
	
		
		
	}

}
