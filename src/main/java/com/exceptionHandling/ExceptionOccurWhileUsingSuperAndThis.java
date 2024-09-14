package com.exceptionHandling;


// we can not use super and this keyword together
class Vehicle{
	String type="4w";
	int maxSpeed=20;
	public Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
		
}
class Car extends Vehicle {
	String trans;

	public Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this.trans = trans;
	}
	
	
}
public class ExceptionOccurWhileUsingSuperAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car st=new Car("lembo", 22, "qwer");
		

	}

}
