package com.exceptionHandling;

// Throwable class is root for java exception

// Exception: it is caused by our program and its  recoverable and this can be handle by developer

// Error: Most of the time it is not caused by our program and it is non recoverable.it occur lack of system resources
 
//                          Throwable
//        /                                          
//      Exception                                     
//    Runtime Exception| -> AE,NPE,CCE(class cast exception),IndexOutOfBound-Array,String,IllegalException-numberformat
//    IOException|-> EOFException(End of file),FileNotFoundException
//    Interrupted Exception|-> SQLException
//    RemoteException |->
//                              \
 //                             Error
 //                              UMError(Under Mission)| stackoverflowError || OutOfMemoryError
//                               LinkageError | verifyError
//                               AssertionError |
//                               ExceptionInInitializerError |

public class ExceptionHierarchy {

	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online


	    public static void main(String[] args) {
	        // Creating an object and assigning it a reference
	    	ExceptionHierarchy obj1 = new ExceptionHierarchy();

	        // Creating another object and assigning it a reference
	    	ExceptionHierarchy obj2 = new ExceptionHierarchy();

	        // Making obj1 eligible for garbage collection by setting its reference to null
	        obj1 = null;

	        // Requesting garbage collection (this is only a request, not a guarantee)
	        System.gc();

	        // Making obj2 eligible for garbage collection by setting its reference to null
	        //obj2 = null;

	        // Requesting garbage collection again
	        Runtime.getRuntime().gc();
	        
	        // Main method ends here; any unreferenced objects may be collected
	    }

	    // This method is called by the garbage collector when the object is about to be destroyed
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Garbage collection is performed and finalize() is called!");
	    }


}
