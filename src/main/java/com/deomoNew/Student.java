package com.deomoNew;

import java.util.Objects;

public class Student{
	
	 private String tradeId;
	 private String messageId;
	 
	 public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String tradeId, String messageId) {
		super();
		this.tradeId = tradeId;
		this.messageId = messageId;
	}
	
	static int a=0;
   
	@Override
	public int hashCode() {
		System.out.println(a);
		System.out.println("first");
		return a;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("second");
		return false;
	}

	@Override
	public String toString() {
		return "Student [tradeId=" + tradeId + ", messageId=" + messageId + "]";
	}
	 
}
