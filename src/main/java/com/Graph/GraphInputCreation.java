package com.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GraphInputCreation {
	
	
	
	

	// Creation of Adjacency List
	// The adjacency List consist of an ArrayList within an
	// ArrayList. The inner ArrayList holds the HashMap of
	// (vertices,weight)
//	
//		int v;
//		ArrayList<ArrayList<HashMap<Integer, Integer> > > adj;
//		GraphInputCreation(int v)
//		{
//			this.v = v;
//			this.adj = new ArrayList<ArrayList<HashMap<Integer, Integer>>>();
//
//			for (int i = 0; i < v; i++) {
//				this.adj.add(new ArrayList<HashMap<Integer, Integer>>());
//			}
//		}
//		// Function to add an Edge
//		void addEdge(int u, int v, int weight)
//		{
//			this.adj.get(u).add(new HashMap<Integer, Integer>());
//			System.out.println("mp  "+this.adj.get(u).size());
//			this.adj.get(u)
//				.get(this.adj.get(u).size() - 1)
//				.put(v, weight);
//
//			this.adj.get(v).add(new HashMap<Integer, Integer>());
//			this.adj.get(v)
//				.get(this.adj.get(v).size() - 1)
//				.put(u, weight);
//		}
//
//		// Function for printing the whole graph
//		// Stream API has been used
//		// to easily access the HashMap elements
//		// This code may not work in versions
//		// prior to java 8
//
//		void printGraph()
//		{
//			for (int i = 0; i < this.v; i++) {
//				System.out.println("\nNode " + i
//								+ " makes an edge with ");
//				for (HashMap<Integer, Integer> j :
//					this.adj.get(i)) {
//					j.entrySet().forEach(
//						e
//						-> System.out.println(
//							"\tNode " + e.getKey()
//							+ " with edge weight "
//							+ e.getValue() + " "));
//				}
//			}
//		}
//		// Main method
//		public static void main(String[] args)
//		{
//			int v = 5;
//			GraphInputCreation obj = new GraphInputCreation(v);
//			obj.addEdge(0, 1, 10);
//			obj.addEdge(0, 4, 20);
//			obj.addEdge(1, 2, 30);
//			obj.addEdge(1, 3, 40);
//			obj.addEdge(1, 4, 50);
//			obj.addEdge(2, 3, 60);
//			obj.addEdge(3, 4, 70);
//			obj.printGraph();
//		}

	// This code is submitted by Abhishek_Manna_HETC

	
	
//	public static void creaTionOfWeightedGraph() {
//		int n=3,m=3;
//		ArrayList<ArrayList<HashMap<Integer, Integer>>> adj=new ArrayList<ArrayList<HashMap<Integer,Integer>>>();
//		// n+1
//		for(int i=0;i<=n;i++) {
//			adj.add(new ArrayList<HashMap<Integer,Integer>>());
//		}
//	
//	   HashMap<Integer,Integer> mp=new HashMap<Integer, Integer>();
//	   mp.put(2, 2);
//	   adj.get(1).add(mp);
//	   
//	   for(int i=1;i<adj.size();i++) {
//		   for(int j=0;j<adj.get(i).size();j++) {
//			   System.out.print(adj.get(i).get(j));   
//		   }
//		   System.out.println();
//	   }
//		
//	}
//
	
	public static void dfs(int i,boolean[] vis,ArrayList<Integer> res,ArrayList<ArrayList<Integer>> adj) {
		res.add(i);
		vis[i]=true;
		for(int j:adj.get(i)) {
			if(vis[j]==false) {
			 dfs(j, vis, res, adj);
			}
		}
				
	}
	
	public static ArrayList<Integer> DfsTraversal(int n,ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>  res=new ArrayList<>();
      
		boolean[] vis=new boolean[n];
		vis[0]=true;
		dfs(0,vis, res,adj);
		return res;
		
	}
	public static void BfsTraversal(int n,ArrayList<ArrayList<Integer>> adj) {
		
		Queue<Integer> q=new LinkedList<>();
		
		ArrayList<Integer>  res=new ArrayList<>();
		
		q.add(0);
		boolean[] vis=new boolean[n];
		vis[0]=true;
		
		while(!q.isEmpty()) {
			Integer ps=q.poll();
			res.add(ps);
			
			for(int x:adj.get(ps)) {
				
				if(vis[x]==false) {
					vis[x]=true;
					q.add(x);
				}
				
			}
		}
		
		System.out.println(res);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		//n--> no of nodes / vertices
		// m--> no edges
		
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		
		// this is one based indexing graph
		
		// n+1  --> list we added
		// 0 1 2 3
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		// u v  --> because of undirected graph
		// v u  
		adj.get(0).add(1);
		adj.get(1).add(2);
		adj.get(1).add(6);
		
		adj.get(2).add(1);
		adj.get(2).add(3);
		adj.get(2).add(4);
		
		adj.get(3).add(2);
		
		adj.get(4).add(2);
		adj.get(4).add(5);
		
		adj.get(5).add(4);
		adj.get(5).add(8);
		
		adj.get(6).add(1);
		adj.get(6).add(7);
		adj.get(6).add(9);
		
		adj.get(7).add(6);
		adj.get(7).add(8);
		
		adj.get(8).add(7);
		adj.get(8).add(5);
		
		adj.get(9).add(6);
		
		for(int i=0;i<adj.size();i++) {
			System.out.print(i+"---> ");
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(adj);
		//creaTionOfWeightedGraph();
		
		BfsTraversal(n+1, adj);
		 ArrayList<Integer> res=DfsTraversal(n+1, adj);
		 
		 System.out.println(res);
		

	}

}
