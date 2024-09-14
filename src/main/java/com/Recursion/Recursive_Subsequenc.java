package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursive_Subsequenc {

	//[]
	//[] [1]
	// [],[1],[2],[1,2]
	// [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]
	public static ArrayList<ArrayList<Integer>> subsequenceUsingRecursion(int[] num){
		ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
		outer.add(new ArrayList<Integer>());
		
		for(int n:num) {
			int x=outer.size();
			for(int i=0;i<outer.size();i++) {
				ArrayList<Integer> internal=new ArrayList<Integer>(outer.get(i));
				internal.add(n);
				outer.add(internal);
			}
		}
		return outer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		ArrayList<ArrayList<Integer>> res=subsequenceUsingRecursion(arr);
		System.out.println(res);
	}

}
