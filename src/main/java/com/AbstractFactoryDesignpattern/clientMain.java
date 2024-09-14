package com.AbstractFactoryDesignpattern;

public class clientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee e1=EmployeeFactory.getEmployee(new AndroidDevFactory());
	e1.getName();
	
	Employee e2=EmployeeFactory.getEmployee(new WebDevFactory());
	e2.getName();
	

	}

}
