package com.exceptionHandling;

public class CheckedAndUncheckedException {
	
	// checked and unchecked both exception occur at runtime
	
//checked exception are checked by compiler smooth execution of Programm at runtime whether programmer are handling or not 
// FileNotFoundException
// InterruptedException

// unchecked means compiler will not check because it occur at runtime
	// | --> Arithmetic Exception
	
// all erorrs are unchecked
//  Runtime its child classes and Error its child class are not check by compiler its unchecked
	
// fully checked and partially checked
// Interrupted,IOException,remote is fully Checked
// Exception also partially checked

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("i want to sleep");
		Thread.sleep(1000);

	}

}
