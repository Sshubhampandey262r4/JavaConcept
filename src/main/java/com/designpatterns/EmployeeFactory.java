package com.designpatterns;

public class EmployeeFactory {
	
	public static Employee getEmployee(String EmpType) {
		 if(EmpType.trim().equalsIgnoreCase("ANDROID")) {
			 return new AndroidDeveloper();
		 }
		 else if(EmpType.trim().equalsIgnoreCase("WEB")) {
			 return new WebDeveloper();
		 }
		 else
		 {
			 return null;
		 }
	}

}
