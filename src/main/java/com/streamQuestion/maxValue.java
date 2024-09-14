package com.streamQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class maxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(4);
		
		Integer maxs=	list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		Integer max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(max);
		
		Integer min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(min);
		
		
		List<Integer>  resASC=list.stream().sorted().toList();
		System.out.println(resASC);
		List<Integer>  resDSC=list.stream().sorted(Collections.reverseOrder()).toList();
		System.out.println(resDSC);

	}

}
