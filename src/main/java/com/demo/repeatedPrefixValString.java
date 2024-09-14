package com.demo;

public class repeatedPrefixValString {
	public static String findRepeatingPrefix(String str) {
        int n = str.length();
        
        
        for (int i = 1; i <= n / 2; i++) {
            String prefix = str.substring(0, i);
            
            
            StringBuilder repeatedPrefix = new StringBuilder();
            while (repeatedPrefix.length() < n) {
            	System.out.println(prefix);
                repeatedPrefix.append(prefix);
            }
            if (repeatedPrefix.toString().equals(str)) {
                return prefix;
            }
        }
        return str;  // If no repeating prefix found, the entire string is the prefix
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1 = "abcabcabc";
        String str2 = "abcabc";
        //String prefix1 = findRepeatingPrefix(str1);
        String prefix2 = findRepeatingPrefix(str2);
        //System.out.println(prefix1);
        System.out.println(prefix2);

	}

}
