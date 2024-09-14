package com.designpatterns;

import java.lang.reflect.Constructor;

import com.multithreading.Company;

public class Singleton_Creational {

	public static void main(String[] args) throws Exception, SecurityException {
		// TODO Auto-generated method stub
        
		
		
//        CompanySingleCreation cp2=CompanySingleCreation.getCompany();
//		
//		System.out.println(cp2.hashCode());
//		
//		Company pp=new Company();
//		System.out.println(pp.hashCode());
//		
//		Company pp1=new Company();
//		System.out.println(pp1.hashCode());
//		
//		System.out.println(cp1.equals(cp2));
//		
//		String s1="shubham";
//		String s2=new String("shubham");
//		
//		System.out.println(s1.equals(s2));

		
CompanySingleCreation cp1=CompanySingleCreation.getCompany();
System.out.println(cp1.hashCode());

//   Constructor<CompanySingleCreation> s= CompanySingleCreation.class.getDeclaredConstructor();
//   s.setAccessible(true);
//  CompanySingleCreation obj= s.newInstance();

CompanySingleCreation obj= (CompanySingleCreation) cp1.clone();
 System.out.println(obj.hashCode());
		
/* 1-Reflection API to break sigletons pattern
 * 
 * 
 * 
 * 
 * 
 *
 *
 *
 */
		
		
		
 
		
	}

}
