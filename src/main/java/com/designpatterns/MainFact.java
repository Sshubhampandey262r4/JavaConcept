package com.designpatterns;

public class MainFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee  emp=EmployeeFactory.getEmployee("android");
		emp.salary();
		Employee  emp1=EmployeeFactory.getEmployee("web1");
		emp1.salary();

	}

}
