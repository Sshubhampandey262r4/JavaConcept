package com.deomoNew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {
	
//	static Comparator<Student> compByMessageId=new Comparator<Student>() {
//		@Override
//		public int compare(Student o1, Student o2) {
//			// TODO Auto-generated method stub
//			return o2.getMessageId()-o1.getMessageId();
//		}
//	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> list=new HashSet<>();
		Student st=new Student("123l","1");
		Student st1=new Student("123l","2");
		
		
		Student st2=new Student("123l","3");
		Student st3=new Student("123l","4");
		Student st4=new Student("1241","1");
		
		list.add(st);
		list.add(st1);
//		list.add(st2);
//		list.add(st3);
//		list.add(st4);
		
		
		System.out.println(list.size());
		
//		Map<Long,List<Student>> mapData=list.stream().collect(Collectors.groupingBy(e->e.getTradeId()));
//		
//	 mapData.forEach((e,v)->{
//		 if(e==123l) {
//			 List<Student>  ans=v;
//			 try {
//				Collections.sort(ans,compByMessageId);
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			 
//			Student student= ans.stream().findFirst().get();
//			System.out.println(student);
//		 }
//	 });
       
		//System.out.println(mapData);


	}

}
