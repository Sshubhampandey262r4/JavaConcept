package com.streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimitStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(5);
		
		
	List<Integer> ansLimit=	list.stream().limit(5).collect(Collectors.toList());
	System.out.println(ansLimit);
	List<Integer> ansSkip=	list.stream().skip(5).collect(Collectors.toList());
	System.out.println(ansSkip);

	}

}
