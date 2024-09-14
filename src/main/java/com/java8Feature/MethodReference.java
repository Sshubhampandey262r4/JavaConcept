package com.java8Feature;


//Method Reference
//Method reference is a shorthand notation of a lambda expression to call a method. There are four types of method references that are as follows:
//
//Static Method Reference
//Instance Method Reference of a particular object
//Instance Method Reference of an arbitrary object of a particular type
//Constructor Reference.
//Java Program to Illustrate How One can use
//Static method reference
//To Sort with Custom Comparator

//Importing required classes
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Class 1
//Helper class
//Object need to be sorted
class Person {

	private String name;
	private Integer age;

	// Constructor
	public Person(String name, int age)
	{
		// This keyword refers to current instance itself
		this.name = name;
		this.age = age;
	}

	// Getter-setters
	public Integer getAge() { return age; }
	public String getName() { return name; }
}

//Class 2
//Main class
public class MethodReference {

	// Method 1
	// Static method to compare with name
	public static int compareByName(Person a, Person b)
	{
		return a.getName().compareTo(b.getName());
	}

	// Method 2
	// Static method to compare with age
	public static int compareByAge(Person a, Person b)
	{
		return a.getAge().compareTo(b.getAge());
	}

	// Method 3
	// Main driver method
	public static void main(String[] args)
	{

		// Creating an empty ArrayList of user-defined type
		// List of person
		List<Person> personList = new ArrayList<>();

		// Adding elements to above List
		// using add() method
		personList.add(new Person("vicky", 24));
		personList.add(new Person("poonam", 25));
		personList.add(new Person("sachin", 19));

		// Using static method reference to
		// sort array by name
		Collections.sort(personList, MethodReference::compareByName);

		// Display message only
		System.out.println("Sort by name :");

		// Using streams over above object of Person type
		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);

		// Now using static method reference
		// to sort array by age
		Collections.sort(personList, MethodReference::compareByAge);

		// Display message only
		System.out.println("Sort by age :");

		// Using streams over above object of Person type
		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
		
		
		
		
		
		 ArrayList<String> fruits = new ArrayList<>(); 
	        fruits.add("Banana"); 
	        fruits.add("Guava"); 
	        fruits.add("Pineapple"); 
	        fruits.add("Apple"); 
	  
	        // printing contents of arraylist before conversion 
	        System.out.println("Elements in ArrayList are : "
	                           + fruits); 
	  
	        // creating new hashmap and using method reference 
	        // with necessary classes for the conversion 
	        HashMap<String, Integer> res = fruits.stream().collect(Collectors.toMap( 
	                Function.identity(), String::length, 
	                (e1, e2) -> e1, HashMap::new)); 
	  
	        // printing the elements of the hashmap 
	        System.out.println("Elements in HashMap are : "
	                           + res); 
	}
}

