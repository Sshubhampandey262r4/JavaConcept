package com.multithreading;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company comp=new Company();
		ProducerThread th=new ProducerThread(comp);
		ConsumeThread cth=new ConsumeThread(comp);
        th.start();
        cth.start();
	}

}
