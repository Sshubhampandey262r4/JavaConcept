package com.designPatterns1;

import com.demo.Samosa;

// Design patterns are basically the solutions to the common problems 
//that arise during software design and development.
public class singleTonSamosa {
	
	private static singleTonSamosa samosa;
	
     private singleTonSamosa(){
		
	}
        
    static singleTonSamosa getSamosa() {
    	if(samosa==null) {
    		samosa=new singleTonSamosa();
    	}
    	return samosa;
    }
     
     
}
