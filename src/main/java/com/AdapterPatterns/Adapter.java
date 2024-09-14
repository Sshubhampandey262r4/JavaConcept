package com.AdapterPatterns;

public class Adapter implements AppleCharger {
	
	AndroidCharger androidCharger;
	
	

	public Adapter(AndroidCharger androidCharger) {
		
		this.androidCharger = androidCharger;
	}



	@Override
	public void chargeIphone() {
		// TODO Auto-generated method stub
		androidCharger.chargeAndroid();
	}

}
