package com.AdapterPatterns;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Adapter adp=new Adapter(new DkCharger());
		Iphone13 ip=new Iphone13(adp);
		ip.chargeApple();
	}

}
