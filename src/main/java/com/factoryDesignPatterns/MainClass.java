package com.factoryDesignPatterns;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=EmployeeFactory.creaEmployee(new Androidfactory());
		
		Employee emp2=EmployeeFactory.creaEmployee(new WebDeveloperFactory());
		System.out.println("Android developer salary: "+emp1.getSalary());
		System.out.println("web developer salary: "+emp2.getSalary());

	}

}
