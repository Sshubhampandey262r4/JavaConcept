package com.streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWithPrefix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(223);
		list.add(123);
		list.add(224);
		
		List<Integer> prefixStartWithTwo=list.stream().map(e->String.valueOf(e))
				.filter(e->e.startsWith("2")).map(e->Integer.valueOf(e)).toList();
		System.out.println(prefixStartWithTwo);
		
		List<Integer> prefix =list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2"))
		.map(e->Integer.valueOf(e)).collect(Collectors.toList());
		System.out.println(prefix);
		
		

	}

}
