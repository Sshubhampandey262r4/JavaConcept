package com.demo;

public class EmployeeFactory {
	
	static Employee getEmployeeByInput(String inputType) {
		if(inputType.trim().equalsIgnoreCase("Web Developer")) {
			return new WebDeveloper();
		}
		else if (inputType.trim().equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloper();
		}
		return null;

 }
}
