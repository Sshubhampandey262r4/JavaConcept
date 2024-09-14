package com.prototypedesignpattern;

public class MainCall {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		NetworkConnection nt=new NetworkConnection();
		nt.setIp("12345:23456:45678");
		nt.loadImpData();
		System.out.println(nt);
		
	
	NetworkConnection nt1=(NetworkConnection) nt.clone();	
	nt1.getDomains().remove(0);
	NetworkConnection nt2=	(NetworkConnection) nt.clone();
	NetworkConnection nt3=	(NetworkConnection) nt.clone();
	System.out.println(nt1);
	System.out.println(nt2);
	System.out.println(nt3);
	// Difference between shallow copy and deep copy
	
	// shallow take the copy of object as well as take reference of child object of the object it will change the details of reference by shallow copy as well
	// but deep copy will not able to do this	

	}

}
