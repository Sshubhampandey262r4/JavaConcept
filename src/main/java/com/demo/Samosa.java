package com.demo;

public class Samosa {
	
	private static Samosa samosa;
	
	public static Samosa  getSamosa() {
		if(samosa==null) {
			samosa= new Samosa();
		}
		return samosa;
	}

}
