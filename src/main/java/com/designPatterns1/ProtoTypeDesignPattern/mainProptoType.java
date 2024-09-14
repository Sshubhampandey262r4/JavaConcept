package com.designPatterns1.ProtoTypeDesignPattern;

public class mainProptoType {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
        NetworkConnection nw1=new NetworkConnection();
        nw1.setIp(12345);
        nw1.loadImportantData();
        
        System.out.println(nw1);
        
        NetworkConnection nw2=new NetworkConnection();
        nw2.setIp(123456);
        nw2.loadImportantData();
        
        
        NetworkConnection nw3=(NetworkConnection) nw1.clone();
        
        
        System.out.println(nw3);
        
	}

}
