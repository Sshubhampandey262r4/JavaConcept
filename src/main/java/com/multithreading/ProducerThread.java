package com.multithreading;

public class ProducerThread extends Thread {
	
	Company c;
	
	public ProducerThread(Company c) {
		this.c=c;	
	}
	
	@Override
	public void run() {
		
		int i=1;
		while(true) {
			this.c.produceItem(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}
	}

}
