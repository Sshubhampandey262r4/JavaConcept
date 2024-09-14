package com.streamQuestion;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int grade;
    private String car;
    private String name;
    
    public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int grade, String car, String name) {
		super();
		this.grade = grade;
		this.car = car;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(car, grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(car, other.car) && grade == other.grade && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", car=" + car + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.grade-o.grade;
	}
	
	static Comparator<Student> compByName=new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};

	
	
	
	
	
	
}
