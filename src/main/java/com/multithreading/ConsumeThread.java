package com.multithreading;

public class ConsumeThread extends Thread{
	
    Company c;
	
	public ConsumeThread(Company c) {
		this.c=c;	
	}
	
	@Override
	public void run() {
		
		while(true) {
			this.c.consumeItem();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}

}
