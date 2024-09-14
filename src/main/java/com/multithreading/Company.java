package com.multithreading;

public class Company {

	int n;
	boolean flag=false; 
	//false means it is chance for producer
	// true means it is chance for consumer
	synchronized public void produceItem(int n) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("produce item "+this.n);
		flag=true;
		notify();
	}
	
    synchronized public void consumeItem() {
    	if(!flag) {
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	System.out.println("consumer item "+this.n);
    	flag=false;
    	notify();
	}
}
