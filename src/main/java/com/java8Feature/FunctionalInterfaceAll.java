package com.java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//there are many interfaces that are converted into functional interfaces. All these interfaces are annotated with @FunctionalInterface. These interfaces are as follows – 
//
//Runnable –> This interface only contains the run() method.
//Comparable –> This interface only contains the compareTo() method.
//ActionListener –> This interface only contains the actionPerformed() method.
//Callable –> This interface only contains the call() method.
//Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations as mentioned below:
//
//Consumer
//Predicate
//Function 
//Supplier
//Amidst the previous four interfaces, the first three interfaces,i.e., Consumer, Predicate, and Function, likewise have additions that are provided beneath – 
//
//Consumer -> Bi-Consumer
//Predicate -> Bi-Predicate
//Function -> Bi-Function, Unary Operator, Binary Operator 
public class FunctionalInterfaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
 
        // Implement display using accept()
        display.accept(10);
 
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
 
        // Consumer to display a list of numbers
        Consumer<List<Integer> >
            dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
 
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
 
        // Implement modify using accept()
        modify.andThen(dispList).accept(list);
 
        // Implement dispList using accept()
        //dispList.accept(list);
        
        Predicate<Integer> lesserthan = i -> (i < 18);  
        
        // Calling Predicate method 
        System.out.println(lesserthan.test(10));
        
        
        Function<Integer, Double> half = a -> a / 2.0;

        // Now triple the output of half function
        half = half.andThen(a -> 3 * a);

        // Applying the function to get the result
        // and printing on console
        System.out.println(half.apply(10));
        
        // This function returns a random value. 
        Supplier<Double> randomValue = () -> Math.random(); 
  
        // Print the random value using get() 
        System.out.println(randomValue.get()); 

	}

}
