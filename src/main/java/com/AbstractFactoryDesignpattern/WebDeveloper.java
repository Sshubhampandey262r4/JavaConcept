package com.AbstractFactoryDesignpattern;

public class WebDeveloper implements Employee {

	public int getSalary() {
		// TODO Auto-generated method stub
		
		return 100;
	}

	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("getting web developer");
		return "web";
	}

}
