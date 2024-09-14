package com.FileHandling;

import java.io.*;

public class outPutStreamWriterFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputStream os=System.out;
		
//		try(OutputStreamWriter osw=new OutputStreamWriter(System.out)) {
//			osw.write("hello");
//			osw.write(10);
//			osw.write('a');
//			os.write('\n');
//			char[] m= {'a','v'};
//			osw.write(m);
//			osw.write(97);
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try(FileWriter fw=new FileWriter("myfile.txt",true)) {
//			fw.write("my name is shubham pandey");
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("myfile.txt",true))) {
			bw.write("hello baby");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		//System.out.println();
	}

}
