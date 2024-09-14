package com.multithreading;

public class AnotherThread extends Thread{
	
	@Override
	public void run() {
		for(int i=9;i>=0;i--) {
			System.out.println("Another thread "+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}
	}

}
