package com.java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableAndComparatorBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee("Shubham",21));
		emp.add(new Employee("rahul",18));
		emp.add(new Employee("somu",24));
		emp.add(new Employee("tonu",4));
		
		
		
	  // Collections.sort(emp);
	   
	   Collections.sort(emp,new Comparator<Employee>() {
		   @Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	});
	 
	 System.out.println(emp);

	}

}
