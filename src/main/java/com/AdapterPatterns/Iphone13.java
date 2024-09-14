package com.AdapterPatterns;

public class Iphone13 {
	private AppleCharger ap;
	
	
	public Iphone13(AppleCharger ap) {
		this.ap = ap;
	}


	void chargeApple() {
		ap.chargeIphone();
	}
}
