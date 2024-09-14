package com.observerDesignPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		youTubeChannel yt=new youTubeChannel();
		
		Subscriber shubham=new Subscriber();
		yt.subscribe(shubham);
		
		yt.notifyChanges();

	}

}
