package com.multithreading;

public class multithreading1 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
		  System.out.println("thread "+i);
		  try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             multithreading1 r=new multithreading1();
             
             Thread t=new Thread(r);
             t.start();
             
             
             AnotherThread td=new AnotherThread();
             
             td.start();
             
             //  main thread Access
             
          Thread th=   Thread.currentThread();
          
          System.out.println(th.getName());
          th.setName("myThreadMain");
          
          System.out.println(th.getId());
          System.out.println(th.getName());
          System.out.println(th.getPriority());
             
            
	}

}
