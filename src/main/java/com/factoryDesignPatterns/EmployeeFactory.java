package com.factoryDesignPatterns;

public class EmployeeFactory{
//        static Employee creaEmployee(String Type) {
//        	if(Type.equals("Android")){
//        		return new AndroidDeveloper();
//        	}
//        	else if(Type.equals("Web")) {
//        		 return new WebDeveloper();
//        	}
//        	return null;
//        }
	static Employee creaEmployee(EmployeeAbstractFactory factory) {
    	
    	return factory.creEmployee();
    }
}
