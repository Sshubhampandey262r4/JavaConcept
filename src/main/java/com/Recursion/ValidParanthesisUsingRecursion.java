package com.Recursion;

public class ValidParanthesisUsingRecursion {
	
	static char findClosing(char c)
    {
        if (c == '(')
            return ')';
        if (c == '{')
            return '}';
        if (c == '[')
            return ']';
        return Character.MIN_VALUE;
    }
	
	public static boolean IsCheckValidParanthesis(StringBuilder str,int i,StringBuilder res,boolean flag) {
		if(str.length()==i){
            if(!res.isEmpty()){
                System.out.println(res.toString());
                return false;
            }
            return true;
        }
	
		if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[') {
			if(!res.isEmpty() && flag==true) {
				res.reverse();
			}
			res.append(str.charAt(i));
			flag=false;
			return IsCheckValidParanthesis(str,i+1,res,flag);
		}
		else
		{  
			if(flag==false) {
				res.reverse();
				System.out.println("rev val "+res);
			}
			flag=true;
            
			if(res.isEmpty()) return false;
			char ch=res.charAt(0);
			System.out.println("opening "+ch);
			char closing=findClosing(ch);
			System.out.println("closing "+closing);
			if(closing==str.charAt(i)) {
                 System.out.println("match");
				res.delete(0,1);
				//System.out.println(res.toString());
				return IsCheckValidParanthesis(str,i+1,res,flag);
			}
			else
			{
				return false;
			}	
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="[([]])";
	   boolean res=IsCheckValidParanthesis(new StringBuilder(str), 0,new StringBuilder(),false);
	   System.out.println(res);
	   
		

	}

}
