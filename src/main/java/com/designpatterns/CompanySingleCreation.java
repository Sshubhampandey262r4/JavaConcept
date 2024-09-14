package com.designpatterns;

import java.io.Serializable;

import javax.management.RuntimeErrorException;

// SingleTon Object for Company, We can create only one object and we reuse this object all over the code
public class CompanySingleCreation implements Serializable, Cloneable {
    
	private static CompanySingleCreation cp;
	
	private CompanySingleCreation() {
		if(cp!=null) {
			throw new RuntimeErrorException(null, "You are trying to break singleton pattern");
		}
	}
	
	public static CompanySingleCreation getCompany() { 
		if(cp==null) {
			
			synchronized (CompanySingleCreation.class) {
				if(cp==null) {
				cp=new CompanySingleCreation();	
				}
			} 
		}
		return cp;
	}
	
	// serialization single rule break handle
	public Object getResolve() {
		return cp;
	}
	
	// clone method single rule break handle
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		return cp;
	}
}
