package com.FileHandling;

import java.io.*;

public class fileHandleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try(InputStreamReader isr=new InputStreamReader(System.in)) {
//		  System.out.print("Pass the val: ");
//          int val= isr.read();
//          while(isr.ready()) {
//        	System.out.print((char) val);
//        	val=isr.read();
//          }
//          System.out.println("completed");
//        }
//        catch (IOException e) {
//            System.out.println("An error has occurred."+e.getMessage());
//           
//        }
		
		try(FileReader isr=new FileReader("myfile.txt")) {
			  System.out.print("Pass the val: ");
	          int val= isr.read();
	          while(isr.ready()) {
	        	System.out.print((char) val);
	        	val=isr.read();
	          }
	          System.out.println((char) val);
	        }
	        catch (IOException e) {
	            System.out.println("An error has occurred."+e.getMessage());
	           
	        }
		
		// byte to char stream and then reading char stream
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("type : "+br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try(BufferedReader br=new BufferedReader(new FileReader("myfile.txt"))){
			while(br.ready()) {
			System.out.println("file data: "+br.readLine().toUpperCase());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}
