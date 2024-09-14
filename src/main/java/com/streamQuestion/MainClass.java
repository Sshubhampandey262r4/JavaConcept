package com.streamQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {

	private static Map<String, Student> collect;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list=new ArrayList<>();
		Student st1=new Student(1,"BMW","shubham");
		Student st2=new Student(3,"BMW","Rabham");
		Student st3=new Student(2,"Lemborgini","Qabham");
		list.add(st1);
		list.add(st2);
		list.add(st3);
		//Collections.sort(list,Student.compByName);
		
	// partitionBy	
	Map<Boolean, List<Student>>	res=list.stream().collect(Collectors.partitioningBy(student->student.getGrade()>1));
	
	
	List<Student> students = null;  
	 for(boolean b : res.keySet()) {
		 if(b==true) {
			 students=res.get(b);
		 }
	 }
	//System.out.println(students);
		
		
		
		//GroupBy
		Map<Object, List<Student>>	resGroupBy=list.stream().collect(Collectors.groupingBy(student->student.getCar()));
		
		//resGroupBy.forEach((k,v)-> System.out.println("Key: "+k+" values: "+v));
		
		
	Map<String, Student> ress=	list.stream().collect(Collectors.toMap(Student::getCar, Function.identity(),(a,b)->b));
	System.out.println(ress);
	
	Map<String, Student>	collects = list.stream().collect(Collectors.toMap(Student::getCar,Function.identity(),(a,b)->b));
		
	}
	
	
	

}
