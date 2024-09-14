package com.Recursion;

public class WordSearchUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}}; 
	String word = "AAB";
	
	
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[0].length;j++) {
			//System.out.println(board[i][j]);
			if(board[i][j]==word.charAt(0) && findTheWord(board, i, j,0, word)) {
				
			  System.out.println(true);
			}
		}
	}

	}
	
	public static boolean findTheWord(char[][] board,int i,int j,int count,String word) {
		if(count==word.length()) {
			return true;
		}
		if(i<0 || j<0 || board.length==i || board[0].length==j || word.charAt(count)!=board[i][j]) {
			return false;
		}
		char ch=board[i][j];
		if(board[i][j]==word.charAt(count)) {
			board[i][j]='*';
			count++;
		}
	     boolean tag1=findTheWord(board, i+1, j, count, word);
	    boolean tag2=findTheWord(board, i-1, j, count, word);
	    boolean tag3=findTheWord(board, i, j+1, count, word);
	    boolean tag4=findTheWord(board, i, j-1, count, word);
	     board[i][j]=ch;
		return tag1 ||tag2 ||tag3 ||tag4;
	}

}
